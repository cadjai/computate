package org.computate.frFR.java;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

/**   
 * NomCanonique.enUS: org.computate.enUS.java.WritePageClass
 * 
 * enUS: For retrieving a Java class from Solr and writing the Java class to a file for each language. 
 * frFR: Pour récupérer une classe Java de Solr et écrire la classe Java dans un fichier pour chaque langue. 
 */  
public class EcrirePageClasse extends EcrireApiClasse {

	/**
	 * Var.enUS: classSimpleNamePage
	 */
	protected String classeNomSimplePage;

	/**
	 * Var.enUS: classSimpleNameGenPage
	 */
	protected String classeNomSimpleGenPage;

	/**
	 * Var.enUS: contextAName
	 */
	protected String contexteUnNom;

	/**
	 * Var.enUS: contextThis
	 */
	protected String contexteCe;

	/**
	 * Var.enUS: contextThisName
	 */
	protected String contexteCeNom;

	/**
	 * Var.enUS: contextA
	 */
	protected String contexteUn;

	/**
	 * Var.enUS: contextTheName
	 */
	protected String contexteLeNom;

	/**
	 * Var.enUS: contextNameSingular
	 */
	protected String contexteNomSingulier;

	/**
	 * Var.enUS: contextNamePlural
	 */
	protected String contexteNomPluriel;

	/**
	 * Var.enUS: contextActualName
	 */
	protected String contexteNomActuel;

	/**
	 * Var.enUS: contextAll
	 */
	protected String contexteTous;

	/**
	 * Var.enUS: contextAllName
	 */
	protected String contexteTousNom;

	/**
	 * Var.enUS: contextH1
	 */
	protected String contexteH1;

	/**
	 * Var.enUS: contextH2
	 */
	protected String contexteH2;

	/**
	 * Var.enUS: contextH3
	 */
	protected String contexteH3;

	/**
	 * Var.enUS: contextTitle
	 */
	protected String contexteTitre;

	/**
	 * Var.enUS: contextTheNames
	 */
	protected String contexteLesNoms;

	/**
	 * Var.enUS: contextNoneNameFound
	 */
	protected String contexteAucunNomTrouve;

	/**
	 * Var.enUS: contextNameVar
	 */
	protected String contexteNomVar;

	/**
	 * Var.enUS: contextOfName
	 */
	protected String contexteDeNom;

	/**
	 * Var.enUS: contextAdjective
	 */
	protected String contexteAdjectif;

	/**
	 * Var.enUS: contextAdjectivePlural
	 */
	protected String contexteAdjectifPluriel;

	/**
	 * Var.enUS: contextAdjectiveVar
	 */
	protected String contexteAdjectifVar;

	/**
	 * Var.enUS: contextANameAdjective
	 */
	protected String contexteUnNomAdjectif;

	/**
	 * Var.enUS: contextNameAdjectiveSingular
	 */
	protected String contexteNomAdjectifSingulier;

	/**
	 * Var.enUS: contextNameAdjectivePlural
	 */
	protected String contexteNomAdjectifPluriel;

	/**
	 * Var.enUS: contextColor
	 */
	protected String contexteCouleur;

	/**
	 * Var.enUS: contextIconGroup
	 */
	protected String contexteIconeGroupe;

	/**
	 * Var.enUS: contextIconName
	 */
	protected String contexteIconeNom;

	/**
	 * Var.enUS: classContext
	 */
	protected Boolean classeContexte;

	public void pageCodeClasseDebut(String langueNom) throws Exception {
//		o = auteurGenPageClasse;
//		l("package ", classeNomEnsemble, ";");
//		l();
//		if(classeImportationsGenPage.size() > 0) { 
//			for(String classeImportation : classeImportationsGenPage) {
//				l("import ", classeImportation, ";");
//			}
//			l();
//		}
//
//		tl(0, "");
//		ecrireCommentaire(classeCommentaire, 0); 
//		s("public class ", classeNomSimpleGenPage);
//		l(" {");
//		l();
//		tl(1, "private static final Logger LOGGER = LoggerFactory.getLogger(", classeNomSimpleGenPage, ".class);");
	}

