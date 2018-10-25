package org.computate.frFR.java;     

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

/**   
 * nomCanonique.enUS: org.computate.enUS.java.WriteAllClasses
 * 
 * enUS: For retrieving a Java class from Solr and writing the Java class to a file for each language. 
 * frFR: Pour récupérer une classe Java de Solr et écrire la classe Java dans un fichier pour chaque langue. 
 */  
public class EcrireToutesClasses extends EcrireToutesClassesGen<EcrireApiClasse> {   

	/**
	 * var.enUS: writeAllClasses
	 * param1.var.enUS: classAbsolutePath
	 * param2.var.enUS: languageName
	 * r: clientSolrComputate
	 * r.enUS: solrClientComputate
	 * r: rechercheSolr
	 * r.enUS: solrSearch
	 * r: classeCheminAbsolu
	 * r.enUS: classAbsolutePath
	 * r: partNumero
	 * r.enUS: partNumber
	 * r: reponseRecherche
	 * r.enUS: searchResponse
	 * r: langueNom
	 * r.enUS: languageName
	 * r: ecrireClasseGen
	 * r.enUS: writeGenClass
	 * r: classeEtendGen
	 * r.enUS: classExtendsGen
	 * frFR: Récupérer les enregistrements de la classe à partir du moteur de recherche, 
	 * frFR: traitez-les et écrivez-les dans des fichiers de classe pour chaque langue prise en charge. 
	 * enUS: Retrieve the records for the class from the search engine, 
	 * enUS: process them and write them into class files for each supported language. 
	 */    
	protected void ecrireGenClasses(String classeCheminAbsolu, String langueNom) throws Exception { 

		SolrQuery rechercheSolr = new SolrQuery();   
		rechercheSolr.setQuery("*:*");
		rechercheSolr.setRows(1000000);
		rechercheSolr.addFilterQuery("classeCheminAbsolu_indexed_string:" + ClientUtils.escapeQueryChars(classeCheminAbsolu));
		rechercheSolr.addFilterQuery("classeEtendGen_indexed_boolean:true");
		rechercheSolr.addSort("partNumero_indexed_int", ORDER.asc);

		QueryResponse reponseRecherche = clientSolrComputate.query(rechercheSolr);
		ecrireGenClasses(reponseRecherche, langueNom);
	}

