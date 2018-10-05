package org.computate.enUS.java;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

/**	For retrieving a Java class from Solr and writing the Java class to a file for each language. 
 */
public abstract class WriteGenClassGen<DEV> extends WriteClass {
	public static final String VAL_entityCommentLine1Part1 = "The \"";
	public static final String VAL_entityCommentLine1Part2 = "\" entity";
	public static final String VAL_entityWrapLine1Part1 = " is set to null before it is initialized. ";
	public static final String VAL_entityWrapLine2Part1 = " is for wrapping a value to be assigned to this field during initialization. ";
	public static final String VAL_entityConstructedLine1Part1 = "It is constructed before it is initialized with the default constructor ";
	public static final String VAL_entityConstructedLine1Part2 = "(). ";
	public static final String VAL_entityConstructedLine2Part1 = " is the field already constructed. ";
	public static final String VAL_entityThrowsLine2Part1 = " so that any exception during initialization is handled by the servlet. ";

	protected boolean dejaInitialiseWriteGenClass = false;

	public void initLoinWriteGenClass() throws Exception {
		if(!dejaInitialiseWriteGenClass) {
			dejaInitialiseWriteGenClass = true;
		}
	}
}