	/**
	 * r: Ecrire: 
	 * r.enUS: Write: 
	 * r: auteurGenPageClasse
	 * r.enUS: writerGenPageClass
	 * r: auteurPageClasse
	 * r.enUS: writerPageClass
	 * r: auteurPageCss
	 * r.enUS: writerPageCss
	 * r: auteurPageJs
	 * r.enUS: writerPageJs
	 */
	public void pageCodeClasseFin(String langueNom) throws Exception {
//		o = auteurGenPageClasse;
//
//		s(wPageEntites.toString());
//		l();
//		tl(1, "public void pageGet", classeNomSimple, "(SiteContexte siteContexte) {");
//		tl(2, "OpenAPI3RouterFactory usineRouteur = siteContexte.getUsineRouteur_();");
//		l();
//		tl(2, "usineRouteur.addHandlerByOperationId(\"getPage", classeNomSimple, "\", contexteRoutage -> {");
//		Integer tBase = 0;
//		if(classeRolesTrouves) {
//			String requeteRole = classeRoles.get(0);
//			tBase = 6;
//			tl(3, "contexteRoutage.user().isAuthorized(\"", requeteRole, "\", authRes -> {");
//			tl(4, "try {");
//			tl(5, "if (authRes.result() == Boolean.TRUE) {");
//		}
//		else {
//			tBase = 4;
//			tl(3, "try {");
//		}
//		l();
//		tl(tBase, "contexteRoutage.response().putHeader(\"content-type\", \"application/json\").setChunked(true);");
//		tl(tBase, "RequeteSite requeteSite = genererRequeteSitePour", classeNomSimple, "(siteContexte, contexteRoutage);");
//		tl(tBase, "SolrQuery rechercheSolr = requeteSite.getRechercheSolr_();");
//		tl(tBase, "SolrDocumentList resultatsRecherche = requeteSite.getReponseRecherche().getResults();");
//		tl(tBase, "Integer rechercheLignes = rechercheSolr.getRows();");
//		l();
//		tl(tBase, "genererGetDebut", classeNomSimple, "(requeteSite);");
//		tl(tBase, "for(long i = resultatsRecherche.getStart(); i < resultatsRecherche.getNumFound(); i+=rechercheLignes) {");
//		tl(tBase + 1, "for(int j = 0; j < resultatsRecherche.size(); j++) {");
//		tl(tBase + 2, "long resultatIndice = i + j;");
//		tl(tBase + 2, "SolrDocument documentSolr = resultatsRecherche.get(j);");
//		tl(tBase + 2, "ResultatRecherche resultatRecherche = new ResultatRecherche();");
//		tl(tBase + 2, "resultatRecherche.setRequeteSite_(requeteSite);");
//		tl(tBase + 2, "resultatRecherche.setDocumentSolr(documentSolr);");
//		tl(tBase + 2, "resultatRecherche.setResultatIndice(resultatIndice);");
//		tl(tBase + 2, "genererGetIndividuel", classeNomSimple, "(resultatRecherche);");
//		tl(tBase + 1, "}");
//		tl(tBase, "}");
//		tl(tBase, "genererGetFin", classeNomSimple, "(requeteSite);");
//		tl(tBase, "requeteSite.getReponseServeur().end();");
//		if(classeRolesTrouves) {
//			tl(5, "}");
//			tl(5, "else {");
//			tl(6, "contexteRoutage.response().setStatusCode(HttpResponseStatus.UNAUTHORIZED.code()).end();");
//			tl(5, "}");
//			tl(4, "} catch(Exception e) {");
//			tl(5, "LOGGER.error(\"Error: \", e.getMessage());");
//			tl(5, "contexteRoutage.fail(e);");
//			tl(4, "}");
//			tl(3, "});");
//		}
//		else {
//			tl(3, "} catch(Exception e) {");
//			tl(4, "LOGGER.error(\"Error: \", e.getMessage());");
//			tl(4, "contexteRoutage.fail(e);");
//			tl(3, "}");
//		}
//		tl(2, "});");
//		tl(2, "usineRouteur.addFailureHandlerByOperationId(\"get", classeNomSimple, "\", contexteRoutage -> {");
//		tl(3, "Throwable failure = contexteRoutage.failure();");
//		tl(3, "if (failure instanceof ValidationException) {");
//		tl(4, "String validationErrorMessage = failure.getMessage();");
//		tl(4, "LOGGER.error(\"Error: \", validationErrorMessage);");
//		tl(4, "contexteRoutage.fail(failure);");
//		tl(3, "}");
//		tl(2, "});");
//		tl(1, "}");
//		l();
//		tl(1, "public void genererGetDebut", classeNomSimple, "(RequeteSite requeteSite) {");
//		tl(2, "HttpServerResponse reponseServeur = requeteSite.getReponseServeur();");
//		tl(2, "QueryResponse reponseRecherche = requeteSite.getReponseRecherche();");
//		tl(2, "reponseServeur.write(\"{\\n\");");
//		tl(2, "Long millisRecherche = Long.valueOf(reponseRecherche.getQTime());");
//		tl(2, "Long millisTransmission = reponseRecherche.getElapsedTime();");
//		tl(2, "Long numCommence = reponseRecherche.getResults().getStart();");
//		tl(2, "Long numTrouve = reponseRecherche.getResults().getNumFound();");
//		tl(2, "Integer numRetourne = reponseRecherche.getResults().size();");
//		tl(2, "String tempsRecherche = String.format(\"%d.%03d sec\", TimeUnit.MILLISECONDS.toSeconds(millisRecherche), TimeUnit.MILLISECONDS.toMillis(millisRecherche) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(millisRecherche)));");
//		tl(2, "String tempsTransmission = String.format(\"%d.%03d sec\", TimeUnit.MILLISECONDS.toSeconds(millisTransmission), TimeUnit.MILLISECONDS.toMillis(millisTransmission) - TimeUnit.SECONDS.toSeconds(TimeUnit.MILLISECONDS.toSeconds(millisTransmission)));");
//		tl(2, "Exception exceptionRecherche = reponseRecherche.getException();");
//		l();
//		tl(2, "reponseServeur.write(\"\\t\\\"numCommence\\\": \");");
//		tl(2, "reponseServeur.write(numCommence.toString());");
//		l();
//		tl(2, "reponseServeur.write(\",\\n\\t\\\"numTrouve\\\": \");");
//		tl(2, "reponseServeur.write(numTrouve.toString());");
//		l();
//		tl(2, "reponseServeur.write(\",\\n\\t\\\"numRetourne\\\": \");");
//		tl(2, "reponseServeur.write(numRetourne.toString());");
//		l();
//		tl(2, "reponseServeur.write(\",\\n\\t\\\"tempsRecherche\\\": \\\"\");");
//		tl(2, "reponseServeur.write(tempsRecherche);");
//		tl(2, "reponseServeur.write(\"\\\"\");");
//		l();
//		tl(2, "reponseServeur.write(\",\\n\\t\\\"tempsTransmission\\\": \\\"\");");
//		tl(2, "reponseServeur.write(tempsTransmission);");
//		tl(2, "reponseServeur.write(\"\\\"\");");
//		l();
//		tl(2, "if(exceptionRecherche != null) {");
//		tl(3, "reponseServeur.write(\",\\n\\t\\\"exceptionRecherche\\\": \\\"\");");
//		tl(3, "reponseServeur.write(exceptionRecherche.getMessage());");
//		tl(3, "reponseServeur.write(\"\\\"\");");
//		tl(2, "}");
//		l();
//		tl(2, "reponseServeur.write(\",\\n\\t\\\"resultats\\\": [\\n\");");
//		tl(1, "}");
//		l();
//		tl(1, "public void genererGetIndividuel", classeNomSimple, "(ResultatRecherche resultatRecherche) throws Exception {");
//		tl(2, "RequeteSite requeteSite = resultatRecherche.getRequeteSite_();");
//		tl(2, "SolrDocument documentSolr = resultatRecherche.getDocumentSolr();");
//		tl(2, "Long resultatIndice = resultatRecherche.getResultatIndice();");
//		tl(2, "HttpServerResponse reponseServeur = requeteSite.getReponseServeur();");
//		tl(2, "reponseServeur.write(\"\\t\\t\");");
//		tl(2, "if(resultatIndice > 0)");
//		tl(3, "reponseServeur.write(\", \");");
//		tl(2, "reponseServeur.write(\"{\\n\");");
//		tl(2, "Collection<String> champNoms = documentSolr.getFieldNames();");
//		tl(2, "Integer j = 0;");
//		tl(2, "for(String champNomStocke : champNoms) {");
//		tl(3, "Collection<Object> champValeurs = documentSolr.getFieldValues(champNomStocke);");
//		tl(3, "j = genererGet", classeNomSimple, "(j, resultatRecherche, champNomStocke, champValeurs);");
//		tl(2, "}");
//		tl(2, "reponseServeur.write(\"\\t\\t}\\n\");");
//		tl(1, "}");
//		l();
//		tl(1, "public void genererGetFin", classeNomSimple, "(RequeteSite requeteSite) {");
//		tl(2, "HttpServerResponse reponseServeur = requeteSite.getReponseServeur();");
////		tl(2, "if(exceptionRecherche != null) {");
////		l();
////		tl(4, "reponseServeur.write(\"\\t\\t}\\n\");");
////		tl(3, "}");
////		tl(2, "}");
//		tl(2, "reponseServeur.write(\"\\t]\\n\");");
//		tl(2, "reponseServeur.write(\"}\\n\");");
//		tl(1, "}");
////		tl(1, "@Override protected void doGet(HttpServerRequest requeteServeur, HttpServerResponse reponseServeur) throws ServletException, IOException {");
//		l();
//		tl(1, "public String varIndexe", classeNomSimple, "(String entiteVar) throws Exception {");
//		tl(2, "switch(entiteVar) {");
//		s(wPageGet.toString());
//		tl(3, "default:");
//		tl(4, "throw new Exception(String.format(\"\\\"%s\\\" n'est pas une entité indexé. \", entiteVar));");
//		tl(2, "}");
//		tl(1, "}");
//		l();
//		tl(1, "public SolrQuery genererRecherche", classeNomSimple, "(HttpServerRequest requeteServeur) throws Exception {");
//		tl(2, "String entiteVar = null;");
//		tl(2, "String valeurIndexe = null;");
//		tl(2, "String varIndexe = null;");
//		tl(2, "String valeurTri = null;");
//		tl(2, "Integer rechercheDebut = null;");
//		tl(2, "Integer rechercheNum = null;");
//		tl(2, "SolrQuery rechercheSolr = new SolrQuery();");
//		tl(2, "rechercheSolr.setQuery(\"*:*\");");
//		tl(2, "rechercheSolr.setRows(1000000);");
//		tl(2, "rechercheSolr.addSort(\"partNumero_indexed_int\", ORDER.asc);");
//		tl(2, "MultiMap paramMap = requeteServeur.params();");
//		tl(2, "for(String paramCle : paramMap.names()) {");
//		tl(3, "List<String> paramValeurs = paramMap.getAll(paramCle);");
//		tl(3, "for(String paramValeur : paramValeurs) {");
//		tl(4, "switch(paramCle) {");
//
//		tl(5, "case \"q\":");
//		tl(6, "entiteVar = StringUtils.trim(StringUtils.substringBefore(paramValeur, \":\"));");
//		tl(6, "valeurIndexe = StringUtils.trim(StringUtils.substringAfter(paramValeur, \":\"));");
//		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
//		tl(6, "rechercheSolr.setQuery(varIndexe + \":\" + ClientUtils.escapeQueryChars(valeurIndexe));");
//		tl(6, "break;");
//
//		tl(5, "case \"fq\":");
//		tl(6, "entiteVar = StringUtils.trim(StringUtils.substringBefore(paramValeur, \":\"));");
//		tl(6, "valeurIndexe = StringUtils.trim(StringUtils.substringAfter(paramValeur, \":\"));");
//		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
//		tl(6, "rechercheSolr.addFilterQuery(varIndexe + \":\" + ClientUtils.escapeQueryChars(valeurIndexe));");
//		tl(6, "break;");
//
//		tl(5, "case \"sort\":");
//		tl(6, "entiteVar = StringUtils.trim(StringUtils.substringBefore(paramValeur, \" \"));");
//		tl(6, "valeurTri = StringUtils.trim(StringUtils.substringAfter(paramValeur, \" \"));");
//		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
//		tl(6, "rechercheSolr.addSort(varIndexe, ORDER.valueOf(valeurTri));");
//		tl(6, "break;");
//
//		tl(5, "case \"fl\":");
//		tl(6, "entiteVar = StringUtils.trim(paramValeur);");
//		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
//		tl(6, "rechercheSolr.addField(varIndexe);");
//		tl(6, "break;");
//
//		tl(5, "case \"start\":");
//		tl(6, "rechercheDebut = Integer.parseInt(paramValeur);");
//		tl(6, "rechercheSolr.setStart(rechercheDebut);");
//		tl(6, "break;");
//
//		tl(5, "case \"rows\":");
//		tl(6, "rechercheNum = Integer.parseInt(paramValeur);");
//		tl(6, "rechercheSolr.setRows(rechercheNum);");
//		tl(6, "break;");
//
//		tl(4, "}");
//		tl(3, "}");
//		tl(2, "}");
//		tl(2, "return rechercheSolr;");
//		tl(1, "}");
//		l();
//		tl(1, "public RequeteSite genererRequeteSitePour", classeNomSimple, "(SiteContexte siteContexte, RoutingContext contexteItineraire) throws Exception {");
//		tl(2, "Vertx vertx = siteContexte.getVertx_();");
//		tl(2, "SolrQuery rechercheSolr = genererRecherche", classeNomSimple, "(contexteItineraire.request());");
//		l();
//		tl(2, "RequeteSite requeteSite = new RequeteSite();");
//		tl(2, "requeteSite.setVertx_(vertx);");
//		tl(2, "requeteSite.setContexteItineraire_(contexteItineraire);");
//		tl(2, "requeteSite.setSiteContexte_(siteContexte);");
//		tl(2, "requeteSite.setRechercheSolr_(rechercheSolr);");
//		tl(2, "requeteSite.initLoinRequeteSite(requeteSite);");
//		l();
//
//		tl(2, "UtilisateurSite utilisateurSite = new UtilisateurSite();");
//		tl(2, "utilisateurSite.initLoinUtilisateurSite(requeteSite);");
//		tl(2, "requeteSite.setUtilisateurSite(utilisateurSite);");
//		tl(2, "utilisateurSite.setRequeteSite_(requeteSite);");
//
//		tl(2, "return requeteSite;");
//		tl(1, "}");
//		l();
////		tl(1, "public Integer genererGet", classeNomSimple, "(Integer j, PrintWriter ecrivain, String entiteVarStocke, Collection<Object> champValeurs) throws Exception {");
//		tl(1, "public Integer genererGet", classeNomSimple, "(Integer j, ResultatRecherche resultatRecherche, String entiteVarStocke, Collection<Object> champValeurs) throws Exception {");
//		tl(2, "RequeteSite requeteSite = resultatRecherche.getRequeteSite_();");
//		tl(2, "HttpServerResponse reponseServeur = requeteSite.getReponseServeur();");
//		tl(2, "if(!champValeurs.isEmpty()) {");
//		tl(3, "Object champValeur = champValeurs.iterator().next();");
//		tl(3, "if(champValeur != null) {");
////		s(wPageGenererGet.toString());
//		tl(3, "}");
//		tl(2, "}");
//		tl(2, "return j;");
//		tl(1, "}");
//
//		////////////
//		// Erreur //
//		////////////
////		l();
////		tl(1, "public void genererErreur(RequeteSite requeteSite, Exception e) {");
////		tl(2, "e.printStackTrace();");
////		tl(2, "try {");
////		tl(3, "MimeMessage message = new MimeMessage(requeteSite.SiteContexte_.sessionCourriel);");
////		tl(3, "message.setFrom(new InternetAddress(requeteSite.configSite_.mailAdmin));");
////		tl(3, "InternetAddress destinaires[] = new InternetAddress[1];");
////		tl(3, "destinaires[0] = new InternetAddress(requeteSite.configSite_.mailAdmin);");
////		tl(3, "message.setRecipients(Message.RecipientType.TO, destinaires);");
////		tl(3, "String nomDomaine = requeteSite.configSite_.nomDomaine;");
////		tl(3, "String sujet = nomDomaine + \" erreur \" + \" \" + requeteSite.utilisateurNom + \" \" + requeteSite.requeteServeur.getRequestURI();");
////		tl(3, "String corps = ExceptionUtils.getStackTrace(e);");
////		tl(3, "message.setSubject(sujet);");
////		tl(3, "message.setContent(corps, \"text/plain\");");
////		tl(3, "Transport.send(message);");
////		tl(3, "String s = e.getMessage();");
////		tl(3, "requeteSite.getReponseServeur().sendError(500, s);");
////		tl(2, "} catch(Exception e2) {");
////		tl(3, "e.printStackTrace();");
////		tl(2, "}");
////		tl(1, "}");
//		tl(0, "}");
//
//		System.out.println("Ecrire: " + classeCheminGenPage); 
	}

