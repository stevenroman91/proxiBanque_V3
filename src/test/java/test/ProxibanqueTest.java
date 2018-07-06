package test;

import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

import fr.gtm.proxibanque.service.MethodeTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/test-dispatcher-servlet.xml"})

public class ProxibanqueTest {
	
	@Autowired
	MethodeTest app;
	
	//Un retrait en liquide ne dépasse pas la solde du compte débiteur
	@Test
	public void testLiquide() {
		assertThat(this.app.retraitEspeces(10, 295), containsString("solde insuffisant"));
	}
	
	//Un retrait en liquide ne dépasse pas la somme de 300
	@Test
	public void testRetraitMax() {
		assertThat(this.app.retraitEspeces(1, 350), containsString("Vous ne pouvez pas retirer un montant supérieur à 300"));
	}
	
	//Un retrait de carte pour un compte n’ayant pas encore de carte associée est validé immédiatement
	@Test
	public void testCarteComptePasDeCarte() {
		assertThat(this.app.retraitCarte(6, "Visa electron"), equalTo(null));
	}
	
	//Un retrait de carte pour un compte ayant déjà une carte associée est validé immédiatement si l’ancienne carte est expirée
	@Test
	public void testCarteExpire() {
		assertThat(this.app.retraitCarte(1, "Visa premium"), equalTo(null));
	}
	//Un retrait de carte pour un compte ayant déjà une carte associée  est refusé avec le message « Impossible d’effectuer le retrait, votre ancienne carte est encore valide »
	@Test
	public void testCarteEncoreValide() {
		assertThat(this.app.retraitCarte(4, "Visa premium"), equalTo("Impossible d’effectuer le retrait, votre ancienne carte est encore valide"));
	}
	
	//Un retrait de chéquier pour un compte ayant déjà un chéquier est validé immédiatement si le chéquier précédent a été reçu il y a au moins 3 mois

	@Test
	public void testRetraitChequierPlusDeTroisMois() {
		assertThat(this.app.retraitChequier(4), equalTo(null));
	}
	
	//Un retrait de chéquier pour un compte ayant déjà un chéquier est refusé avec le message « Impossible d’effectuer le retrait d’un nouveau chéquier pour ce compte avant le DATE_VALIDE » avec DATE_VALIDE la première date valide dans le temps pour retirer ce chéquier
	@Test
	public void testRetraitChequierMoinsDeTroisMois() {
		assertThat(this.app.retraitChequier(12), containsString("Impossible d’effectuer le retrait d’un nouveau chéquier pour ce compte avant le "));
	}
	
	

}