	/** 
	 * var.enUS: writeAllClasses
	 * param1.var.enUS: searchResponse
	 * param2.var.enUS: languageName
	 * r: VAL_entiteCommentaireLigne1Part1
	 * r.enUS: VAL_entityCommentLine1Part1
	 * r: VAL_entiteCommentaireLigne1Part2
	 * r.enUS: VAL_entityCommentLine1Part2
	 * r: langueIndexe
	 * r.enUS: languageIndexed
	 * r: listeRecherche
	 * r.enUS: searchList
	 * r: rechercheSolr
	 * r.enUS: solrSearch
	 * r: reponseRecherche
	 * r.enUS: searchResponse
	 * r: classeCheminAbsolu
	 * r.enUS: classAbsolutePath
	 * r: partNumero
	 * r.enUS: partNumber
	 * r: classeParametreTypeNoms
	 * r.enUS: classTypeParameterNames
	 * r: classeParametreTypeNom
	 * r.enUS: classTypeParameterName
	 * r: methodeParametreTypeNoms
	 * r.enUS: methodTypeParameterNames
	 * r: methodeParametreTypeNom
	 * r.enUS: methodTypeParameterName
	 * r: langueNom
	 * r.enUS: languageName
	 * r: classeSuperParametreTypeNoms
	 * r.enUS: classSuperTypeParameterNames
	 * r: classeParametreTypeNoms
	 * r.enUS: classTypeParameterNames
	 * r: classeImportations
	 * r.enUS: classImports
	 * r: classeCommentaire
	 * r.enUS: classComment
	 * r: classeNomEnsemble
	 * r.enUS: classPackageName
	 * r: classeNomCanoniqueSuperGeneriqueLangue
	 * r.enUS: classSuperCanonicalNameGenericLanguage
	 * r: classeNomCanoniqueSuperGenerique
	 * r.enUS: classSuperCanonicalNameGeneric
	 * r: classeNomCanoniqueSuper
	 * r.enUS: classSuperCanonicalName
	 * r: classeNomCanoniqueGenLangue
	 * r.enUS: classCanonicalNameGenLanguage
	 * r: classeNomCanoniqueGen
	 * r.enUS: classCanonicalNameGen
	 * r: classeNomCanoniqueSuperDoc
	 * r.enUS: classSuperCanonicalNameDoc
	 * r: classeNomCanoniqueLangue
	 * r.enUS: classCanonicalNameLanguage
	 * r: classeNomCanonique
	 * r.enUS: classCanonicalName
	 * r: classeNomSimpleSuperGeneriqueLangue
	 * r.enUS: classSuperSimpleNameGenericLanguage
	 * r: classeNomSimpleSuperGenerique
	 * r.enUS: classSuperSimpleNameGeneric
	 * r: classeNomSimpleSuper
	 * r.enUS: classSuperSimpleName
	 * r: classeNomSimpleGenLangue
	 * r.enUS: classSimpleNameGenLanguage
	 * r: classeNomSimpleGen
	 * r.enUS: classSimpleNameGen
	 * r: classeNomSimpleSuperDoc
	 * r.enUS: classSuperSimpleNameDoc
	 * r: classeNomSimpleGenLangue
	 * r.enUS: classSimpleNameGenLanguage
	 * r: classeNomSimpleLangue
	 * r.enUS: classSimpleNameLanguage
	 * r: classeNomSimple
	 * r.enUS: classSimpleName
	 * r: classeEtendGen
	 * r.enUS: classExtendsGen
	 * r: classeCheminRepertoireGenLangue
	 * r.enUS: classGenDirPathLanguage
	 * r: classeCheminRepertoireGen
	 * r.enUS: classGenDirPath
	 * r: classeCheminRepertoireLangue
	 * r.enUS: classDirPathLanguage
	 * r: classeCheminRepertoire
	 * r.enUS: classDirPath
	 * r: classeChemin
	 * r.enUS: classPath
	 * r: classeRepertoire
	 * r.enUS: classDir
	 * r: classeFichier
	 * r.enUS: classFile
	 * r: classeImportation
	 * r.enUS: classImport
	 * r: classePartsSuperLangue
	 * r.enUS: classSuperPartsLanguage
	 * r: ecrireCommentaire
	 * r.enUS: writeComment
	 * r: classeSuperParametreTypeNom
	 * r.enUS: classSuperTypeParameterName
	 * r: partEstChamp
	 * r: partEstEntite
	 * r.enUS: partIsEntity
	 * r: Ecrire:
	 * r.enUS: Write:
	 * frFR: Récupérer les enregistrements de la classe à partir du moteur de recherche, 
	 * frFR: traitez-les et écrivez-les dans des fichiers de classe pour chaque langue prise en charge. 
	 * enUS: Retrieve the records for the class from the search engine, 
	 * enUS: process them and write them into class files for each supported language. 
	 */ 
	protected void ecrireGenClasses(QueryResponse reponseRecherche, String langueNom) throws Exception { 
		SolrDocumentList listeRecherche = reponseRecherche.getResults();

		if(listeRecherche.size() > 0 && (langueIndexe || !StringUtils.equals(langueNom, this.langueNom))) {    
			for(int i = 0; i < listeRecherche.size(); i++) {
				doc = listeRecherche.get(i); 
				Integer partNumero = (Integer)doc.get("partNumero_stored_int");
				if(partNumero.equals(1)) {
					classeCheminRepertoireGen = (String)doc.get("classeCheminRepertoireGen_" + langueNom + "_stored_string");
					classeCheminGen = (String)doc.get("classeCheminGen_" + langueNom + "_stored_string"); 
					classeCheminApiGen = (String)doc.get("classeCheminApiGen_" + langueNom + "_stored_string"); 
					classeCheminPageGen = (String)doc.get("classeCheminPageGen_" + langueNom + "_stored_string"); 
					classeRepertoireGen = new File(classeCheminRepertoireGen);
					classeRepertoireGen.mkdirs();
					classeFichierGen = new File(classeCheminGen);
					classeFichierApi = new File(classeCheminApiGen);
					classeFichierPage = new File(classeCheminPageGen);
					o = new PrintWriter(classeFichierGen);
					classeNomSimple = (String)doc.get("classeNomSimple_" + langueNom + "_stored_string");
					classeNomSimpleGen = (String)doc.get("classeNomSimpleGen_" + langueNom + "_stored_string");
					classeNomCanoniqueSuper = (String)doc.get("classeNomCanoniqueSuper_" + langueNom + "_stored_string");
					classeNomSimpleSuper = (String)doc.get("classeNomSimpleSuper_" + langueNom + "_stored_string");
					classeNomCanoniqueSuper = (String)doc.get("classeNomCanoniqueSuper_" + langueNom + "_stored_string");
					classeNomSimpleSuperGenerique = (String)doc.get("classeNomSimpleSuperGenerique_" + langueNom + "_stored_string");
					classeNomCanoniqueSuperGenerique = (String)doc.get("classeNomCanoniqueSuperGenerique_" + langueNom + "_stored_string");
					classeNomEnsemble = (String)doc.get("classeNomEnsemble_" + langueNom + "_stored_string");
					classeNomSimpleApiGen = (String)doc.get("classeNomSimpleApiGen_" + langueNom + "_stored_string");
					classeCommentaire = (String)doc.get("classeCommentaire_" + langueNom + "_stored_string");
					classeImportationsGen = (List<String>)doc.get("classeImportationsGen_" + langueNom + "_stored_strings");
					if(classeImportationsGen == null)
						classeImportationsGen = new ArrayList<String>();
					classeImportationsGenApi = (List<String>)doc.get("classeImportationsGenApi_" + langueNom + "_stored_strings");
					if(classeImportationsGenApi == null)
						classeImportationsGenApi = new ArrayList<String>();
					classeImportationsGenPage = (List<String>)doc.get("classeImportationsGenPage_" + langueNom + "_stored_strings");
					if(classeImportationsGenPage == null)
						classeImportationsGenPage = new ArrayList<String>();
					classeParametreTypeNoms = (List<String>)doc.get("classeParametreTypeNoms_stored_strings");
					classeSuperParametreTypeNoms = (List<String>)doc.get("classeSuperParametreTypeNoms_stored_strings");
					classeEtendGen = (Boolean)doc.get("classeEtendGen_stored_boolean");
					classeBaseEtendGen = (Boolean)doc.get("classeBaseEtendGen_stored_boolean");
					classeEtendBase = (Boolean)doc.get("classeEtendBase_stored_boolean");
					classeEstBase = (Boolean)doc.get("classeEstBase_stored_boolean");
					classeInitLoin = (Boolean)doc.get("classeInitLoin_stored_boolean");
					classeSauvegarde = BooleanUtils.isTrue((Boolean)doc.get("classeSauvegarde_stored_boolean"));
					classeIndexe = BooleanUtils.isTrue((Boolean)doc.get("classeIndexe_stored_boolean"));
					classeModele = BooleanUtils.isTrue((Boolean)doc.get("classeModele_stored_boolean"));
					classeApi = BooleanUtils.isTrue((Boolean)doc.get("classeApi_stored_boolean"));
					classePage = BooleanUtils.isTrue((Boolean)doc.get("classePage_stored_boolean"));

					auteurGenClasse = new PrintWriter(classeFichierGen);
					auteurApiGenClasse = new PrintWriter(classeFichierApi);
//					auteurPageClasse = new PrintWriter(classeFichierPage);

					genCodeInit();
					o = auteurGenClasse;

					genCodeInitialiserLoin(langueNom);
					genCodeRequeteSite(langueNom);
					genCodeIndexer(langueNom);
					genCodeObtenir(langueNom);
					genCodeAttribuer(langueNom);
					genCodeDefinir(langueNom);
					genCodePeupler(langueNom);
					genCodeExiste(langueNom);
					genCodeSauvegardes(langueNom);
					genCodeSauvegarder(langueNom);
					genCodeClasseDebut(langueNom);
					apiCodeClasseDebut(langueNom);
				} 
				else {
					Boolean partEstConstructeur = (Boolean)doc.get("partEstConstructeur_stored_boolean");
					Boolean partEstEntite = (Boolean)doc.get("partEstEntite_stored_boolean");
	
					if(BooleanUtils.isTrue(partEstEntite)) {
						genCodeEntite(langueNom);
					}
				}
			}
			if(o != null) {
				if(listeRecherche.size() > 0 && !StringUtils.equals(classeCheminAbsolu, classeCheminGen)) {
					genCodeClasseFin(langueNom);
					apiCodeClasseFin(langueNom);
				}
			}
		} 
	}  
}