	/**
	 * Var.enUS: pageCodeClass
	 * Param1.var.enUS: languageName
	 * r: Ecrire: 
	 * r.enUS: Write: 
	 * r: auteurGenPageClasse
	 * r.enUS: writerGenPageClass
	 * r: auteurPageClasse
	 * r.enUS: writerPageClass
	 * r: auteurPageCss
	 * r.enUS: writerPageCss
	 * r: auteurPageJs
	 * r.enUS: writerPageJs
	 * r: MiseEnPage
	 * r.enUS: PageLayout
	 * r: Couverture
	 * r.enUS: Wrap
	 * r: ListeRecherche
	 * r.enUS: SearchList
	 * r: initLoin
	 * r.enUS: initDeep
	 * r: classeNomEnsemble
	 * r.enUS: classPackageName
	 * r: classeImportationsGenPage
	 * r.enUS: classImportsGenPage
	 * r: classeImportation
	 * r.enUS: classImport
	 * r: classeCommentaire
	 * r.enUS: classComment
	 * r: classeNomSimple
	 * r.enUS: classSimpleName
	 * r: ecrireCommentaire
	 * r.enUS: writeComment
	 * r: clientSolrComputate
	 * r.enUS: solrClientComputate
	 * r: classeCheminAbsolu
	 * r.enUS: classAbsolutePath
	 * r: langueNom
	 * r.enUS: languageName
	 * r: entiteVarCapitalise
	 * r.enUS: entityVarCapitalized
	 * r: entiteVar
	 * r.enUS: entityVar
	 * r: entiteHtmlLigne
	 * r.enUS: entityHtmlRow
	 * r: entiteHtmlColonne
	 * r.enUS: entityHtmlColumn
	 * r: entiteHtml
	 * r.enUS: entityHtml
	 * r: entiteDescription
	 * r.enUS: entityDescription
	 * r: entiteNomAffichage
	 * r.enUS: entityDisplayName
	 * r: entiteMultiligne
	 * r.enUS: entityMultiline
	 * r: entiteClassesSuperEtMoiSansGen
	 * r.enUS: entitySuperClassesAndMeWithoutGen
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 * r: classeApiMethodes
	 * r.enUS: classApiMethods
	 * r: classeDoc
	 * r.enUS: classDoc
	 * r: contexteCouleur
	 * r.enUS: contextColor
	 * 
	 * r: contexteUnNom
	 * r.enUS: contextAName
	 * r: classeEntiteVars
	 * r.enUS: classEntityVars
	 * r: contexteIconeGroupe
	 * r.enUS: contextIconGroup
	 * r: contexteIconeNom
	 * r.enUS: contextIconName
	 * r: contexteCe
	 * r.enUS: contextThis
	 * r: contexteCeNom
	 * r.enUS: contextThisName
	 * r: contexteUn
	 * r.enUS: contextA
	 * r: contexteUnNom
	 * r.enUS: contextAName
	 * r: contexteLeNom
	 * r.enUS: contextTheName
	 * r: contexteNomSingulier
	 * r.enUS: contextNameSingular
	 * r: contexteNomPluriel
	 * r.enUS: contextNamePlural
	 * r: contexteNomActuel
	 * r.enUS: contextActualName
	 * r: contexteTous
	 * r.enUS: contextAll
	 * r: contexteTousNom
	 * r.enUS: contextAllName
	 * r: contexteLesNoms
	 * r.enUS: contextTheNames
	 * r: contexteAucunNomTrouve
	 * r.enUS: contextNoneNameFound
	 * r: contexteNomVar
	 * r.enUS: contextNameVar
	 * r: contexteDeNom
	 * r.enUS: contextOfName
	 * r: contexteNom
	 * r.enUS: contextName
	 * r: UnNomAdjectif
	 * r.enUS: ANameAdjective
	 * r: LeNomAdjectif
	 * r.enUS: TheNameAdjective
	 * r: AdjectifAvant
	 * r.enUS: AdjectiveBefore
	 * r: NomAdjectifSingulier
	 * r.enUS: NameAdjectiveSingular
	 * r: NomAdjectifPluriel
	 * r.enUS: NameAdjectivePlural
	 * r: PlurielNomAdjectif
	 * r.enUS: PluralNameAdjective
	 * r: SingulierNomAdjectif
	 * r.enUS: SingularNameAdjective
	 * r: LeNomAdjectif
	 * r.enUS: TheAdjectiveName
	 * r: UnNomAdjectif
	 * r.enUS: AnAdjectiveName
	 * r: AdjectifVar
	 * r.enUS: AdjectiveVar
	 * r: Adjectif
	 * r.enUS: Adjective
	 * r: CONTEXTE_UnMasculinVoyelle
	 * r.enUS: CONTEXT_AMaleVowel
	 * r: CONTEXTE_UnFemininVoyelle
	 * r.enUS: CONTEXT_AFemaleVowel
	 * r: CONTEXTE_UnMasculinConsonne
	 * r.enUS: CONTEXT_AMaleConsonant
	 * r: CONTEXTE_UnFemininConsonne
	 * r.enUS: CONTEXT_AFemaleConsonant
	 * r: CONTEXTE_CetMasculinVoyelle
	 * r.enUS: CONTEXT_ThisMaleVowel
	 * r: CONTEXTE_CetteFemininVoyelle
	 * r.enUS: CONTEXT_ThisFemaleVowel
	 * r: CONTEXTE_CeMasculinConsonne
	 * r.enUS: CONTEXT_ThisMaleConsonant
	 * r: CONTEXTE_CetteFemininConsonne
	 * r.enUS: CONTEXT_ThisFemaleConsonant
	 * r: CONTEXTE_CesPluriel
	 * r.enUS: CONTEXT_ThesePlural
	 * r: CONTEXTE_LMasculinVoyelle
	 * r.enUS: CONTEXT_TheMaleVowel
	 * r: CONTEXTE_LFemininVoyelle
	 * r.enUS: CONTEXT_TheFemaleVowel
	 * r: CONTEXTE_LeMasculinConsonne
	 * r.enUS: CONTEXT_TheMaleConsonant
	 * r: CONTEXTE_LaFemininConsonne
	 * r.enUS: CONTEXT_TheFemaleConsonant
	 * r: CONTEXTE_LesPluriel
	 * r.enUS: CONTEXT_ThePlural
	 * r: CONTEXTE_ActuelMasculinAvant
	 * r.enUS: CONTEXT_CurrentMaleBefore
	 * r: CONTEXTE_ActuelleFemininAvant
	 * r.enUS: CONTEXT_CurrentFemaleBefore
	 * r: CONTEXTE_ActuelMasculinApres
	 * r.enUS: CONTEXT_CurrentMaleAfter
	 * r: CONTEXTE_ActuelleFemininApres
	 * r.enUS: CONTEXT_CurrentFemaleAfter
	 * r: CONTEXTE_TousMasculinPluriel
	 * r.enUS: CONTEXT_AllMalePlural
	 * r: CONTEXTE_ToutesFemininPluriel
	 * r.enUS: CONTEXT_AllFemalePlural
	 * r: CONTEXTE_AucunTrouveMasculinAvant
	 * r.enUS: CONTEXT_NoneFoundMaleBefore
	 * r: CONTEXTE_AucuneTrouveFemininAvant
	 * r.enUS: CONTEXT_NoneFemaleBefore
	 * r: CONTEXTE_AucunTrouveMasculinApres
	 * r.enUS: CONTEXT_NoneFoundMaleAfter
	 * r: CONTEXTE_AucuneTrouveFemininApres
	 * r.enUS: CONTEXT_NoneFemaleAfter
	 * r: CONTEXTE_DVoyelle
	 * r.enUS: CONTEXT_OfVowel
	 * r: CONTEXTE_DeConsonne
	 * r.enUS: CONTEXT_OfConsonant
	 * r: CONTEXTE_AdjectifPluriel
	 * r.enUS: CONTEXT_AdjectivePlural
	 * r: rechercheLigneActuel
	 * r.enUS: searchLineActual
	 * r: rechercheLigne
	 * r.enUS: searchLine
	 * r: entiteNomSimple
	 * r.enUS: entitySimpleName
	 * r: entiteNomSimpleGenerique
	 * r.enUS: entitySimpleNameGeneric
	 * r: entiteNomSimpleComplet
	 * r.enUS: entitySimpleNameComplete
	 * r: methodeTitre
	 * r.enUS: methodTitle
	 * r: DD/MM/YYYY
	 * r.enUS: MM/DD/YYYY
	 * r: dd/MM/yyyy
	 * r.enUS: MM/dd/yyyy
	 * r: h'h'mm
	 * r.enUS: h:mm a
	 * r: fr-FR
	 * r.enUS: en-US
	 * r: contexteIconeClassesCss
	 * r.enUS: contextIconCssClasses
	 * r: pageTitre
	 * r.enUS: pageTitle
	 * r: PageTitre
	 * r.enUS: PageTitle
	 * r: contexteH1
	 * r.enUS: contextH1
	 * r: contexteH2
	 * r.enUS: contextH2
	 * r: contexteH3
	 * r.enUS: contextH3
	 * r: contexteTitre
	 * r.enUS: contextTitle
	 * r: classeApiUri
	 * r.enUS: classApiUri
	 * 
	 * r: liste
	 * r.enUS: list
	 * r: plusiers
	 * r.enUS: multiple
	 * r: Créer 
	 * r.enUS: Create 
	 * r: Modifier 
	 * r.enUS: Modify 
	 * r: Remplacer 
	 * r.enUS: Replace 
	 * r: Supprimer 
	 * r.enUS: Delete 
	 * r: valeur
	 * r.enUS: value
	 * r: filtre
	 * r.enUS: filter
	 * r: Recherche
	 * r.enUS: Search
	 * r: Entite
	 * r.enUS: Entity
	 * r: plusiers 
	 * r.enUS: multiple 
	 */ 
	public void pageCodeClasse(String langueNom) throws Exception {
		for(String classePageMethode : classeApiMethodes) {

			String classePageCheminGen = (String)doc.get("classePageCheminGen" + classePageMethode + "_" + langueNom + "_stored_string");
			String classePageChemin = (String)doc.get("classePageChemin" + classePageMethode + "_" + langueNom + "_stored_string");
			String classePageCheminCss = (String)doc.get("classePageCheminCss" + classePageMethode + "_" + langueNom + "_stored_string");
			String classePageCheminJs = (String)doc.get("classePageCheminJs" + classePageMethode + "_" + langueNom + "_stored_string");
			String classePageUriMethode = (String)classeDoc.get("classeApiUri" + classePageMethode + "_frFR_stored_string");
	
			if(classePageCheminGen != null) {
			
				File classePageFichierGen = null;
				File classePageFichier = null;
				File classePageFichierCss = null;
				File classePageFichierJs = null;

				if(classePageCheminGen != null)
					classePageFichierGen = new File(classePageCheminGen);
				if(classePageChemin != null)
					classePageFichier = new File(classePageChemin);
				if(classePageCheminCss != null)
					classePageFichierCss = new File(classePageCheminCss);
				if(classePageCheminJs != null)
					classePageFichierJs = new File(classePageCheminJs);
			
				ToutEcrivain auteurPageGenClasse = null;
				ToutEcrivain auteurPageClasse = null;
				ToutEcrivain auteurPageCss = null;
				ToutEcrivain auteurPageJs = null;

				if(classePageFichierGen != null)
					auteurPageGenClasse = ToutEcrivain.create(classePageFichierGen);
				if(classePageFichier != null && !classePageFichier.exists())
					auteurPageClasse = ToutEcrivain.create(classePageFichier);
				if(classePageFichierCss != null)
					auteurPageCss = ToutEcrivain.create(classePageFichierCss);
				if(classePageFichierJs != null)
					auteurPageJs = ToutEcrivain.create(classePageFichierJs);

				Boolean pageH1 = false;
				Boolean pageH2 = false;
				Boolean pageH3 = false;
				Boolean pageTitre = false;
	
				ToutEcrivain wRecherche = ToutEcrivain.create();
				ToutEcrivain wPOST = ToutEcrivain.create();
				ToutEcrivain wPATCH = ToutEcrivain.create();
				ToutEcrivain wTh = ToutEcrivain.create();
				ToutEcrivain wTd = ToutEcrivain.create();
				ToutEcrivain wForm = ToutEcrivain.create();
				ToutEcrivain wEntites = ToutEcrivain.create();
	
				o = auteurPageGenClasse;
				{
					SolrQuery rechercheSolr = new SolrQuery();   
					rechercheSolr.setQuery("*:*");
					rechercheSolr.setRows(1000000);
					String fqClassesSuperEtMoi = "(" + entiteClassesSuperEtMoiSansGen.stream().map(c -> ClientUtils.escapeQueryChars(c)).collect(Collectors.joining(" OR ")) + ")";
					rechercheSolr.addFilterQuery("partEstEntite_indexed_boolean:true");
					rechercheSolr.addFilterQuery("entiteNomCanonique_indexed_string:" + fqClassesSuperEtMoi);
					rechercheSolr.addSort("entiteHtmlLigne_indexed_int", ORDER.asc);
					rechercheSolr.addSort("entiteHtmlCellule_indexed_int", ORDER.asc);
					QueryResponse rechercheReponse = clientSolrComputate.query(rechercheSolr);
					SolrDocumentList rechercheListe = rechercheReponse.getResults();
					Integer rechercheLignes = rechercheSolr.getRows();
					Integer rechercheLigne = -1;
					Integer rechercheLigneActuel;
					List<String> pageVars = Arrays.asList("pageH1", "pageH2", "pageH3", "pageTitre");
	
					if(rechercheListe.size() > 0) {
						for(Long i = rechercheListe.getStart(); i < rechercheListe.getNumFound(); i+=rechercheLignes) {
							for(Integer j = 0; j < rechercheListe.size(); j++) {
								SolrDocument entiteDocumentSolr = rechercheListe.get(j);
								String entiteVar = (String)entiteDocumentSolr.get("entiteVar_" + langueNom + "_stored_string");
								String entiteVarCapitalise = (String)entiteDocumentSolr.get("entiteVarCapitalise_" + langueNom + "_stored_string");
								String entiteNomSimple = (String)entiteDocumentSolr.get("entiteNomSimple_" + langueNom + "_stored_string");
								String entiteNomSimpleGenerique = (String)entiteDocumentSolr.get("entiteNomSimpleGenerique_" + langueNom + "_stored_string");
								String entiteNomSimpleComplet = (String)entiteDocumentSolr.get("entiteNomSimpleComplet_" + langueNom + "_stored_string");
								String entiteDescription = (String)entiteDocumentSolr.get("entiteDescription_" + langueNom + "_stored_string");
								String entiteNomAffichage = (String)entiteDocumentSolr.get("entiteNomAffichage_" + langueNom + "_stored_string");
								Boolean entiteHtml = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteHtml_stored_boolean"));
								Boolean entiteMultiligne = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteMultiligne_stored_boolean"));
								Boolean entiteCouverture = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteCouverture_stored_boolean"));
	
								if(pageVars.contains(entiteVar)) {
									if(entiteCouverture) {
										if("pageH1".equals(entiteVar)) {
											pageH1 = true;
										}
										else if("pageH2".equals(entiteVar)) {
											pageH2 = true;
										}
										else if("pageH3".equals(entiteVar)) {
											pageH3 = true;
										}
										else if("pageTitre".equals(entiteVar)) {
											pageTitre = true;
										}
										else {
											wEntites.l();
											wEntites.t(1, "@Override protected void _", entiteVar, "(");
											if(entiteCouverture)
												wEntites.s("Couverture<", entiteNomSimpleComplet, "> c");
											else
												wEntites.s(entiteNomSimpleComplet, " o");
											wEntites.l(") {");
											wEntites.tl(2, "if(", StringUtils.uncapitalize(classeNomSimple), " != null)");
											wEntites.tl(3, "c.o(", StringUtils.uncapitalize(classeNomSimple), ".get", entiteVarCapitalise, "()", ");");
											wEntites.tl(1, "}");
										}
									}
								}
	
								if(entiteHtml) {
									rechercheLigneActuel = ObjectUtils.defaultIfNull((Integer)entiteDocumentSolr.get("entiteHtmlLigne_stored_int"), 0);
									if(rechercheLigne != rechercheLigneActuel) {
										if(rechercheLigne != -1)
											wForm.t(2).bgl("div");
										wForm.t(2).be("div").da("class", "w3-cell-row ").dfl();
										rechercheLigne = rechercheLigneActuel;
									}
									wForm.t(3).be("div").da("class", "w3-cell w3-cell-middle w3-center w3-mobile ").dfl();
									if("LocalDate".equals(entiteNomSimple)) {
										wForm.tl(4, entiteNomSimpleComplet, " val = o.get", entiteVarCapitalise, "();");
										l();
										if(entiteNomAffichage != null) {
											wForm.t(4).e("label").da("class", "").df().dsx(entiteNomAffichage).dgl("label");
										}
										wForm.t(4).e("input").l();
										wForm.t(5).dal("type", "text");
										wForm.t(5).dal("class", "w3-input w3-border datepicker ");
										wForm.t(5).dal("placeholder", "DD/MM/YYYY");
										wForm.t(5).dal("data-timeformat", "DD/MM/YYYY");
										wForm.t(5).dal("onclick", "enleverLueur($(this)); ");
										if(entiteDescription != null)
											wForm.t(5).dal("title", entiteDescription + " (DD/MM/YYYY)");
										wForm.tl(5, ".a(\"value\", val == null ? \"\" : DateTimeFormatter.ofPattern(\"dd/MM/yyyy\", Locale.forLanguageTag(\"fr-FR\")).format(val))");
										wForm.t(5).s(".a(\"onchange\", \"");
											wForm.s("var t = moment(this.value, 'DD/MM/YYYY'); ");
											wForm.s("if(t) { ");
												wForm.s("var s = t.format('YYYY-MM-DD'); ");
												wForm.s("$(this).next().val(s); ");
												wForm.s("$(this).next().trigger('change'); ");
											wForm.s("} ");
										wForm.l("\")");
										wForm.tl(5, ".fg();");
		
										wForm.t(4).e("input").l();
										wForm.t(5).dal("class", "valeur", entiteVarCapitalise);
										wForm.t(5).dal("name", entiteVar);
										wForm.t(5).dal("type", "hidden");
										wForm.t(5).dal("onchange", "envoyer(); ");
										wForm.tl(5, ".a(\"value\", o.str", entiteVarCapitalise, "())");
										wForm.t(4).dfgl();
									}
									else if("LocalDateTime".equals(entiteNomSimple)) {
										wForm.tl(4, entiteNomSimpleComplet, " val = o.get", entiteVarCapitalise, "();");
										wForm.l();
										if(entiteNomAffichage != null) {
											wForm.t(4).e("label").da("class", "").df().dsx(entiteNomAffichage).dgl("label");
										}
										wForm.t(4).e("input").l();
										wForm.t(5).dal("type", "text");
										wForm.t(5).dal("class", "w3-input w3-border datepicker ");
										wForm.t(5).dal("placeholder", "DD/MM/YYYY");
										wForm.t(5).dal("data-timeformat", "DD/MM/YYYY");
										wForm.t(5).dal("onclick", "enleverLueur($(this)); ");
										if(entiteDescription != null)
											wForm.t(5).dal("title", entiteDescription + " (DD/MM/YYYY)");
										wForm.tl(5, ".a(\"value\", val == null ? \"\" : DateTimeFormatter.ofPattern(\"dd/MM/yyyy\", Locale.forLanguageTag(\"fr-FR\")).format(val))");
										wForm.t(5).s(".a(\"onchange\", \"");
											wForm.s("var t = moment(this.value, 'DD/MM/YYYY'); ");
											wForm.s("if(t) { ");
												wForm.s("var s = t.format('YYYY-MM-DD'); ");
												wForm.s("$(this).next().val(s); ");
												wForm.s("$(this).next().trigger('change'); ");
											wForm.s("} ");
										wForm.l("\")");
										wForm.tl(5, ".fg();");
		
										wForm.t(4).e("input").l();
										wForm.t(5).dal("type", "hidden");
										wForm.t(5).dal("class", "valeur", entiteVarCapitalise);
										wForm.t(5).dal("name", entiteVar);
										wForm.t(5).dal("onchange", "envoyer(); ");
										wForm.tl(5, ".a(\"value\", o.str", entiteVarCapitalise, "())");
										wForm.t(4).dfgl();
									}
									else if("LocalTime".equals(entiteNomSimple)) {
										wForm.tl(4, entiteNomSimpleComplet, " val = o.get", entiteVarCapitalise, "();");
										wForm.l();
										if(entiteNomAffichage != null) {
											wForm.t(4).e("label").da("class", "").df().dsx(entiteNomAffichage).dgl("label");
										}
										wForm.t(4).e("input").l();
										wForm.t(5).dal("type", "text");
										wForm.t(5).dal("class", "w3-input w3-border timepicker ");
										wForm.t(5).dal("placeholder", "HH:MM AM");
										wForm.t(5).dal("onclick", "enleverLueur($(this)); ");
										if(entiteDescription != null)
											wForm.t(5).da("title", entiteDescription + " (h'h'mm)");
										wForm.tl(5, ".a(\"value\", val == null ? \"\" : DateTimeFormatter.ofPattern(\"dd/MM/yyyy\", Locale.forLanguageTag(\"fr-FR\")).format(val))");
										wForm.t(5).s(".a(\"onchange\", \"");
											wForm.s("var t = parseTime(this.value); ");
											wForm.s("if(t) { ");
												wForm.s("var s = dateFormat(t, \"'h'MM\"); ");
												wForm.s("$(this).next().val(s); ");
												wForm.s("$(this).next().trigger('change'); ");
											wForm.s("} ");
										wForm.l("\")");
										wForm.tl(5, ".fg();");
		
										wForm.t(4).e("input").l();
										wForm.t(5).dal("type", "hidden");
										wForm.t(5).dal("class", "valeur", entiteVarCapitalise);
										wForm.t(5).dal("name", entiteVar);
										wForm.t(5).dal("onchange", "envoyer(); ");
										wForm.tl(5, ".a(\"value\", val == null ? \"\" : o.str", entiteVarCapitalise, "())");
										wForm.t(4).dfgl();
									}
									else if("Boolean".equals(entiteNomSimple)) {
										wForm.t(4).e("input").l();
										wForm.t(5).dal("type", "hidden");
										wForm.t(5).dal("name", entiteVar);
										wForm.t(5).dal("value", "false");
										wForm.t(4).dfgl();
										wForm.l();
										wForm.t(4).e("input").l();
										wForm.t(5).dal("type", "checkbox");
										wForm.t(5).dal("class", "valeur", entiteVarCapitalise);
										wForm.t(5).dal("name", entiteVar);
										wForm.t(5).dal("value", "true");
										wForm.t(5).da("onchange", "envoyer(); ").l(";");
										wForm.tl(5, "if(o.get", entiteVarCapitalise, "() != null && o.get", entiteVarCapitalise, "())");
										wForm.t(6).a("checked", "checked").l(";");
										wForm.t(4).fgl();
										wForm.l();
										if(entiteNomAffichage != null) {
											wForm.t(4).e("label").da("class", "").df().dsx(entiteNomAffichage).dgl("label");
										}
									}
									else {
										if(entiteNomAffichage != null) {
											wForm.t(4).e("label").da("class", "").df().dsx(entiteNomAffichage).dgl("label");
										}
										wForm.l();
										if(entiteMultiligne)
											wForm.t(4).e("textarea").l();
										else
											wForm.t(4).e("input").l().t(7).dal("type", "text");
		
										wForm.t(5).dal("class", "valeur", entiteVarCapitalise);
										wForm.t(5).dal("name", entiteVar);
										wForm.t(5).dal("class", "w3-input w3-border ");
										if(entiteNomAffichage != null) {
											wForm.t(5).dal("placeholder", entiteNomAffichage);
										}
										if(entiteDescription != null) {
											wForm.t(5).dal("title", entiteDescription);
										}
										wForm.t(5).dal("onchange", "envoyer(); ");
										wForm.t(4).dfgl();
										wForm.l();
									}
		
						//			if().da("class", objets).da("class", "w3-cell w3-cell-middle w3-center w3-mobile ").dfl();
									wForm.t(3).bgl("div");
								}
							}
							rechercheSolr.setStart(i.intValue() + rechercheLignes);
							rechercheReponse = clientSolrComputate.query(rechercheSolr);
							rechercheListe = rechercheReponse.getResults();
						}
						wForm.t(2).bgl("div");
					}
				}
	
				wEntites.l();
				wEntites.tl(1, "@Override protected void _pageH1(Couverture<String> c) {");
				if(pageH1) {
					wEntites.tl(2, "if(", StringUtils.uncapitalize(classeNomSimple), " != null && ", StringUtils.uncapitalize(classeNomSimple), ".getPageH1() != null)");
					wEntites.tl(3, "c.o(", StringUtils.uncapitalize(classeNomSimple), ".getPageH1()", ");");
					wEntites.tl(2, "else if(", StringUtils.uncapitalize(classeNomSimple), " != null)");
				} else {
					wEntites.tl(2, "if(", StringUtils.uncapitalize(classeNomSimple), " != null)");
				}
				wEntites.tl(3, "c.o(", q(contexteUnNom), ");");
				wEntites.tl(2, "else if(liste", classeNomSimple, ".size() == 0)");
				wEntites.tl(3, "c.o(", q(contexteAucunNomTrouve), ");");
				if(contexteH1 != null) {
					wEntites.tl(2, "else");
					wEntites.tl(3, "c.o(", q(contexteH1), ");");
				}
				wEntites.tl(1, "}");
	
				wEntites.l();
				wEntites.tl(1, "@Override protected void _pageH2(Couverture<String> c) {");
				if(pageH2) {
					wEntites.tl(2, "if(", StringUtils.uncapitalize(classeNomSimple), " != null && ", StringUtils.uncapitalize(classeNomSimple), ".getPageH2() != null)");
					wEntites.tl(3, "c.o(", StringUtils.uncapitalize(classeNomSimple), ".getPageH2()", ");");
					if(contexteH2 != null) {
						wEntites.tl(2, "else");
						wEntites.tl(3, "c.o(", q(contexteH2), ");");
					}
				} else {
					wEntites.tl(2, "c.o(", q(contexteH3), ");");
				}
				wEntites.tl(1, "}");
	
				wEntites.l();
				wEntites.tl(1, "@Override protected void _pageH3(Couverture<String> c) {");
				if(pageH3) {
					wEntites.tl(2, "if(", StringUtils.uncapitalize(classeNomSimple), " != null && ", StringUtils.uncapitalize(classeNomSimple), ".getPageH3() != null)");
					wEntites.tl(3, "c.o(", StringUtils.uncapitalize(classeNomSimple), ".getPageH3()", ");");
					if(contexteH3 != null) {
						wEntites.tl(2, "else");
						wEntites.tl(3, "c.o(", q(contexteH3), ");");
					}
				} else {
					wEntites.tl(2, "c.o(", q(contexteH3), ");");
				}
				wEntites.tl(1, "}");
	
				wEntites.l();
				wEntites.tl(1, "@Override protected void _pageTitre(Couverture<String> c) {");
				if(pageTitre) {
					wEntites.tl(2, "if(", StringUtils.uncapitalize(classeNomSimple), " != null && ", StringUtils.uncapitalize(classeNomSimple), ".getPageTitre() != null)");
					wEntites.tl(3, "c.o(", StringUtils.uncapitalize(classeNomSimple), ".getPageTitre()", ");");
					wEntites.tl(2, "else if(", StringUtils.uncapitalize(classeNomSimple), " != null)");
				} else {
					wEntites.tl(2, "if(", StringUtils.uncapitalize(classeNomSimple), " != null)");
				}
				wEntites.tl(3, "c.o(", q(contexteUnNom), ");");
				wEntites.tl(2, "else if(liste", classeNomSimple, ".size() == 0)");
				wEntites.tl(3, "c.o(", q(contexteAucunNomTrouve), ");");
				if(contexteTitre != null) {
					wEntites.tl(2, "else");
					wEntites.tl(3, "c.o(", q(contexteTitre), ");");
				}
				wEntites.tl(1, "}");
		
				if(auteurPageClasse != null) {
					auteurPageClasse.l("package ", classeNomEnsemble, ";");
					auteurPageClasse.l();
					auteurPageClasse.tl(0, "");
					auteurPageClasse.s("public class ", classeNomSimple, "Page");
					auteurPageClasse.s(" extends ", classeNomSimple, "PageGen<", classeNomSimple, "GenPage>");
					auteurPageClasse.l(" {");
					auteurPageClasse.tl(0, "}");
				}

				l("package ", classeNomEnsemble, ";");
				l();
				if(classeImportationsGenPage.size() > 0) { 
					for(String classeImportation : classeImportationsGenPage) {
						l("import ", classeImportation, ";");
					}
					l();
				}
		
				tl(0, "");
				ecrireCommentaire(classeCommentaire, 0); 
				s("public class ", classeNomSimple, "GenPage");
				s(" extends ", classeNomSimple, "GenPageGen<MiseEnPage>");
				l(" {");
				l();
				tl(1, "/**");
				tl(1, " * {@inheritDoc}");
				tl(1, " * ");
				tl(1, " **/");
				tl(1, "protected void _liste", classeNomSimple, "(Couverture<ListeRecherche<", classeNomSimple, ">> c) {");
				tl(1, "}");
				l();
				tl(1, "protected void _", StringUtils.uncapitalize(classeNomSimple), "(", "Couverture<", classeNomSimple, "> c", ") {");
				tl(2, "if(liste", classeNomSimple, ".size() == 1)");
				tl(3, "c.o(liste", classeNomSimple, ".get(0)", ");");
				tl(1, "}");
				s(wEntites);
	
				if(StringUtils.isNotBlank(contexteIconeGroupe)) {
					l();
					tl(1, "@Override protected void _contexteIconeGroupe(Couverture<String> c) {");
					tl(3, "c.o(", q(contexteIconeGroupe), ");");
					tl(1, "}");
				}
	
				if(StringUtils.isNotBlank(contexteIconeNom)) {
					l();
					tl(1, "@Override protected void _contexteIconeNom(Couverture<String> c) {");
					tl(3, "c.o(", q(contexteIconeNom), ");");
					tl(1, "}");
				}
	
				l();
				tl(1, "@Override public void initLoin", classeNomSimple, "GenPage() {");
				tl(2, "init", classeNomSimple, "GenPage();");
				tl(2, "super.initLoinMiseEnPage();");
				tl(1, "}");
				l();
				tl(1, "@Override public void htmlScripts", classeNomSimple, "GenPage() {");
				t(2).e("script").da("src", "/static/js/", classeNomSimple, "Page.js").df().dgl("script");
				tl(1, "}");
	
				if(StringUtils.isNotBlank(classeApiUri)) {
					l();
					tl(1, "protected void _pageUri", classeNomSimple, "(Couverture<String> c) {");
					tl(3, "c.o(", q(classePageUriMethode), ");");
					tl(1, "}");
				}
	
				{
					SolrQuery rechercheSolr = new SolrQuery();   
					rechercheSolr.setQuery("*:*");
					rechercheSolr.setRows(1000000);
					String fqClassesSuperEtMoi = "(" + entiteClassesSuperEtMoiSansGen.stream().map(c -> ClientUtils.escapeQueryChars(c)).collect(Collectors.joining(" OR ")) + ")";
					rechercheSolr.addFilterQuery("partEstEntite_indexed_boolean:true");
					rechercheSolr.addFilterQuery("entiteNomCanonique_indexed_string:" + fqClassesSuperEtMoi);
					rechercheSolr.addFilterQuery("entiteHtmlColonne_indexed_double:[* TO *]");
					rechercheSolr.addSort("entiteHtmlColonne_indexed_double", ORDER.asc);
					QueryResponse rechercheReponse = clientSolrComputate.query(rechercheSolr);
					SolrDocumentList rechercheListe = rechercheReponse.getResults();
					Integer rechercheLignes = rechercheSolr.getRows();
					Integer rechercheLigne = -1;
					Integer rechercheLigneActuel;
		
					if(rechercheListe.size() > 0) {
						for(Long i = rechercheListe.getStart(); i < rechercheListe.getNumFound(); i+=rechercheLignes) {
							for(Integer j = 0; j < rechercheListe.size(); j++) {
								SolrDocument entiteDocumentSolr = rechercheListe.get(j);
								String entiteVar = (String)entiteDocumentSolr.get("entiteVar_" + langueNom + "_stored_string");
								String entiteVarCapitalise = (String)entiteDocumentSolr.get("entiteVarCapitalise_" + langueNom + "_stored_string");
								String entiteNomSimple = (String)entiteDocumentSolr.get("entiteNomSimple_" + langueNom + "_stored_string");
								String entiteNomSimpleGenerique = (String)entiteDocumentSolr.get("entiteNomSimpleGenerique_" + langueNom + "_stored_string");
								String entiteNomSimpleComplet = (String)entiteDocumentSolr.get("entiteNomSimpleComplet_" + langueNom + "_stored_string");
								String entiteDescription = (String)entiteDocumentSolr.get("entiteDescription_" + langueNom + "_stored_string");
								String entiteNomAffichage = (String)entiteDocumentSolr.get("entiteNomAffichage_" + langueNom + "_stored_string");
								Boolean entiteHtml = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteHtml_stored_boolean"));
								Boolean entiteMultiligne = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteMultiligne_stored_boolean"));
								if(entiteHtml) {
									String jsVal = ".val()";
									if("Boolean".equals(entiteNomSimple)) {
										jsVal = ".prop('checked')";
									}
		
									wTh.tl(6, "e(\"th\").f().sx(", q(entiteNomAffichage), ").g(\"th\");");
		
									wTd.tl(7, "{ e(\"td\").f();");
									wTd.tl(8, "sx(o.get", entiteVarCapitalise, "());");
									wTd.tl(7, "} g(\"td\");");
								}
							}
							rechercheSolr.setStart(i.intValue() + rechercheLignes);
							rechercheReponse = clientSolrComputate.query(rechercheSolr);
							rechercheListe = rechercheReponse.getResults();
						}
					}
				}
	
				{
					SolrQuery rechercheSolr = new SolrQuery();   
					rechercheSolr.setQuery("*:*");
					rechercheSolr.setRows(1000000);
					String fqClassesSuperEtMoi = "(" + entiteClassesSuperEtMoiSansGen.stream().map(c -> ClientUtils.escapeQueryChars(c)).collect(Collectors.joining(" OR ")) + ")";
					rechercheSolr.addFilterQuery("partEstEntite_indexed_boolean:true");
					rechercheSolr.addFilterQuery("entiteNomCanonique_indexed_string:" + fqClassesSuperEtMoi);
					rechercheSolr.addSort("entiteHtmlLigne_indexed_int", ORDER.asc);
					rechercheSolr.addSort("entiteHtmlCellule_indexed_int", ORDER.asc);
					QueryResponse rechercheReponse = clientSolrComputate.query(rechercheSolr);
					SolrDocumentList rechercheListe = rechercheReponse.getResults();
					Integer rechercheLignes = rechercheSolr.getRows();
					Integer rechercheLigne = -1;
					Integer rechercheLigneActuel;
		
					if(rechercheListe.size() > 0) {
						for(Long i = rechercheListe.getStart(); i < rechercheListe.getNumFound(); i+=rechercheLignes) {
							for(Integer j = 0; j < rechercheListe.size(); j++) {
								SolrDocument entiteDocumentSolr = rechercheListe.get(j);
								String entiteVar = (String)entiteDocumentSolr.get("entiteVar_" + langueNom + "_stored_string");
								String entiteVarCapitalise = (String)entiteDocumentSolr.get("entiteVarCapitalise_" + langueNom + "_stored_string");
								String entiteNomSimple = (String)entiteDocumentSolr.get("entiteNomSimple_" + langueNom + "_stored_string");
								String entiteNomSimpleGenerique = (String)entiteDocumentSolr.get("entiteNomSimpleGenerique_" + langueNom + "_stored_string");
								String entiteNomSimpleComplet = (String)entiteDocumentSolr.get("entiteNomSimpleComplet_" + langueNom + "_stored_string");
								String entiteDescription = (String)entiteDocumentSolr.get("entiteDescription_" + langueNom + "_stored_string");
								String entiteNomAffichage = (String)entiteDocumentSolr.get("entiteNomAffichage_" + langueNom + "_stored_string");
								Boolean entiteHtml = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteHtml_stored_boolean"));
								Boolean entiteMultiligne = BooleanUtils.isTrue((Boolean)entiteDocumentSolr.get("entiteMultiligne_stored_boolean"));
								if(entiteHtml) {
									String jsVal = ".val()";
									if("Boolean".equals(entiteNomSimple)) {
										jsVal = ".prop('checked')";
									}
		
									wRecherche.l();
									wRecherche.tl(1, "var filtre", entiteVarCapitalise, " = $formulaireFiltres.find('.valeur", entiteVarCapitalise, "')", jsVal, ";");
									wRecherche.tl(1, "if(filtre", entiteVarCapitalise, ")");
									wRecherche.tl(2, "filtres['", entiteVar, "'] = valeur", entiteVarCapitalise, ";");
		
									wPOST.l();
									wPOST.tl(1, "var valeur", entiteVarCapitalise, " = $formulaireValeurs.find('.valeur", entiteVarCapitalise, "')", jsVal, ";");
									wPOST.tl(1, "if(valeur", entiteVarCapitalise, ")");
									wPOST.tl(2, "valeurs['", entiteVar, "'] = valeur", entiteVarCapitalise, ";");
		
									wPATCH.l();
									wPATCH.tl(1, "var set", entiteVarCapitalise, " = $formulaireValeurs.find('.set", entiteVarCapitalise, "')", jsVal, ";");
									wPATCH.tl(1, "if(set", entiteVarCapitalise, ")");
									wPATCH.tl(2, "patchs['set", entiteVarCapitalise, "'] = set", entiteVarCapitalise, ";");
									wPATCH.tl(1, "var add", entiteVarCapitalise, " = $formulaireValeurs.find('.add", entiteVarCapitalise, "')", jsVal, ";");
									wPATCH.tl(1, "if(add", entiteVarCapitalise, ")");
									wPATCH.tl(2, "patchs['add", entiteVarCapitalise, "'] = add", entiteVarCapitalise, ";");
									wPATCH.tl(1, "var remove", entiteVarCapitalise, " = $formulaireValeurs.find('.remove", entiteVarCapitalise, "')", jsVal, ";");
									wPATCH.tl(1, "if(remove", entiteVarCapitalise, ")");
									wPATCH.tl(2, "patchs['remove", entiteVarCapitalise, "'] = remove", entiteVarCapitalise, ";");
								}
							}
							rechercheSolr.setStart(i.intValue() + rechercheLignes);
							rechercheReponse = clientSolrComputate.query(rechercheSolr);
							rechercheListe = rechercheReponse.getResults();
						}
					}
				}
	
				l();
				tl(1, "@Override public void htmlScript", classeNomSimple, "GenPage() {");
				for(String classeApiMethode : classeApiMethodes) {
					String classeApiOperationIdMethode = (String)classeDoc.get("classeApiOperationId" + classeApiMethode + "_frFR_stored_string");
					String classeApiUriMethode = (String)classeDoc.get("classeApiUri" + classeApiMethode + "_frFR_stored_string");
					String classeApiTypeMediaMethode = (String)classeDoc.get("classeApiTypeMedia200" + classeApiMethode + "_stored_string");
					String classeApiMethodeMethode = (String)classeDoc.get("classeApiMethode" + classeApiMethode + "_stored_string");
	
					if("application/json".equals(classeApiTypeMediaMethode)) {
						Boolean methodePOST = classeApiMethodeMethode.equals("POST");
						Boolean methodeGET = classeApiMethode.contains("GET");
						Boolean methodePUT = classeApiMethodeMethode.equals("PUT");
						Boolean methodePATCH = classeApiMethodeMethode.equals("PATCH");
						Boolean methodeDELETE = classeApiMethodeMethode.equals("DELETE");
						Boolean methodeRecherche = classeApiMethode.contains("Recherche");
	
						auteurPageJs.l();
						auteurPageJs.tl(0, "// ", classeApiMethode, " //");
						auteurPageJs.l();
						auteurPageJs.l("/**");
						if(methodePATCH) {
						auteurPageJs.l(" * Modifier un ou plusiers ", contexteNomPluriel, " sans valuers qui change, ");
						auteurPageJs.l(" * ou changer des valeurs pour un ou plusiers ", contexteLeNom, ". ");
						auteurPageJs.l(" * @param params: [ \"q=*:*\", \"fq=pk:1\", \"sort=pk asc\", \"rows=1\", \"fl=pk\" ]");
						auteurPageJs.l(" *        Une liste des opérations de recherche sur des ", contexteNomPluriel, " ");
						auteurPageJs.l(" *        pour rechercher \"q=*:*\", filtrer \"fq=pk:1\", trier \"sort=pk desc\", ");
						auteurPageJs.l(" *        limiter les résultats \"rows=1\", ou limiter les valeurs \"fl=pk\". ");
						auteurPageJs.l(" * @param valeurs Noms des champs et valeurs à changer selon les filtres fq. ");
						auteurPageJs.l(" *           Example: { pk: 1 }");
						}
						auteurPageJs.l(" */");
						auteurPageJs.t(0, "function ", classeApiOperationIdMethode, "(");
						if(methodePOST)
							auteurPageJs.s("$formulaireValeurs");
						else if(methodePUT)
							auteurPageJs.s("pk, $formulaireValeurs");
						if(methodePATCH)
							auteurPageJs.s("$formulaireFiltres, $formulaireValeurs");
						if(methodeGET || methodeDELETE)
							auteurPageJs.s("pk");
	
						auteurPageJs.l(") {");
						if(methodePOST) {
							auteurPageJs.tl(1, "var valeurs = {};");
							auteurPageJs.s(wPOST);
							auteurPageJs.l();
						}
						else if(methodePUT) {
							auteurPageJs.tl(1, "var valeurs = {};");
							auteurPageJs.s(wPOST);
							auteurPageJs.l();
						}
						if(methodePATCH) {
							auteurPageJs.tl(1, "var filtres = {};");
							auteurPageJs.s(wRecherche);
							auteurPageJs.l();
							auteurPageJs.tl(1, "var patchs = {};");
							auteurPageJs.s(wPATCH);
							auteurPageJs.l();
						}
	
						auteurPageJs.tl(1, "$.ajax({");
	
						if(methodeGET || methodeDELETE || methodePUT)
							auteurPageJs.tl(2, "url: '", StringUtils.replace(classeApiUriMethode, "{pk}", "' + pk"));
						else if(methodePATCH || methodeRecherche)
							auteurPageJs.tl(2, "url: '", classeApiUriMethode, "' + (!params || params.length == 0 ? '' : '?' + params.join('&'))");
						else
							auteurPageJs.tl(2, "url: '", classeApiUriMethode, "'");
	
						auteurPageJs.tl(2, ", dataType: 'json'");
						auteurPageJs.tl(2, ", type: '", classeApiMethodeMethode, "'");
						auteurPageJs.tl(2, ", contentType: 'application/json; charset=utf-8'");
						if(!"GET".equals(classeApiMethodeMethode) || "DELETE".equals(classeApiMethodeMethode))
							auteurPageJs.tl(2, ", data: JSON.stringify(valeurs)");
						auteurPageJs.tl(2, ", success: function( data, textStatus, jQxhr ) {");
						auteurPageJs.tl(2, "}");
						auteurPageJs.tl(2, ", error: function( jqXhr, textStatus, errorThrown ) {");
						auteurPageJs.tl(2, "}");
						auteurPageJs.tl(1, "});");
						auteurPageJs.l("}");
					}
					
				}
				tl(1, "}");
				l();
				tl(1, "public void htmlForm", classeNomSimple, "(", classeNomSimple, " o) {");
				s(wForm);
				tl(1, "}");
				l();
				tl(1, "@Override public void htmlBody", classeNomSimple, "GenPage() {");
				l();
				tl(2, "if(liste", classeNomSimple, ".size() == 0) {");
				t(3).l("//", contexteAucunNomTrouve);
				l();
				t(3).be("h1").dfl();
				tl(4, "if(contexteIconeClassesCss != null)");
				tl(5, "e(\"i\").a(\"class\", contexteIconeClassesCss + \" w3-margin-right-4 \").f().g(\"i\");");
				t(4).e("span").da("class", " ").df().dsx(contexteAucunNomTrouve).dgl("span");
				t(3).bgl("h1");
				tl(2, "} else if(liste", classeNomSimple, ".size() == 1) {");
				t(3).l("// ", contexteUnNom);
				t(3).l(classeNomSimple, " o = liste", classeNomSimple, ".first();");
				l();
				tl(3, "if(pageH1 != null) {");
				t(4).be("h1").dfl();
				tl(5, "if(contexteIconeClassesCss != null)");
				tl(6, "e(\"i\").a(\"class\", contexteIconeClassesCss + \" w3-margin-right-4 \").f().g(\"i\");");
	
				if(classeEntiteVars != null && classeEntiteVars.contains("pageH1"))
					t(5).e("span").da("class", " ").df().s(".sx(pageH1)").dgl("span");
				else
					t(5).e("span").da("class", " ").df().dsx(contexteUnNom).dgl("span");
	
				t(4).bgl("h1");
				tl(3, "}");
	
				if(classeEntiteVars != null && classeEntiteVars.contains("pageH2")) {
					tl(3, "if(pageH2 != null) {");
					t(4).be("h2").dfl();
					t(5).e("span").da("class", " ").df().s(".sx(pageH2)").dgl("span");
					t(4).bgl("h2");
					tl(3, "}");
				}
	
				if(classeEntiteVars != null && classeEntiteVars.contains("pageH3")) {
					tl(3, "if(pageH3 != null) {");
					t(4).be("h3").dfl();
					t(5).e("span").da("class", " ").df().s(".sx(pageH3)").dgl("span");
					t(4).bgl("h3");
					tl(3, "}");
				}
	
				t(3).be("div").da("class", "w3-card w3-margin w3-padding w3-margin-top w3-show ").dfl();
				l();
				tl(4, "htmlForm", classeNomSimple, "(o);");
				l();
				t(3).bgl("div");
				tl(2, "} else {");
				t(3).l("// plusiers ", contexteNomPluriel);
				l();
				t(3).be("h1").dfl();
				tl(4, "if(contexteIconeClassesCss != null)");
				tl(5, "e(\"i\").a(\"class\", contexteIconeClassesCss + \" w3-margin-right-4 \").f().g(\"i\");");
				t(4).e("span").da("class", " ").df().dsx(contexteNomPluriel).dgl("i");
				t(3).bgl("h1");
				t(3).be("table").da("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").dfl();
				t(4).be("thead").dfl();
				t(5).be("tr").dfl();
				s(wTh);
				t(5).bgl("tr");
				t(4).bgl("thead");
				t(4).be("tbody").dfl();
				tl(5, "for(int i = 0; i < liste", classeNomSimple, ".size(); i++) {");
				tl(6, classeNomSimple, " o = liste", classeNomSimple, ".getList().get(i);");
				tl(6, "{ e(\"tr\").f();");
				s(wTd);
				tl(6, "} g(\"tr\");");
				tl(5, "}");
				t(4).bgl("tbody");
				t(3).bgl("table");
				tl(2, "}");
	
				t(2).e("div").dfl();
				l();
				for(String classeApiMethode : classeApiMethodes) {
					String classeApiOperationIdMethode = (String)classeDoc.get("classeApiOperationId" + classeApiMethode + "_frFR_stored_string");
					String classeApiUriMethode = (String)classeDoc.get("classeApiUri" + classeApiMethode + "_frFR_stored_string");
					String classeApiTypeMediaMethode = (String)classeDoc.get("classeApiTypeMedia200" + classeApiMethode + "_stored_string");
					String classeApiMethodeMethode = (String)classeDoc.get("classeApiMethode" + classeApiMethode + "_stored_string");
	
					if("application/json".equals(classeApiTypeMediaMethode) && !"GET".equals(classeApiMethodeMethode)) {
						Integer tab = classeApiMethodeMethode.contains("PATCH") || classeApiMethodeMethode.contains("DELETE") || classeApiMethodeMethode.contains("POST") ? 0 : 1;
						String methodeTitre = null;
	
						if("POST".equals(classeApiMethodeMethode))
							methodeTitre = "Créer " + contexteUnNom;
						else if("PUT".equals(classeApiMethodeMethode))
							methodeTitre = "Remplacer " + contexteLeNom;
						else if("PATCH".equals(classeApiMethodeMethode))
							methodeTitre = "Modifier des " + contexteNomPluriel;
						else if("DELETE".equals(classeApiMethodeMethode))
							methodeTitre = "Supprimer des " + contexteNomPluriel;
	
	
						l();
						if(tab > 0)
							tl(2, "if(liste", classeNomSimple, ".size() == 1) {");
						t(2 + tab).e("button").l();
						t(3 + tab).dal("class", "w3-btn w3-round w3-border w3-border-black w3-section w3-ripple w3-padding w3-", contexteCouleur, " ");
						t(3 + tab).dal("onclick", "$('#", classeApiOperationIdMethode, "Modale').show(); ");
						t(3 + tab).df().dsx(methodeTitre).l();
						t(2 + tab).dgl("button");
						{ t(2 + tab).be("div").da("id", classeApiOperationIdMethode, "Modale").da("class", "w3-modal ").dfl();
							{ t(3 + tab).be("div").da("class", "w3-modal-content w3-card-4 ").dfl();
								{ t(4 + tab).be("header").da("class", "w3-container w3-", contexteCouleur, " ").dfl();
									t(5 + tab).e("span").da("class", "w3-button w3-display-topright ").da("onclick", "$('#", classeApiOperationIdMethode, "Modale').hide(); ").df().dsx("×").dgl("span");
									t(5 + tab).e("h2").da("class", "").df().dsx(methodeTitre).dgl("h2");
								} t(4 + tab).bgl("header");
	
								{ t(4 + tab).be("div").da("class", "w3-container ").dfl();
									tl(5+ tab, classeNomSimple, " o = new ", classeNomSimple, "();");
									l();
									{ t(5 + tab).be("form").da("id", classeApiOperationIdMethode, "Formulaire").dfl();
										tl(6 + tab, "htmlForm", classeNomSimple, "(o);");
									} t(5 + tab).bgl("form");
									t(5 + tab).e("button").l();
									t(6 + tab).dal("class", "w3-btn w3-round w3-border w3-border-black w3-section w3-ripple w3-padding w3-", contexteCouleur, " ");
	
	//								tl(6 + tab, ".a(\"onclick\", \"alert(JSON.stringify($('#", classeApiOperationIdMethode, "Formulaire').serializeArray().reduce(function(a, x) { a[x.name] = x.value; return a; }, {}))); \")");
	//								tl(6 + tab, ".a(\"onclick\", \"alert(JSON.stringify($('#", classeApiOperationIdMethode, "Formulaire').serializeObject())); \")");
	
									if("POST".equals(classeApiMethodeMethode))
										tl(6 + tab, ".a(\"onclick\", \"", classeApiOperationIdMethode, "($('#", classeApiOperationIdMethode, "Formulaire')); \")");
									else if("PUT".equals(classeApiMethodeMethode))
										tl(6 + tab, ".a(\"onclick\", \"", classeApiOperationIdMethode, "(\", o.getPk(), \", $('#", classeApiOperationIdMethode, "Formulaire')); \")");
									else if(tab > 0)
										tl(6 + tab, ".a(\"onclick\", \"", classeApiOperationIdMethode, "(\", o.getPk(), \"); \")");
									else
										t(6 + tab).dal("onclick", classeApiOperationIdMethode, "(); ");
	
									t(6 + tab).df().dsx(methodeTitre).l();
									t(5 + tab).dgl("button");
									l();
								} t(4 + tab).bgl("div");
							} t(3 + tab).bgl("div");
						} t(2 + tab).bgl("div");
	
						l();
						if(tab > 0)
							tl(2, "}");
					}
				}
				t(2).gl("div");
	
				tl(1, "}");
				tl(0, "}");
	
				wTh.flushClose();

				auteurPageGenClasse.flushClose();
				if(auteurPageClasse != null)
					auteurPageClasse.flushClose();
				auteurPageCss.flushClose();
				auteurPageJs.flushClose();
			}
	
	//		auteurGenPageClasse.close();
		}
	}
}
