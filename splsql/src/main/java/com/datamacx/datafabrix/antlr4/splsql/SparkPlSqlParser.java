// Generated from /Users/bipulkumar/Code/learn_workspace/datafabrix/splsql/src/main/scala/com/datamacx/datafabrix/antlr4/splsql/SparkPlSql.g4 by ANTLR 4.9.2
package com.datamacx.datafabrix.antlr4.splsql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkPlSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		COST=52, CREATE=53, CROSS=54, CUBE=55, CURRENT=56, CURRENT_DATE=57, CURRENT_TIME=58, 
		CURRENT_TIMESTAMP=59, CURRENT_USER=60, DATA=61, DATABASE=62, DATABASES=63, 
		DAY=64, DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, DESC=69, 
		DESCRIBE=70, DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, DISTRIBUTE=75, 
		DROP=76, ELSE=77, END=78, ESCAPE=79, ESCAPED=80, EXCEPT=81, EXCHANGE=82, 
		EXISTS=83, EXPLAIN=84, EXPORT=85, EXTENDED=86, EXTERNAL=87, EXTRACT=88, 
		FALSE=89, FETCH=90, FIELDS=91, FILTER=92, FILEFORMAT=93, FIRST=94, FOLLOWING=95, 
		FOR=96, FOREIGN=97, FORMAT=98, FORMATTED=99, FROM=100, FULL=101, FUNCTION=102, 
		FUNCTIONS=103, GLOBAL=104, GRANT=105, GROUP=106, GROUPING=107, HAVING=108, 
		HOUR=109, IF=110, IGNORE=111, IMPORT=112, IN=113, INDEX=114, INDEXES=115, 
		INNER=116, INPATH=117, INPUTFORMAT=118, INSERT=119, INTERSECT=120, INTERVAL=121, 
		INTO=122, IS=123, ITEMS=124, JOIN=125, KEYS=126, LAST=127, LATERAL=128, 
		LAZY=129, LEADING=130, LEFT=131, LIKE=132, LIMIT=133, LINES=134, LIST=135, 
		LOAD=136, LOCAL=137, LOCATION=138, LOCK=139, LOCKS=140, LOGICAL=141, MACRO=142, 
		MAP=143, MATCHED=144, MERGE=145, MINUTE=146, MONTH=147, MSCK=148, NAMESPACE=149, 
		NAMESPACES=150, NATURAL=151, NO=152, NOT=153, NULL=154, NULLS=155, OF=156, 
		ON=157, ONLY=158, OPTION=159, OPTIONS=160, OR=161, ORDER=162, OUT=163, 
		OUTER=164, OUTPUTFORMAT=165, OVER=166, OVERLAPS=167, OVERLAY=168, OVERWRITE=169, 
		PARTITION=170, PARTITIONED=171, PARTITIONS=172, PERCENTLIT=173, PIVOT=174, 
		PLACING=175, POSITION=176, PRECEDING=177, PRIMARY=178, PRINCIPALS=179, 
		PROPERTIES=180, PURGE=181, QUERY=182, RANGE=183, RECORDREADER=184, RECORDWRITER=185, 
		RECOVER=186, REDUCE=187, REFERENCES=188, REFRESH=189, RENAME=190, REPAIR=191, 
		REPLACE=192, RESET=193, RESTRICT=194, REVOKE=195, RIGHT=196, RLIKE=197, 
		ROLE=198, ROLES=199, ROLLBACK=200, ROLLUP=201, ROW=202, ROWS=203, SCHEMA=204, 
		SECOND=205, SELECT=206, SEMI=207, SEPARATED=208, SERDE=209, SERDEPROPERTIES=210, 
		SESSION_USER=211, SET=212, SETMINUS=213, SETS=214, SHOW=215, SKEWED=216, 
		SOME=217, SORT=218, SORTED=219, START=220, STATISTICS=221, STORED=222, 
		STRATIFY=223, STRUCT=224, SUBSTR=225, SUBSTRING=226, TABLE=227, TABLES=228, 
		TABLESAMPLE=229, TBLPROPERTIES=230, TEMPORARY=231, TERMINATED=232, THEN=233, 
		TO=234, TOUCH=235, TRAILING=236, TRANSACTION=237, TRANSACTIONS=238, TRANSFORM=239, 
		TRIM=240, TRUE=241, TRUNCATE=242, TYPE=243, UNARCHIVE=244, UNBOUNDED=245, 
		UNCACHE=246, UNION=247, UNIQUE=248, UNKNOWN=249, UNLOCK=250, UNSET=251, 
		UPDATE=252, USE=253, USER=254, USING=255, VALUES=256, VIEW=257, VIEWS=258, 
		WHEN=259, WHERE=260, WINDOW=261, WITH=262, YEAR=263, EQ=264, NSEQ=265, 
		NEQ=266, NEQJ=267, LT=268, LTE=269, GT=270, GTE=271, PLUS=272, MINUS=273, 
		ASTERISK=274, SLASH=275, PERCENT=276, DIV=277, TILDE=278, AMPERSAND=279, 
		PIPE=280, CONCAT_PIPE=281, HAT=282, STRING=283, BIGINT_LITERAL=284, SMALLINT_LITERAL=285, 
		TINYINT_LITERAL=286, INTEGER_VALUE=287, EXPONENT_VALUE=288, DECIMAL_VALUE=289, 
		DOUBLE_LITERAL=290, BIGDECIMAL_LITERAL=291, IDENTIFIER=292, BACKQUOTED_IDENTIFIER=293, 
		SIMPLE_COMMENT=294, BRACKETED_EMPTY_COMMENT=295, BRACKETED_COMMENT=296, 
		WS=297, UNRECOGNIZED=298;
	public static final int
		RULE_multipleStatement = 0, RULE_singleStatement = 1, RULE_singleExpression = 2, 
		RULE_singleTableIdentifier = 3, RULE_singleMultipartIdentifier = 4, RULE_singleFunctionIdentifier = 5, 
		RULE_singleDataType = 6, RULE_singleTableSchema = 7, RULE_statement = 8, 
		RULE_unsupportedHiveNativeCommands = 9, RULE_createTableHeader = 10, RULE_replaceTableHeader = 11, 
		RULE_bucketSpec = 12, RULE_skewSpec = 13, RULE_locationSpec = 14, RULE_commentSpec = 15, 
		RULE_query = 16, RULE_insertInto = 17, RULE_partitionSpecLocation = 18, 
		RULE_partitionSpec = 19, RULE_partitionVal = 20, RULE_namespace = 21, 
		RULE_describeFuncName = 22, RULE_describeColName = 23, RULE_ctes = 24, 
		RULE_namedQuery = 25, RULE_tableProvider = 26, RULE_createTableClauses = 27, 
		RULE_tablePropertyList = 28, RULE_tableProperty = 29, RULE_tablePropertyKey = 30, 
		RULE_tablePropertyValue = 31, RULE_constantList = 32, RULE_nestedConstantList = 33, 
		RULE_createFileFormat = 34, RULE_fileFormat = 35, RULE_storageHandler = 36, 
		RULE_resource = 37, RULE_dmlStatementNoWith = 38, RULE_queryOrganization = 39, 
		RULE_multiInsertQueryBody = 40, RULE_queryTerm = 41, RULE_queryPrimary = 42, 
		RULE_sortItem = 43, RULE_fromStatement = 44, RULE_fromStatementBody = 45, 
		RULE_querySpecification = 46, RULE_transformClause = 47, RULE_selectClause = 48, 
		RULE_setClause = 49, RULE_matchedClause = 50, RULE_notMatchedClause = 51, 
		RULE_matchedAction = 52, RULE_notMatchedAction = 53, RULE_assignmentList = 54, 
		RULE_assignment = 55, RULE_whereClause = 56, RULE_havingClause = 57, RULE_hint = 58, 
		RULE_hintStatement = 59, RULE_fromClause = 60, RULE_aggregationClause = 61, 
		RULE_groupingSet = 62, RULE_pivotClause = 63, RULE_pivotColumn = 64, RULE_pivotValue = 65, 
		RULE_lateralView = 66, RULE_setQuantifier = 67, RULE_relation = 68, RULE_joinRelation = 69, 
		RULE_joinType = 70, RULE_joinCriteria = 71, RULE_sample = 72, RULE_sampleMethod = 73, 
		RULE_identifierList = 74, RULE_identifierSeq = 75, RULE_orderedIdentifierList = 76, 
		RULE_orderedIdentifier = 77, RULE_identifierCommentList = 78, RULE_identifierComment = 79, 
		RULE_relationPrimary = 80, RULE_inlineTable = 81, RULE_functionTable = 82, 
		RULE_tableAlias = 83, RULE_rowFormat = 84, RULE_multipartIdentifierList = 85, 
		RULE_multipartIdentifier = 86, RULE_tableIdentifier = 87, RULE_functionIdentifier = 88, 
		RULE_namedExpression = 89, RULE_namedExpressionSeq = 90, RULE_transformList = 91, 
		RULE_transform = 92, RULE_transformArgument = 93, RULE_expression = 94, 
		RULE_booleanExpression = 95, RULE_predicate = 96, RULE_valueExpression = 97, 
		RULE_primaryExpression = 98, RULE_constant = 99, RULE_comparisonOperator = 100, 
		RULE_arithmeticOperator = 101, RULE_predicateOperator = 102, RULE_booleanValue = 103, 
		RULE_interval = 104, RULE_errorCapturingMultiUnitsInterval = 105, RULE_multiUnitsInterval = 106, 
		RULE_errorCapturingUnitToUnitInterval = 107, RULE_unitToUnitInterval = 108, 
		RULE_intervalValue = 109, RULE_intervalUnit = 110, RULE_colPosition = 111, 
		RULE_dataType = 112, RULE_qualifiedColTypeWithPositionList = 113, RULE_qualifiedColTypeWithPosition = 114, 
		RULE_colTypeList = 115, RULE_colType = 116, RULE_complexColTypeList = 117, 
		RULE_complexColType = 118, RULE_whenClause = 119, RULE_windowClause = 120, 
		RULE_namedWindow = 121, RULE_windowSpec = 122, RULE_windowFrame = 123, 
		RULE_frameBound = 124, RULE_qualifiedNameList = 125, RULE_functionName = 126, 
		RULE_qualifiedName = 127, RULE_errorCapturingIdentifier = 128, RULE_errorCapturingIdentifierExtra = 129, 
		RULE_identifier = 130, RULE_strictIdentifier = 131, RULE_quotedIdentifier = 132, 
		RULE_number = 133, RULE_alterColumnAction = 134, RULE_ansiNonReserved = 135, 
		RULE_strictNonReserved = 136, RULE_nonReserved = 137;
	private static String[] makeRuleNames() {
		return new String[] {
			"multipleStatement", "singleStatement", "singleExpression", "singleTableIdentifier", 
			"singleMultipartIdentifier", "singleFunctionIdentifier", "singleDataType", 
			"singleTableSchema", "statement", "unsupportedHiveNativeCommands", "createTableHeader", 
			"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
			"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"namespace", "describeFuncName", "describeColName", "ctes", "namedQuery", 
			"tableProvider", "createTableClauses", "tablePropertyList", "tableProperty", 
			"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
			"matchedAction", "notMatchedAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"aggregationClause", "groupingSet", "pivotClause", "pivotColumn", "pivotValue", 
			"lateralView", "setQuantifier", "relation", "joinRelation", "joinType", 
			"joinCriteria", "sample", "sampleMethod", "identifierList", "identifierSeq", 
			"orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
			"identifierComment", "relationPrimary", "inlineTable", "functionTable", 
			"tableAlias", "rowFormat", "multipartIdentifierList", "multipartIdentifier", 
			"tableIdentifier", "functionIdentifier", "namedExpression", "namedExpressionSeq", 
			"transformList", "transform", "transformArgument", "expression", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
			"unitToUnitInterval", "intervalValue", "intervalUnit", "colPosition", 
			"dataType", "qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", 
			"colTypeList", "colType", "complexColTypeList", "complexColType", "whenClause", 
			"windowClause", "namedWindow", "windowSpec", "windowFrame", "frameBound", 
			"qualifiedNameList", "functionName", "qualifiedName", "errorCapturingIdentifier", 
			"errorCapturingIdentifierExtra", "identifier", "strictIdentifier", "quotedIdentifier", 
			"number", "alterColumnAction", "ansiNonReserved", "strictNonReserved", 
			"nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
			"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
			"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATABASE'", null, "'DAY'", "'DBPROPERTIES'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DROP'", "'ELSE'", "'END'", 
			"'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", 
			"'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", 
			"'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", "'FOR'", 
			"'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", 
			"'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", 
			"'HOUR'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
			"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", 
			"'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MINUTE'", "'MONTH'", "'MSCK'", 
			"'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", 
			"'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", 
			"'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", 
			"'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", 
			"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPLACE'", "'RESET'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", null, "'ROLE'", 
			"'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", "'SECOND'", 
			"'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", 
			"'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", "'STORED'", 
			"'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'TABLE'", "'TABLES'", 
			"'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", "'THEN'", "'TO'", 
			"'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", "'TRANSFORM'", 
			"'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", 
			"'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", "'UNSET'", 
			"'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VIEW'", "'VIEWS'", 
			"'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'YEAR'", null, "'<=>'", "'<>'", 
			"'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DAY", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
			"DISTRIBUTE", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", 
			"EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", 
			"FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", "FOR", 
			"FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", 
			"GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", "IF", "IGNORE", 
			"IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
			"MAP", "MATCHED", "MERGE", "MINUTE", "MONTH", "MSCK", "NAMESPACE", "NAMESPACES", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", 
			"OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", 
			"OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
			"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
			"PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", 
			"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", 
			"RESET", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", 
			"ROLLUP", "ROW", "ROWS", "SCHEMA", "SECOND", "SELECT", "SEMI", "SEPARATED", 
			"SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", 
			"SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", 
			"STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", 
			"TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TO", "TOUCH", "TRAILING", 
			"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
			"TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", 
			"UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", "VIEW", 
			"VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR", "EQ", "NSEQ", "NEQ", 
			"NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", 
			"STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"EXPONENT_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
			"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SparkPlSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SparkPlSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MultipleStatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SparkPlSqlParser.EOF, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public MultipleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMultipleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMultipleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMultipleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleStatementContext multipleStatement() throws RecognitionException {
		MultipleStatementContext _localctx = new MultipleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multipleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				singleStatement();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ALTER) | (1L << ANALYZE) | (1L << CACHE) | (1L << CLEAR) | (1L << COMMENT) | (1L << COMMIT) | (1L << CREATE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DELETE - 67)) | (1L << (DESC - 67)) | (1L << (DESCRIBE - 67)) | (1L << (DFS - 67)) | (1L << (DROP - 67)) | (1L << (EXPLAIN - 67)) | (1L << (EXPORT - 67)) | (1L << (FROM - 67)) | (1L << (GRANT - 67)) | (1L << (IMPORT - 67)) | (1L << (INSERT - 67)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (LIST - 135)) | (1L << (LOAD - 135)) | (1L << (LOCK - 135)) | (1L << (MAP - 135)) | (1L << (MERGE - 135)) | (1L << (MSCK - 135)) | (1L << (REDUCE - 135)) | (1L << (REFRESH - 135)) | (1L << (REPLACE - 135)) | (1L << (RESET - 135)) | (1L << (REVOKE - 135)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (ROLLBACK - 200)) | (1L << (SELECT - 200)) | (1L << (SET - 200)) | (1L << (SHOW - 200)) | (1L << (START - 200)) | (1L << (TABLE - 200)) | (1L << (TRUNCATE - 200)) | (1L << (UNCACHE - 200)) | (1L << (UNLOCK - 200)) | (1L << (UPDATE - 200)) | (1L << (USE - 200)) | (1L << (VALUES - 200)) | (1L << (WITH - 200)))) != 0) );
			setState(281);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			statement();
			setState(284);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public List<TerminalNode> EOF() { return getTokens(SparkPlSqlParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SparkPlSqlParser.EOF, i);
		}
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			namedExpression();
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(287);
					match(EOF);
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> EOF() { return getTokens(SparkPlSqlParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SparkPlSqlParser.EOF, i);
		}
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleTableIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			tableIdentifier();
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					match(EOF);
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public List<TerminalNode> EOF() { return getTokens(SparkPlSqlParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SparkPlSqlParser.EOF, i);
		}
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleMultipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			multipartIdentifier();
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					match(EOF);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public List<TerminalNode> EOF() { return getTokens(SparkPlSqlParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SparkPlSqlParser.EOF, i);
		}
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleFunctionIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			functionIdentifier();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					match(EOF);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> EOF() { return getTokens(SparkPlSqlParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SparkPlSqlParser.EOF, i);
		}
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleDataType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			dataType();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					match(EOF);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<TerminalNode> EOF() { return getTokens(SparkPlSqlParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SparkPlSqlParser.EOF, i);
		}
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleTableSchema);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			colTypeList();
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					match(EOF);
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SparkPlSqlParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SparkPlSqlParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkPlSqlParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkPlSqlParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkPlSqlParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkPlSqlParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SparkPlSqlParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SparkPlSqlParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SparkPlSqlParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkPlSqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SparkPlSqlParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkPlSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkPlSqlParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkPlSqlParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkPlSqlParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SparkPlSqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkPlSqlParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SparkPlSqlParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SparkPlSqlParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkPlSqlParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkPlSqlParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SparkPlSqlParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkPlSqlParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkPlSqlParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkPlSqlParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SparkPlSqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkPlSqlParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SparkPlSqlParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkPlSqlParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkPlSqlParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SparkPlSqlParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SparkPlSqlParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkPlSqlParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkPlSqlParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SparkPlSqlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SparkPlSqlParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SparkPlSqlParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SparkPlSqlParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkPlSqlParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkPlSqlParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SparkPlSqlParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkPlSqlParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkPlSqlParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SparkPlSqlParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SparkPlSqlParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SparkPlSqlParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkPlSqlParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SparkPlSqlParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkPlSqlParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SparkPlSqlParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public ColTypeListContext partitionColumns;
		public IdentifierListContext partitionColumnNames;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkPlSqlParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkPlSqlParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkPlSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkPlSqlParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkPlSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkPlSqlParser.TBLPROPERTIES, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkPlSqlParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SparkPlSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkPlSqlParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SparkPlSqlParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkPlSqlParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SparkPlSqlParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SparkPlSqlParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SparkPlSqlParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkPlSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkPlSqlParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SparkPlSqlParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkPlSqlParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkPlSqlParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SparkPlSqlParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkPlSqlParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SparkPlSqlParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkPlSqlParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SparkPlSqlParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SparkPlSqlParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkPlSqlParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkPlSqlParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkPlSqlParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SparkPlSqlParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkPlSqlParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkPlSqlParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SparkPlSqlParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SparkPlSqlParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SparkPlSqlParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkPlSqlParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkPlSqlParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkPlSqlParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SparkPlSqlParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SparkPlSqlParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SparkPlSqlParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkPlSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkPlSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkPlSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkPlSqlParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkPlSqlParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkPlSqlParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SparkPlSqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SparkPlSqlParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkPlSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkPlSqlParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SparkPlSqlParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkPlSqlParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkPlSqlParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkPlSqlParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkPlSqlParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SparkPlSqlParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SparkPlSqlParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SparkPlSqlParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SparkPlSqlParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SparkPlSqlParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SparkPlSqlParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SparkPlSqlParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SparkPlSqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SparkPlSqlParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SparkPlSqlParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SparkPlSqlParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SparkPlSqlParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SparkPlSqlParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkPlSqlParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SparkPlSqlParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkPlSqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SparkPlSqlParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkPlSqlParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkPlSqlParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkPlSqlParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SparkPlSqlParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SparkPlSqlParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkPlSqlParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkPlSqlParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SparkPlSqlParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkPlSqlParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkPlSqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(329);
					ctes();
					}
				}

				setState(332);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(USE);
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(334);
					match(NAMESPACE);
					}
					break;
				}
				setState(337);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				match(CREATE);
				setState(339);
				namespace();
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(340);
					match(IF);
					setState(341);
					match(NOT);
					setState(342);
					match(EXISTS);
					}
					break;
				}
				setState(345);
				multipartIdentifier();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(351);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(346);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(347);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(348);
						match(WITH);
						setState(349);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				match(ALTER);
				setState(357);
				namespace();
				setState(358);
				multipartIdentifier();
				setState(359);
				match(SET);
				setState(360);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(361);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(363);
				match(ALTER);
				setState(364);
				namespace();
				setState(365);
				multipartIdentifier();
				setState(366);
				match(SET);
				setState(367);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				match(DROP);
				setState(370);
				namespace();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(371);
					match(IF);
					setState(372);
					match(EXISTS);
					}
					break;
				}
				setState(375);
				multipartIdentifier();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(376);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				match(SHOW);
				setState(380);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(381);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(382);
					multipartIdentifier();
					}
				}

				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(385);
						match(LIKE);
						}
					}

					setState(388);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(391);
				createTableHeader();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(392);
					match(T__1);
					setState(393);
					colTypeList();
					setState(394);
					match(T__2);
					}
				}

				setState(398);
				tableProvider();
				setState(399);
				createTableClauses();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (REDUCE - 187)) | (1L << (SELECT - 187)) | (1L << (TABLE - 187)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(400);
						match(AS);
						}
					}

					setState(403);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(406);
				createTableHeader();
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(407);
					match(T__1);
					setState(408);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(409);
					match(T__2);
					}
					break;
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || _la==LOCATION || _la==PARTITIONED || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (ROW - 202)) | (1L << (SKEWED - 202)) | (1L << (STORED - 202)) | (1L << (TBLPROPERTIES - 202)))) != 0)) {
					{
					setState(432);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(413);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						setState(423);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(414);
							match(PARTITIONED);
							setState(415);
							match(BY);
							setState(416);
							match(T__1);
							setState(417);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(418);
							match(T__2);
							}
							break;
						case 2:
							{
							setState(420);
							match(PARTITIONED);
							setState(421);
							match(BY);
							setState(422);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(425);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(426);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(427);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(428);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(429);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(430);
						match(TBLPROPERTIES);
						setState(431);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (REDUCE - 187)) | (1L << (SELECT - 187)) | (1L << (TABLE - 187)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(437);
						match(AS);
						}
					}

					setState(440);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(443);
				match(CREATE);
				setState(444);
				match(TABLE);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(445);
					match(IF);
					setState(446);
					match(NOT);
					setState(447);
					match(EXISTS);
					}
					break;
				}
				setState(450);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(451);
				match(LIKE);
				setState(452);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (ROW - 202)) | (1L << (STORED - 202)) | (1L << (TBLPROPERTIES - 202)) | (1L << (USING - 202)))) != 0)) {
					{
					setState(459);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(453);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(454);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(455);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(456);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(457);
						match(TBLPROPERTIES);
						setState(458);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 12:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(464);
				replaceTableHeader();
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(465);
					match(T__1);
					setState(466);
					colTypeList();
					setState(467);
					match(T__2);
					}
				}

				setState(471);
				tableProvider();
				setState(472);
				createTableClauses();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (REDUCE - 187)) | (1L << (SELECT - 187)) | (1L << (TABLE - 187)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(473);
						match(AS);
						}
					}

					setState(476);
					query();
					}
				}

				}
				break;
			case 13:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(479);
				match(ANALYZE);
				setState(480);
				match(TABLE);
				setState(481);
				multipartIdentifier();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(482);
					partitionSpec();
					}
				}

				setState(485);
				match(COMPUTE);
				setState(486);
				match(STATISTICS);
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(487);
					identifier();
					}
					break;
				case 2:
					{
					setState(488);
					match(FOR);
					setState(489);
					match(COLUMNS);
					setState(490);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(491);
					match(FOR);
					setState(492);
					match(ALL);
					setState(493);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(496);
				match(ALTER);
				setState(497);
				match(TABLE);
				setState(498);
				multipartIdentifier();
				setState(499);
				match(ADD);
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(503);
				match(ALTER);
				setState(504);
				match(TABLE);
				setState(505);
				multipartIdentifier();
				setState(506);
				match(ADD);
				setState(507);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				match(T__1);
				setState(509);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(510);
				match(T__2);
				}
				break;
			case 16:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(512);
				match(ALTER);
				setState(513);
				match(TABLE);
				setState(514);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(515);
				match(RENAME);
				setState(516);
				match(COLUMN);
				setState(517);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(518);
				match(TO);
				setState(519);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 17:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(521);
				match(ALTER);
				setState(522);
				match(TABLE);
				setState(523);
				multipartIdentifier();
				setState(524);
				match(DROP);
				setState(525);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(526);
				match(T__1);
				setState(527);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(528);
				match(T__2);
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(530);
				match(ALTER);
				setState(531);
				match(TABLE);
				setState(532);
				multipartIdentifier();
				setState(533);
				match(DROP);
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(535);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 19:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(537);
				match(ALTER);
				setState(538);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(540);
				match(RENAME);
				setState(541);
				match(TO);
				setState(542);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 20:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(544);
				match(ALTER);
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				multipartIdentifier();
				setState(547);
				match(SET);
				setState(548);
				match(TBLPROPERTIES);
				setState(549);
				tablePropertyList();
				}
				break;
			case 21:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(551);
				match(ALTER);
				setState(552);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(553);
				multipartIdentifier();
				setState(554);
				match(UNSET);
				setState(555);
				match(TBLPROPERTIES);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(556);
					match(IF);
					setState(557);
					match(EXISTS);
					}
				}

				setState(560);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(562);
				match(ALTER);
				setState(563);
				match(TABLE);
				setState(564);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(565);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(566);
					match(COLUMN);
					}
					break;
				}
				setState(569);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(570);
					alterColumnAction();
					}
				}

				}
				break;
			case 23:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(573);
				match(ALTER);
				setState(574);
				match(TABLE);
				setState(575);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(576);
					partitionSpec();
					}
				}

				setState(579);
				match(CHANGE);
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(580);
					match(COLUMN);
					}
					break;
				}
				setState(583);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(584);
				colType();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(585);
					colPosition();
					}
				}

				}
				break;
			case 24:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(588);
				match(ALTER);
				setState(589);
				match(TABLE);
				setState(590);
				multipartIdentifier();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(591);
					partitionSpec();
					}
				}

				setState(594);
				match(SET);
				setState(595);
				match(SERDE);
				setState(596);
				match(STRING);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(597);
					match(WITH);
					setState(598);
					match(SERDEPROPERTIES);
					setState(599);
					tablePropertyList();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(602);
				match(ALTER);
				setState(603);
				match(TABLE);
				setState(604);
				multipartIdentifier();
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(605);
					partitionSpec();
					}
				}

				setState(608);
				match(SET);
				setState(609);
				match(SERDEPROPERTIES);
				setState(610);
				tablePropertyList();
				}
				break;
			case 26:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(612);
				match(ALTER);
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(614);
				multipartIdentifier();
				setState(615);
				match(ADD);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(616);
					match(IF);
					setState(617);
					match(NOT);
					setState(618);
					match(EXISTS);
					}
				}

				setState(622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(621);
					partitionSpecLocation();
					}
					}
					setState(624); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 27:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(626);
				match(ALTER);
				setState(627);
				match(TABLE);
				setState(628);
				multipartIdentifier();
				setState(629);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(630);
				match(RENAME);
				setState(631);
				match(TO);
				setState(632);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 28:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(634);
				match(ALTER);
				setState(635);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(636);
				multipartIdentifier();
				setState(637);
				match(DROP);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(638);
					match(IF);
					setState(639);
					match(EXISTS);
					}
				}

				setState(642);
				partitionSpec();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(643);
					match(T__3);
					setState(644);
					partitionSpec();
					}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(650);
					match(PURGE);
					}
				}

				}
				break;
			case 29:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(653);
				match(ALTER);
				setState(654);
				match(TABLE);
				setState(655);
				multipartIdentifier();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(656);
					partitionSpec();
					}
				}

				setState(659);
				match(SET);
				setState(660);
				locationSpec();
				}
				break;
			case 30:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(662);
				match(ALTER);
				setState(663);
				match(TABLE);
				setState(664);
				multipartIdentifier();
				setState(665);
				match(RECOVER);
				setState(666);
				match(PARTITIONS);
				}
				break;
			case 31:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(668);
				match(DROP);
				setState(669);
				match(TABLE);
				setState(672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(670);
					match(IF);
					setState(671);
					match(EXISTS);
					}
					break;
				}
				setState(674);
				multipartIdentifier();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(675);
					match(PURGE);
					}
				}

				}
				break;
			case 32:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(678);
				match(DROP);
				setState(679);
				match(VIEW);
				setState(682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(680);
					match(IF);
					setState(681);
					match(EXISTS);
					}
					break;
				}
				setState(684);
				multipartIdentifier();
				}
				break;
			case 33:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(685);
				match(CREATE);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(686);
					match(OR);
					setState(687);
					match(REPLACE);
					}
				}

				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(690);
						match(GLOBAL);
						}
					}

					setState(693);
					match(TEMPORARY);
					}
				}

				setState(696);
				match(VIEW);
				setState(700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(697);
					match(IF);
					setState(698);
					match(NOT);
					setState(699);
					match(EXISTS);
					}
					break;
				}
				setState(702);
				multipartIdentifier();
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(703);
					identifierCommentList();
					}
				}

				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(712);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(706);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(707);
						match(PARTITIONED);
						setState(708);
						match(ON);
						setState(709);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(710);
						match(TBLPROPERTIES);
						setState(711);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				match(AS);
				setState(718);
				query();
				}
				break;
			case 34:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(720);
				match(CREATE);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(721);
					match(OR);
					setState(722);
					match(REPLACE);
					}
				}

				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(725);
					match(GLOBAL);
					}
				}

				setState(728);
				match(TEMPORARY);
				setState(729);
				match(VIEW);
				setState(730);
				tableIdentifier();
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(731);
					match(T__1);
					setState(732);
					colTypeList();
					setState(733);
					match(T__2);
					}
				}

				setState(737);
				tableProvider();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(738);
					match(OPTIONS);
					setState(739);
					tablePropertyList();
					}
				}

				}
				break;
			case 35:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(742);
				match(ALTER);
				setState(743);
				match(VIEW);
				setState(744);
				multipartIdentifier();
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(745);
					match(AS);
					}
				}

				setState(748);
				query();
				}
				break;
			case 36:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(750);
				match(CREATE);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(751);
					match(OR);
					setState(752);
					match(REPLACE);
					}
				}

				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(755);
					match(TEMPORARY);
					}
				}

				setState(758);
				match(FUNCTION);
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(759);
					match(IF);
					setState(760);
					match(NOT);
					setState(761);
					match(EXISTS);
					}
					break;
				}
				setState(764);
				multipartIdentifier();
				setState(765);
				match(AS);
				setState(766);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(767);
					match(USING);
					setState(768);
					resource();
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(769);
						match(T__3);
						setState(770);
						resource();
						}
						}
						setState(775);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 37:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(778);
				match(DROP);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(779);
					match(TEMPORARY);
					}
				}

				setState(782);
				match(FUNCTION);
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(783);
					match(IF);
					setState(784);
					match(EXISTS);
					}
					break;
				}
				setState(787);
				multipartIdentifier();
				}
				break;
			case 38:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(788);
				match(EXPLAIN);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EXTENDED - 86)) | (1L << (FORMATTED - 86)) | (1L << (LOGICAL - 86)))) != 0)) {
					{
					setState(789);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EXTENDED - 86)) | (1L << (FORMATTED - 86)) | (1L << (LOGICAL - 86)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(792);
				statement();
				}
				break;
			case 39:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(793);
				match(SHOW);
				setState(794);
				match(TABLES);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(795);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(796);
					multipartIdentifier();
					}
				}

				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(799);
						match(LIKE);
						}
					}

					setState(802);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 40:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(805);
				match(SHOW);
				setState(806);
				match(TABLE);
				setState(807);
				match(EXTENDED);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(809);
					((ShowTableContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(812);
				match(LIKE);
				setState(813);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(814);
					partitionSpec();
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(817);
				match(SHOW);
				setState(818);
				match(TBLPROPERTIES);
				setState(819);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(820);
					match(T__1);
					setState(821);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(822);
					match(T__2);
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(826);
				match(SHOW);
				setState(827);
				match(COLUMNS);
				setState(828);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(829);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(830);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(831);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(834);
				match(SHOW);
				setState(835);
				match(VIEWS);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(836);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(837);
					multipartIdentifier();
					}
				}

				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(840);
						match(LIKE);
						}
					}

					setState(843);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(846);
				match(SHOW);
				setState(847);
				match(PARTITIONS);
				setState(848);
				multipartIdentifier();
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(849);
					partitionSpec();
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(852);
				match(SHOW);
				setState(854);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(853);
					identifier();
					}
					break;
				}
				setState(856);
				match(FUNCTIONS);
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(858);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(857);
						match(LIKE);
						}
						break;
					}
					setState(862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(860);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(861);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 46:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(866);
				match(SHOW);
				setState(867);
				match(CREATE);
				setState(868);
				match(TABLE);
				setState(869);
				multipartIdentifier();
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(870);
					match(AS);
					setState(871);
					match(SERDE);
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(874);
				match(SHOW);
				setState(875);
				match(CURRENT);
				setState(876);
				match(NAMESPACE);
				}
				break;
			case 48:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(877);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(878);
				match(FUNCTION);
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(879);
					match(EXTENDED);
					}
					break;
				}
				setState(882);
				describeFuncName();
				}
				break;
			case 49:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(883);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(884);
				namespace();
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(885);
					match(EXTENDED);
					}
					break;
				}
				setState(888);
				multipartIdentifier();
				}
				break;
			case 50:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(890);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(891);
					match(TABLE);
					}
					break;
				}
				setState(895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(894);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(897);
				multipartIdentifier();
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(898);
					partitionSpec();
					}
					break;
				}
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(901);
					describeColName();
					}
					break;
				}
				}
				break;
			case 51:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(904);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(905);
					match(QUERY);
					}
				}

				setState(908);
				query();
				}
				break;
			case 52:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(909);
				match(COMMENT);
				setState(910);
				match(ON);
				setState(911);
				namespace();
				setState(912);
				multipartIdentifier();
				setState(913);
				match(IS);
				setState(914);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 53:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(916);
				match(COMMENT);
				setState(917);
				match(ON);
				setState(918);
				match(TABLE);
				setState(919);
				multipartIdentifier();
				setState(920);
				match(IS);
				setState(921);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 54:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(923);
				match(REFRESH);
				setState(924);
				match(TABLE);
				setState(925);
				multipartIdentifier();
				}
				break;
			case 55:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(926);
				match(REFRESH);
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(927);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(931);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(928);
							matchWildcard();
							}
							} 
						}
						setState(933);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 56:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(936);
				match(CACHE);
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(937);
					match(LAZY);
					}
				}

				setState(940);
				match(TABLE);
				setState(941);
				multipartIdentifier();
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(942);
					match(OPTIONS);
					setState(943);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (REDUCE - 187)) | (1L << (SELECT - 187)) | (1L << (TABLE - 187)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(946);
						match(AS);
						}
					}

					setState(949);
					query();
					}
				}

				}
				break;
			case 57:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(952);
				match(UNCACHE);
				setState(953);
				match(TABLE);
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(954);
					match(IF);
					setState(955);
					match(EXISTS);
					}
					break;
				}
				setState(958);
				multipartIdentifier();
				}
				break;
			case 58:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(959);
				match(CLEAR);
				setState(960);
				match(CACHE);
				}
				break;
			case 59:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(961);
				match(LOAD);
				setState(962);
				match(DATA);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(963);
					match(LOCAL);
					}
				}

				setState(966);
				match(INPATH);
				setState(967);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(968);
					match(OVERWRITE);
					}
				}

				setState(971);
				match(INTO);
				setState(972);
				match(TABLE);
				setState(973);
				multipartIdentifier();
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(974);
					partitionSpec();
					}
				}

				}
				break;
			case 60:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(977);
				match(TRUNCATE);
				setState(978);
				match(TABLE);
				setState(979);
				multipartIdentifier();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(980);
					partitionSpec();
					}
				}

				}
				break;
			case 61:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(983);
				match(MSCK);
				setState(984);
				match(REPAIR);
				setState(985);
				match(TABLE);
				setState(986);
				multipartIdentifier();
				}
				break;
			case 62:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(987);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(988);
				identifier();
				setState(996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(989);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(993);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(990);
							matchWildcard();
							}
							} 
						}
						setState(995);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 63:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(998);
				match(SET);
				setState(999);
				match(ROLE);
				setState(1003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1000);
						matchWildcard();
						}
						} 
					}
					setState(1005);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 64:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(1006);
				match(SET);
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1007);
						matchWildcard();
						}
						} 
					}
					setState(1012);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 65:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(1013);
				match(RESET);
				}
				break;
			case 66:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(1014);
				unsupportedHiveNativeCommands();
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1015);
						matchWildcard();
						}
						} 
					}
					setState(1020);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SparkPlSqlParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SparkPlSqlParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkPlSqlParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkPlSqlParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SparkPlSqlParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SparkPlSqlParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SparkPlSqlParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkPlSqlParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkPlSqlParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkPlSqlParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SparkPlSqlParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkPlSqlParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SparkPlSqlParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SparkPlSqlParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SparkPlSqlParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkPlSqlParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SparkPlSqlParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkPlSqlParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SparkPlSqlParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SparkPlSqlParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SparkPlSqlParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkPlSqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkPlSqlParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SparkPlSqlParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkPlSqlParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkPlSqlParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkPlSqlParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkPlSqlParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SparkPlSqlParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkPlSqlParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SparkPlSqlParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkPlSqlParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SparkPlSqlParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkPlSqlParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SparkPlSqlParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkPlSqlParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkPlSqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkPlSqlParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SparkPlSqlParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1024);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1026);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1027);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1028);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1031);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1032);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1035);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1036);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1037);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1038);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1039);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1042);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1043);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1044);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1045);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1046);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1047);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1048);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1049);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1050);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1051);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1052);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1053);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1054);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1056);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1057);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1060);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1061);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1062);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1064);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1065);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1066);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1068);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1069);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1072);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1073);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1075);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1076);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1078);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1081);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1086);
				tableIdentifier();
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1092);
				tableIdentifier();
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1098);
				tableIdentifier();
				setState(1099);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1102);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1104);
				tableIdentifier();
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1108);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1110);
				tableIdentifier();
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1114);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1116);
				tableIdentifier();
				setState(1117);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1123);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1124);
				tableIdentifier();
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1127);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1131);
				tableIdentifier();
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1133);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1137);
				tableIdentifier();
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1139);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1142);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1143);
				tableIdentifier();
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1145);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1148);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1149);
				tableIdentifier();
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1154);
				tableIdentifier();
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1155);
					partitionSpec();
					}
				}

				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1162);
				tableIdentifier();
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1163);
					partitionSpec();
					}
				}

				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1170);
				tableIdentifier();
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1171);
					partitionSpec();
					}
				}

				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1179);
				tableIdentifier();
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1180);
					partitionSpec();
					}
				}

				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkPlSqlParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(CREATE);
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1194);
				match(TEMPORARY);
				}
			}

			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1197);
				match(EXTERNAL);
				}
			}

			setState(1200);
			match(TABLE);
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1201);
				match(IF);
				setState(1202);
				match(NOT);
				setState(1203);
				match(EXISTS);
				}
				break;
			}
			setState(1206);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SparkPlSqlParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SparkPlSqlParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1208);
				match(CREATE);
				setState(1209);
				match(OR);
				}
			}

			setState(1212);
			match(REPLACE);
			setState(1213);
			match(TABLE);
			setState(1214);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SparkPlSqlParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkPlSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkPlSqlParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SparkPlSqlParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkPlSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkPlSqlParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SparkPlSqlParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(CLUSTERED);
			setState(1217);
			match(BY);
			setState(1218);
			identifierList();
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1219);
				match(SORTED);
				setState(1220);
				match(BY);
				setState(1221);
				orderedIdentifierList();
				}
			}

			setState(1224);
			match(INTO);
			setState(1225);
			match(INTEGER_VALUE);
			setState(1226);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SparkPlSqlParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SparkPlSqlParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SparkPlSqlParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SparkPlSqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkPlSqlParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			match(SKEWED);
			setState(1229);
			match(BY);
			setState(1230);
			identifierList();
			setState(1231);
			match(ON);
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1232);
				constantList();
				}
				break;
			case 2:
				{
				setState(1233);
				nestedConstantList();
				}
				break;
			}
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1236);
				match(STORED);
				setState(1237);
				match(AS);
				setState(1238);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SparkPlSqlParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(LOCATION);
			setState(1242);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SparkPlSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(COMMENT);
			setState(1245);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1247);
				ctes();
				}
			}

			setState(1250);
			queryTerm(0);
			setState(1251);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SparkPlSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkPlSqlParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkPlSqlParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkPlSqlParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SparkPlSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkPlSqlParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkPlSqlParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SparkPlSqlParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkPlSqlParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkPlSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkPlSqlParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkPlSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkPlSqlParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_insertInto);
		int _la;
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				match(INSERT);
				setState(1254);
				match(OVERWRITE);
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1255);
					match(TABLE);
					}
					break;
				}
				setState(1258);
				multipartIdentifier();
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1259);
					partitionSpec();
					setState(1263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1260);
						match(IF);
						setState(1261);
						match(NOT);
						setState(1262);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				match(INSERT);
				setState(1268);
				match(INTO);
				setState(1270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1269);
					match(TABLE);
					}
					break;
				}
				setState(1272);
				multipartIdentifier();
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1273);
					partitionSpec();
					}
				}

				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1276);
					match(IF);
					setState(1277);
					match(NOT);
					setState(1278);
					match(EXISTS);
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1281);
				match(INSERT);
				setState(1282);
				match(OVERWRITE);
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1283);
					match(LOCAL);
					}
				}

				setState(1286);
				match(DIRECTORY);
				setState(1287);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1288);
					rowFormat();
					}
				}

				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1291);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1294);
				match(INSERT);
				setState(1295);
				match(OVERWRITE);
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1296);
					match(LOCAL);
					}
				}

				setState(1299);
				match(DIRECTORY);
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1300);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1303);
				tableProvider();
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1304);
					match(OPTIONS);
					setState(1305);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			partitionSpec();
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1311);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SparkPlSqlParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			match(PARTITION);
			setState(1315);
			match(T__1);
			setState(1316);
			partitionVal();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1317);
				match(T__3);
				setState(1318);
				partitionVal();
				}
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1324);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkPlSqlParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			identifier();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1327);
				match(EQ);
				setState(1328);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SparkPlSqlParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SparkPlSqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkPlSqlParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_describeFuncName);
		try {
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1336);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1337);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1341);
				match(T__4);
				setState(1342);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SparkPlSqlParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(WITH);
			setState(1349);
			namedQuery();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1350);
				match(T__3);
				setState(1351);
				namedQuery();
				}
				}
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1358);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1361);
				match(AS);
				}
			}

			setState(1364);
			match(T__1);
			setState(1365);
			query();
			setState(1366);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparkPlSqlParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(USING);
			setState(1369);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public TransformListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SparkPlSqlParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SparkPlSqlParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkPlSqlParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkPlSqlParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkPlSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkPlSqlParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkPlSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkPlSqlParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TransformListContext> transformList() {
			return getRuleContexts(TransformListContext.class);
		}
		public TransformListContext transformList(int i) {
			return getRuleContext(TransformListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (LOCATION - 138)) | (1L << (OPTIONS - 138)) | (1L << (PARTITIONED - 138)))) != 0) || _la==TBLPROPERTIES) {
				{
				setState(1381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1371);
					match(OPTIONS);
					setState(1372);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1373);
					match(PARTITIONED);
					setState(1374);
					match(BY);
					setState(1375);
					((CreateTableClausesContext)_localctx).partitioning = transformList();
					}
					}
					break;
				case CLUSTERED:
					{
					setState(1376);
					bucketSpec();
					}
					break;
				case LOCATION:
					{
					setState(1377);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1378);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1379);
					match(TBLPROPERTIES);
					setState(1380);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(T__1);
			setState(1387);
			tableProperty();
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1388);
				match(T__3);
				setState(1389);
				tableProperty();
				}
				}
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1395);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkPlSqlParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & ((1L << (TRUE - 241)) | (1L << (EQ - 241)) | (1L << (STRING - 241)) | (1L << (INTEGER_VALUE - 241)) | (1L << (DECIMAL_VALUE - 241)))) != 0)) {
				{
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1398);
					match(EQ);
					}
				}

				setState(1401);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				identifier();
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1405);
					match(T__4);
					setState(1406);
					identifier();
					}
					}
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkPlSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkPlSqlParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyValue);
		try {
			setState(1419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1415);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1417);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1418);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(T__1);
			setState(1422);
			constant();
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1423);
				match(T__3);
				setState(1424);
				constant();
				}
				}
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1430);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(T__1);
			setState(1433);
			constantList();
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1434);
				match(T__3);
				setState(1435);
				constantList();
				}
				}
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1441);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SparkPlSqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SparkPlSqlParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_createFileFormat);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				match(STORED);
				setState(1444);
				match(AS);
				setState(1445);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				match(STORED);
				setState(1447);
				match(BY);
				setState(1448);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SparkPlSqlParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkPlSqlParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkPlSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkPlSqlParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fileFormat);
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				match(INPUTFORMAT);
				setState(1452);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1453);
				match(OUTPUTFORMAT);
				setState(1454);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkPlSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkPlSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(STRING);
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1459);
				match(WITH);
				setState(1460);
				match(SERDEPROPERTIES);
				setState(1461);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			identifier();
			setState(1465);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SparkPlSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SparkPlSqlParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SparkPlSqlParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SparkPlSqlParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SparkPlSqlParser.USING, 0); }
		public TerminalNode ON() { return getToken(SparkPlSqlParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				insertInto();
				setState(1468);
				queryTerm(0);
				setState(1469);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				fromClause();
				setState(1473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1472);
					multiInsertQueryBody();
					}
					}
					setState(1475); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1477);
				match(DELETE);
				setState(1478);
				match(FROM);
				setState(1479);
				multipartIdentifier();
				setState(1480);
				tableAlias();
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1481);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1484);
				match(UPDATE);
				setState(1485);
				multipartIdentifier();
				setState(1486);
				tableAlias();
				setState(1487);
				setClause();
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1488);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1491);
				match(MERGE);
				setState(1492);
				match(INTO);
				setState(1493);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1494);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1495);
				match(USING);
				setState(1501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1496);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1497);
					match(T__1);
					setState(1498);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1499);
					match(T__2);
					}
					break;
				}
				setState(1503);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1504);
				match(ON);
				setState(1505);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1506);
						matchedClause();
						}
						} 
					}
					setState(1511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1512);
					notMatchedClause();
					}
					}
					setState(1517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SparkPlSqlParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkPlSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkPlSqlParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SparkPlSqlParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkPlSqlParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SparkPlSqlParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkPlSqlParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SparkPlSqlParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1520);
				match(ORDER);
				setState(1521);
				match(BY);
				setState(1522);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1523);
						match(T__3);
						setState(1524);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			}
			setState(1542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1532);
				match(CLUSTER);
				setState(1533);
				match(BY);
				setState(1534);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1535);
						match(T__3);
						setState(1536);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1544);
				match(DISTRIBUTE);
				setState(1545);
				match(BY);
				setState(1546);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1547);
						match(T__3);
						setState(1548);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				}
				break;
			}
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1556);
				match(SORT);
				setState(1557);
				match(BY);
				setState(1558);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1559);
						match(T__3);
						setState(1560);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				break;
			}
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1568);
				windowClause();
				}
				break;
			}
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1571);
				match(LIMIT);
				setState(1574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1572);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1573);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			insertInto();
			setState(1579);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SparkPlSqlParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SparkPlSqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkPlSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkPlSqlParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1582);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1584);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1585);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1586);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1588);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1587);
							setQuantifier();
							}
						}

						setState(1590);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1591);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1592);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1593);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1595);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1594);
							setQuantifier();
							}
						}

						setState(1597);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1598);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1599);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1600);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1602);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1601);
							setQuantifier();
							}
						}

						setState(1604);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_queryPrimary);
		try {
			setState(1619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1612);
				match(TABLE);
				setState(1613);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1614);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1615);
				match(T__1);
				setState(1616);
				query();
				setState(1617);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SparkPlSqlParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SparkPlSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SparkPlSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkPlSqlParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			expression();
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1622);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1625);
				match(NULLS);
				setState(1626);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			fromClause();
			setState(1631); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1630);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1633); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				transformClause();
				setState(1637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1636);
					whereClause();
					}
					break;
				}
				setState(1639);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1641);
				selectClause();
				setState(1645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1642);
						lateralView();
						}
						} 
					}
					setState(1647);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1648);
					whereClause();
					}
					break;
				}
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1651);
					aggregationClause();
					}
					break;
				}
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1654);
					havingClause();
					}
					break;
				}
				setState(1658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1657);
					windowClause();
					}
					break;
				}
				setState(1660);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_querySpecification);
		try {
			int _alt;
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				transformClause();
				setState(1666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1665);
					fromClause();
					}
					break;
				}
				setState(1669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1668);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				selectClause();
				setState(1673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1672);
					fromClause();
					}
					break;
				}
				setState(1678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1675);
						lateralView();
						}
						} 
					}
					setState(1680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				setState(1682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1681);
					whereClause();
					}
					break;
				}
				setState(1685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1684);
					aggregationClause();
					}
					break;
				}
				setState(1688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1687);
					havingClause();
					}
					break;
				}
				setState(1691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1690);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SparkPlSqlParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkPlSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkPlSqlParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SparkPlSqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SparkPlSqlParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SparkPlSqlParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SparkPlSqlParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkPlSqlParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkPlSqlParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1695);
				match(SELECT);
				setState(1696);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1697);
				match(T__1);
				setState(1698);
				namedExpressionSeq();
				setState(1699);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1701);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1702);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1703);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1704);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1707);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1710);
				match(RECORDWRITER);
				setState(1711);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1714);
			match(USING);
			setState(1715);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1716);
				match(AS);
				setState(1726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1717);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1718);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1719);
					match(T__1);
					setState(1722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1720);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1721);
						colTypeList();
						}
						break;
					}
					setState(1724);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1730);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1733);
				match(RECORDREADER);
				setState(1734);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SparkPlSqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(SELECT);
			setState(1741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1738);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1744);
				setQuantifier();
				}
				break;
			}
			setState(1747);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(SET);
			setState(1750);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SparkPlSqlParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SparkPlSqlParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SparkPlSqlParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SparkPlSqlParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(WHEN);
			setState(1753);
			match(MATCHED);
			setState(1756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1754);
				match(AND);
				setState(1755);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1758);
			match(THEN);
			setState(1759);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SparkPlSqlParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SparkPlSqlParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SparkPlSqlParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SparkPlSqlParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(WHEN);
			setState(1762);
			match(NOT);
			setState(1763);
			match(MATCHED);
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1764);
				match(AND);
				setState(1765);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1768);
			match(THEN);
			setState(1769);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SparkPlSqlParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SparkPlSqlParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkPlSqlParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_matchedAction);
		try {
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1771);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1772);
				match(UPDATE);
				setState(1773);
				match(SET);
				setState(1774);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1775);
				match(UPDATE);
				setState(1776);
				match(SET);
				setState(1777);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SparkPlSqlParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkPlSqlParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SparkPlSqlParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_notMatchedAction);
		int _la;
		try {
			setState(1798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				match(INSERT);
				setState(1781);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
				match(INSERT);
				setState(1783);
				match(T__1);
				setState(1784);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1785);
				match(T__2);
				setState(1786);
				match(VALUES);
				setState(1787);
				match(T__1);
				setState(1788);
				expression();
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1789);
					match(T__3);
					setState(1790);
					expression();
					}
					}
					setState(1795);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1796);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			assignment();
			setState(1805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1801);
				match(T__3);
				setState(1802);
				assignment();
				}
				}
				setState(1807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SparkPlSqlParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1809);
			match(EQ);
			setState(1810);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SparkPlSqlParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(WHERE);
			setState(1813);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SparkPlSqlParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			match(HAVING);
			setState(1816);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(T__5);
			setState(1819);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1821);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						setState(1820);
						match(T__3);
						}
						break;
					}
					setState(1823);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1829);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hintStatement);
		int _la;
		try {
			setState(1844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1831);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1832);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1833);
				match(T__1);
				setState(1834);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1835);
					match(T__3);
					setState(1836);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1842);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			match(FROM);
			setState(1847);
			relation();
			setState(1852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1848);
					match(T__3);
					setState(1849);
					relation();
					}
					} 
				}
				setState(1854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			setState(1858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1855);
					lateralView();
					}
					} 
				}
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1861);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SparkPlSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SparkPlSqlParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SparkPlSqlParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SparkPlSqlParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SparkPlSqlParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SparkPlSqlParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SparkPlSqlParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1864);
				match(GROUP);
				setState(1865);
				match(BY);
				setState(1866);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1867);
						match(T__3);
						setState(1868);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1873);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
				}
				setState(1891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1874);
					match(WITH);
					setState(1875);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1876);
					match(WITH);
					setState(1877);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1878);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1879);
					match(SETS);
					setState(1880);
					match(T__1);
					setState(1881);
					groupingSet();
					setState(1886);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1882);
						match(T__3);
						setState(1883);
						groupingSet();
						}
						}
						setState(1888);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1889);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1893);
				match(GROUP);
				setState(1894);
				match(BY);
				setState(1895);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(1896);
				match(SETS);
				setState(1897);
				match(T__1);
				setState(1898);
				groupingSet();
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1899);
					match(T__3);
					setState(1900);
					groupingSet();
					}
					}
					setState(1905);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1906);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_groupingSet);
		int _la;
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1910);
				match(T__1);
				setState(1919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1911);
					expression();
					setState(1916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1912);
						match(T__3);
						setState(1913);
						expression();
						}
						}
						setState(1918);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1921);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SparkPlSqlParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SparkPlSqlParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			match(PIVOT);
			setState(1926);
			match(T__1);
			setState(1927);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1928);
			match(FOR);
			setState(1929);
			pivotColumn();
			setState(1930);
			match(IN);
			setState(1931);
			match(T__1);
			setState(1932);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1933);
				match(T__3);
				setState(1934);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1940);
			match(T__2);
			setState(1941);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pivotColumn);
		int _la;
		try {
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1944);
				match(T__1);
				setState(1945);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1946);
					match(T__3);
					setState(1947);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1953);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			expression();
			setState(1962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1958);
					match(AS);
					}
					break;
				}
				setState(1961);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SparkPlSqlParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SparkPlSqlParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			match(LATERAL);
			setState(1965);
			match(VIEW);
			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1966);
				match(OUTER);
				}
				break;
			}
			setState(1969);
			qualifiedName();
			setState(1970);
			match(T__1);
			setState(1979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1971);
				expression();
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1972);
					match(T__3);
					setState(1973);
					expression();
					}
					}
					setState(1978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1981);
			match(T__2);
			setState(1982);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1983);
					match(AS);
					}
					break;
				}
				setState(1986);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1987);
						match(T__3);
						setState(1988);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1993);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SparkPlSqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SparkPlSqlParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			relationPrimary();
			setState(2002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1999);
					joinRelation();
					}
					} 
				}
				setState(2004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SparkPlSqlParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SparkPlSqlParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_joinRelation);
		try {
			setState(2016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2005);
				joinType();
				}
				setState(2006);
				match(JOIN);
				setState(2007);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2008);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2011);
				match(NATURAL);
				setState(2012);
				joinType();
				setState(2013);
				match(JOIN);
				setState(2014);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SparkPlSqlParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SparkPlSqlParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SparkPlSqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SparkPlSqlParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SparkPlSqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkPlSqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SparkPlSqlParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SparkPlSqlParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_joinType);
		int _la;
		try {
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2018);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2021);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2022);
				match(LEFT);
				setState(2024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2023);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2026);
					match(LEFT);
					}
				}

				setState(2029);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2030);
				match(RIGHT);
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2031);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2034);
				match(FULL);
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2035);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2038);
					match(LEFT);
					}
				}

				setState(2041);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SparkPlSqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SparkPlSqlParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_joinCriteria);
		try {
			setState(2048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2044);
				match(ON);
				setState(2045);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2046);
				match(USING);
				setState(2047);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SparkPlSqlParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			match(TABLESAMPLE);
			setState(2051);
			match(T__1);
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2052);
				sampleMethod();
				}
				break;
			}
			setState(2055);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SparkPlSqlParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SparkPlSqlParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkPlSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkPlSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SparkPlSqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkPlSqlParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SparkPlSqlParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkPlSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkPlSqlParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SparkPlSqlParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sampleMethod);
		int _la;
		try {
			setState(2081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2057);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2060);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2061);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2062);
				expression();
				setState(2063);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2065);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2066);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2067);
				match(OUT);
				setState(2068);
				match(OF);
				setState(2069);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2070);
					match(ON);
					setState(2076);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
					case 1:
						{
						setState(2071);
						identifier();
						}
						break;
					case 2:
						{
						setState(2072);
						qualifiedName();
						setState(2073);
						match(T__1);
						setState(2074);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2080);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			match(T__1);
			setState(2084);
			identifierSeq();
			setState(2085);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2088);
					match(T__3);
					setState(2089);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			match(T__1);
			setState(2096);
			orderedIdentifier();
			setState(2101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2097);
				match(T__3);
				setState(2098);
				orderedIdentifier();
				}
				}
				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2104);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparkPlSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2107);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(T__1);
			setState(2111);
			identifierComment();
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2112);
				match(T__3);
				setState(2113);
				identifierComment();
				}
				}
				setState(2118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2119);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			identifier();
			setState(2123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2122);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_relationPrimary);
		try {
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2125);
				multipartIdentifier();
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2126);
					sample();
					}
					break;
				}
				setState(2129);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2131);
				match(T__1);
				setState(2132);
				query();
				setState(2133);
				match(T__2);
				setState(2135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2134);
					sample();
					}
					break;
				}
				setState(2137);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2139);
				match(T__1);
				setState(2140);
				relation();
				setState(2141);
				match(T__2);
				setState(2143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2142);
					sample();
					}
					break;
				}
				setState(2145);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2147);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2148);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparkPlSqlParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2151);
			match(VALUES);
			setState(2152);
			expression();
			setState(2157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2153);
					match(T__3);
					setState(2154);
					expression();
					}
					} 
				}
				setState(2159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			setState(2160);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2162);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2163);
			match(T__1);
			setState(2172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2164);
				expression();
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2165);
					match(T__3);
					setState(2166);
					expression();
					}
					}
					setState(2171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2174);
			match(T__2);
			setState(2175);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2177);
					match(AS);
					}
					break;
				}
				setState(2180);
				strictIdentifier();
				setState(2182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2181);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SparkPlSqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkPlSqlParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SparkPlSqlParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkPlSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkPlSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SparkPlSqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkPlSqlParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkPlSqlParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkPlSqlParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SparkPlSqlParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SparkPlSqlParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkPlSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkPlSqlParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SparkPlSqlParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkPlSqlParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SparkPlSqlParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SparkPlSqlParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SparkPlSqlParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkPlSqlParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkPlSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkPlSqlParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SparkPlSqlParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_rowFormat);
		try {
			setState(2235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				match(ROW);
				setState(2187);
				match(FORMAT);
				setState(2188);
				match(SERDE);
				setState(2189);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2190);
					match(WITH);
					setState(2191);
					match(SERDEPROPERTIES);
					setState(2192);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2195);
				match(ROW);
				setState(2196);
				match(FORMAT);
				setState(2197);
				match(DELIMITED);
				setState(2207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2198);
					match(FIELDS);
					setState(2199);
					match(TERMINATED);
					setState(2200);
					match(BY);
					setState(2201);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
					case 1:
						{
						setState(2202);
						match(ESCAPED);
						setState(2203);
						match(BY);
						setState(2204);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2209);
					match(COLLECTION);
					setState(2210);
					match(ITEMS);
					setState(2211);
					match(TERMINATED);
					setState(2212);
					match(BY);
					setState(2213);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2216);
					match(MAP);
					setState(2217);
					match(KEYS);
					setState(2218);
					match(TERMINATED);
					setState(2219);
					match(BY);
					setState(2220);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2223);
					match(LINES);
					setState(2224);
					match(TERMINATED);
					setState(2225);
					match(BY);
					setState(2226);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2229);
					match(NULL);
					setState(2230);
					match(DEFINED);
					setState(2231);
					match(AS);
					setState(2232);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			multipartIdentifier();
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2238);
				match(T__3);
				setState(2239);
				multipartIdentifier();
				}
				}
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2246);
					match(T__4);
					setState(2247);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2253);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2254);
				match(T__4);
				}
				break;
			}
			setState(2258);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2260);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2261);
				match(T__4);
				}
				break;
			}
			setState(2265);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			expression();
			setState(2275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2268);
					match(AS);
					}
					break;
				}
				setState(2273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2271);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2272);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			namedExpression();
			setState(2282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2278);
					match(T__3);
					setState(2279);
					namedExpression();
					}
					} 
				}
				setState(2284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformListContext extends ParserRuleContext {
		public TransformContext transform;
		public List<TransformContext> transforms = new ArrayList<TransformContext>();
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TransformListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTransformList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTransformList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTransformList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformListContext transformList() throws RecognitionException {
		TransformListContext _localctx = new TransformListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_transformList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			match(T__1);
			setState(2286);
			((TransformListContext)_localctx).transform = transform();
			((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2287);
				match(T__3);
				setState(2288);
				((TransformListContext)_localctx).transform = transform();
				((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
				}
				}
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2294);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_transform);
		int _la;
		try {
			setState(2309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2296);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2297);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2298);
				match(T__1);
				setState(2299);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2300);
					match(T__3);
					setState(2301);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2307);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_transformArgument);
		try {
			setState(2313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2311);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2312);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SparkPlSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(SparkPlSqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2318);
				match(NOT);
				setState(2319);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2320);
				match(EXISTS);
				setState(2321);
				match(T__1);
				setState(2322);
				query();
				setState(2323);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2325);
				valueExpression(0);
				setState(2327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2326);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2331);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2332);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2333);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2334);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2335);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2336);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SparkPlSqlParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkPlSqlParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SparkPlSqlParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public TerminalNode ESCAPE() { return getToken(SparkPlSqlParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SparkPlSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SparkPlSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkPlSqlParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SparkPlSqlParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkPlSqlParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_predicate);
		int _la;
		try {
			setState(2404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2342);
					match(NOT);
					}
				}

				setState(2345);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2346);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2347);
				match(AND);
				setState(2348);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2350);
					match(NOT);
					}
				}

				setState(2353);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2354);
				match(T__1);
				setState(2355);
				expression();
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2356);
					match(T__3);
					setState(2357);
					expression();
					}
					}
					setState(2362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2363);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2365);
					match(NOT);
					}
				}

				setState(2368);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2369);
				match(T__1);
				setState(2370);
				query();
				setState(2371);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2373);
					match(NOT);
					}
				}

				setState(2376);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2377);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2378);
					match(NOT);
					}
				}

				setState(2381);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2382);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2383);
					match(ESCAPE);
					setState(2384);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2387);
				match(IS);
				setState(2389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2388);
					match(NOT);
					}
				}

				setState(2391);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2392);
				match(IS);
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2393);
					match(NOT);
					}
				}

				setState(2396);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2397);
				match(IS);
				setState(2399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2398);
					match(NOT);
					}
				}

				setState(2401);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2402);
				match(FROM);
				setState(2403);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SparkPlSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkPlSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkPlSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkPlSqlParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SparkPlSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkPlSqlParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkPlSqlParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SparkPlSqlParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SparkPlSqlParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SparkPlSqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SparkPlSqlParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2407);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2408);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (PLUS - 272)) | (1L << (MINUS - 272)) | (1L << (TILDE - 272)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2409);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2412);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2413);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (ASTERISK - 274)) | (1L << (SLASH - 274)) | (1L << (PERCENT - 274)) | (1L << (DIV - 274)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2414);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2415);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2416);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (PLUS - 272)) | (1L << (MINUS - 272)) | (1L << (CONCAT_PIPE - 272)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2417);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2418);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2419);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2420);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2421);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2422);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2423);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2424);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2425);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2426);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2427);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2428);
						comparisonOperator();
						setState(2429);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SparkPlSqlParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkPlSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkPlSqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkPlSqlParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SparkPlSqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkPlSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkPlSqlParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SparkPlSqlParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SparkPlSqlParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SparkPlSqlParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SparkPlSqlParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SparkPlSqlParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkPlSqlParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SparkPlSqlParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SparkPlSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SparkPlSqlParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SparkPlSqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SparkPlSqlParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SparkPlSqlParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SparkPlSqlParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkPlSqlParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkPlSqlParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SparkPlSqlParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SparkPlSqlParser.WHERE, 0); }
		public TerminalNode OVER() { return getToken(SparkPlSqlParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkPlSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkPlSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkPlSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SparkPlSqlParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SparkPlSqlParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkPlSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkPlSqlParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2437);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2438);
				match(CASE);
				setState(2440); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2439);
					whenClause();
					}
					}
					setState(2442); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2444);
					match(ELSE);
					setState(2445);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2448);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2450);
				match(CASE);
				setState(2451);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2453); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2452);
					whenClause();
					}
					}
					setState(2455); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2457);
					match(ELSE);
					setState(2458);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2461);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2463);
				match(CAST);
				setState(2464);
				match(T__1);
				setState(2465);
				expression();
				setState(2466);
				match(AS);
				setState(2467);
				dataType();
				setState(2468);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2470);
				match(STRUCT);
				setState(2471);
				match(T__1);
				setState(2480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2472);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2473);
						match(T__3);
						setState(2474);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2479);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2482);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2483);
				match(FIRST);
				setState(2484);
				match(T__1);
				setState(2485);
				expression();
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2486);
					match(IGNORE);
					setState(2487);
					match(NULLS);
					}
				}

				setState(2490);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2492);
				match(LAST);
				setState(2493);
				match(T__1);
				setState(2494);
				expression();
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2495);
					match(IGNORE);
					setState(2496);
					match(NULLS);
					}
				}

				setState(2499);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2501);
				match(POSITION);
				setState(2502);
				match(T__1);
				setState(2503);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2504);
				match(IN);
				setState(2505);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2506);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2508);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2509);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2510);
				qualifiedName();
				setState(2511);
				match(T__4);
				setState(2512);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2514);
				match(T__1);
				setState(2515);
				namedExpression();
				setState(2518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2516);
					match(T__3);
					setState(2517);
					namedExpression();
					}
					}
					setState(2520); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2522);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2524);
				match(T__1);
				setState(2525);
				query();
				setState(2526);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2528);
				functionName();
				setState(2529);
				match(T__1);
				setState(2541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2531);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
					case 1:
						{
						setState(2530);
						setQuantifier();
						}
						break;
					}
					setState(2533);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2534);
						match(T__3);
						setState(2535);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2540);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2543);
				match(T__2);
				setState(2550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2544);
					match(FILTER);
					setState(2545);
					match(T__1);
					setState(2546);
					match(WHERE);
					setState(2547);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2548);
					match(T__2);
					}
					break;
				}
				setState(2554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2552);
					match(OVER);
					setState(2553);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2556);
				identifier();
				setState(2557);
				match(T__7);
				setState(2558);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2560);
				match(T__1);
				setState(2561);
				identifier();
				setState(2564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2562);
					match(T__3);
					setState(2563);
					identifier();
					}
					}
					setState(2566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2568);
				match(T__2);
				setState(2569);
				match(T__7);
				setState(2570);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2572);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2573);
				match(T__1);
				setState(2574);
				expression();
				setState(2575);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2577);
				match(EXTRACT);
				setState(2578);
				match(T__1);
				setState(2579);
				((ExtractContext)_localctx).field = identifier();
				setState(2580);
				match(FROM);
				setState(2581);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2582);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2584);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2585);
				match(T__1);
				setState(2586);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2587);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2588);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2589);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2590);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2593);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2595);
				match(TRIM);
				setState(2596);
				match(T__1);
				setState(2598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2597);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2600);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2603);
				match(FROM);
				setState(2604);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2605);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2607);
				match(OVERLAY);
				setState(2608);
				match(T__1);
				setState(2609);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2610);
				match(PLACING);
				setState(2611);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2612);
				match(FROM);
				setState(2613);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2614);
					match(FOR);
					setState(2615);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2618);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2630);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2622);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2623);
						match(T__8);
						setState(2624);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2625);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2627);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2628);
						match(T__4);
						setState(2629);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SparkPlSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkPlSqlParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_constant);
		try {
			int _alt;
			setState(2647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2635);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2636);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2637);
				identifier();
				setState(2638);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2640);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2641);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2643); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2642);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2645); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SparkPlSqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SparkPlSqlParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SparkPlSqlParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SparkPlSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SparkPlSqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SparkPlSqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SparkPlSqlParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SparkPlSqlParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2649);
			_la = _input.LA(1);
			if ( !(((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (EQ - 264)) | (1L << (NSEQ - 264)) | (1L << (NEQ - 264)) | (1L << (NEQJ - 264)) | (1L << (LT - 264)) | (1L << (LTE - 264)) | (1L << (GT - 264)) | (1L << (GTE - 264)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SparkPlSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkPlSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkPlSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkPlSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkPlSqlParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SparkPlSqlParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkPlSqlParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SparkPlSqlParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkPlSqlParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SparkPlSqlParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2651);
			_la = _input.LA(1);
			if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (PLUS - 272)) | (1L << (MINUS - 272)) | (1L << (ASTERISK - 272)) | (1L << (SLASH - 272)) | (1L << (PERCENT - 272)) | (1L << (DIV - 272)) | (1L << (TILDE - 272)) | (1L << (AMPERSAND - 272)) | (1L << (PIPE - 272)) | (1L << (CONCAT_PIPE - 272)) | (1L << (HAT - 272)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SparkPlSqlParser.OR, 0); }
		public TerminalNode AND() { return getToken(SparkPlSqlParser.AND, 0); }
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2653);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (IN - 113)) | (1L << (NOT - 113)) | (1L << (OR - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SparkPlSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkPlSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SparkPlSqlParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(INTERVAL);
			setState(2660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				{
				setState(2658);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2659);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			multiUnitsInterval();
			setState(2664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				{
				setState(2663);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2669); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2666);
					intervalValue();
					setState(2667);
					intervalUnit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2671); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2673);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2674);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2675);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IntervalUnitContext from;
		public IntervalUnitContext to;
		public TerminalNode TO() { return getToken(SparkPlSqlParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2678);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2679);
			((UnitToUnitIntervalContext)_localctx).from = intervalUnit();
			setState(2680);
			match(TO);
			setState(2681);
			((UnitToUnitIntervalContext)_localctx).to = intervalUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkPlSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkPlSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SparkPlSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SparkPlSqlParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_intervalValue);
		int _la;
		try {
			setState(2688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2683);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2686);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2687);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(SparkPlSqlParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SparkPlSqlParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SparkPlSqlParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SparkPlSqlParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(SparkPlSqlParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(SparkPlSqlParser.YEAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_intervalUnit);
		try {
			setState(2697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2690);
				match(DAY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2691);
				match(HOUR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2692);
				match(MINUTE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2693);
				match(MONTH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2694);
				match(SECOND);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2695);
				match(YEAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2696);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SparkPlSqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkPlSqlParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_colPosition);
		try {
			setState(2702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2699);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2700);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2701);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SparkPlSqlParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SparkPlSqlParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SparkPlSqlParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SparkPlSqlParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SparkPlSqlParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SparkPlSqlParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkPlSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkPlSqlParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_dataType);
		int _la;
		try {
			setState(2738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2704);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2705);
				match(LT);
				setState(2706);
				dataType();
				setState(2707);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2709);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2710);
				match(LT);
				setState(2711);
				dataType();
				setState(2712);
				match(T__3);
				setState(2713);
				dataType();
				setState(2714);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2716);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2723);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2717);
					match(LT);
					setState(2719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
					case 1:
						{
						setState(2718);
						complexColTypeList();
						}
						break;
					}
					setState(2721);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2722);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2725);
				identifier();
				setState(2736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
				case 1:
					{
					setState(2726);
					match(T__1);
					setState(2727);
					match(INTEGER_VALUE);
					setState(2732);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2728);
						match(T__3);
						setState(2729);
						match(INTEGER_VALUE);
						}
						}
						setState(2734);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2735);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2740);
			qualifiedColTypeWithPosition();
			setState(2745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2741);
				match(T__3);
				setState(2742);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2748);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2749);
			dataType();
			setState(2752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2750);
				match(NOT);
				setState(2751);
				match(NULL);
				}
			}

			setState(2755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2754);
				commentSpec();
				}
			}

			setState(2758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2757);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2760);
			colType();
			setState(2765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2761);
					match(T__3);
					setState(2762);
					colType();
					}
					} 
				}
				setState(2767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2769);
			dataType();
			setState(2772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2770);
				match(NOT);
				setState(2771);
				match(NULL);
				}
				break;
			}
			setState(2775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2774);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
			complexColType();
			setState(2782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2778);
				match(T__3);
				setState(2779);
				complexColType();
				}
				}
				setState(2784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
			identifier();
			setState(2786);
			match(T__10);
			setState(2787);
			dataType();
			setState(2790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2788);
				match(NOT);
				setState(2789);
				match(NULL);
				}
			}

			setState(2793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2792);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SparkPlSqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SparkPlSqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
			match(WHEN);
			setState(2796);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2797);
			match(THEN);
			setState(2798);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SparkPlSqlParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2800);
			match(WINDOW);
			setState(2801);
			namedWindow();
			setState(2806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2802);
					match(T__3);
					setState(2803);
					namedWindow();
					}
					} 
				}
				setState(2808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2809);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2810);
			match(AS);
			setState(2811);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SparkPlSqlParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkPlSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkPlSqlParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SparkPlSqlParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkPlSqlParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SparkPlSqlParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SparkPlSqlParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_windowSpec);
		int _la;
		try {
			setState(2859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2813);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2814);
				match(T__1);
				setState(2815);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2816);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2818);
				match(T__1);
				setState(2853);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2819);
					match(CLUSTER);
					setState(2820);
					match(BY);
					setState(2821);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2826);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2822);
						match(T__3);
						setState(2823);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2828);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2839);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2829);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2830);
						match(BY);
						setState(2831);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2836);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2832);
							match(T__3);
							setState(2833);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2838);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2851);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2841);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2842);
						match(BY);
						setState(2843);
						sortItem();
						setState(2848);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2844);
							match(T__3);
							setState(2845);
							sortItem();
							}
							}
							setState(2850);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2855);
					windowFrame();
					}
				}

				setState(2858);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SparkPlSqlParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SparkPlSqlParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkPlSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SparkPlSqlParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_windowFrame);
		try {
			setState(2877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2861);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2862);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2863);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2864);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2865);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2866);
				match(BETWEEN);
				setState(2867);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2868);
				match(AND);
				setState(2869);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2871);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2872);
				match(BETWEEN);
				setState(2873);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2874);
				match(AND);
				setState(2875);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SparkPlSqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkPlSqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkPlSqlParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SparkPlSqlParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkPlSqlParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_frameBound);
		int _la;
		try {
			setState(2886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2879);
				match(UNBOUNDED);
				setState(2880);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2881);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2882);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2883);
				expression();
				setState(2884);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
			qualifiedName();
			setState(2893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2889);
				match(T__3);
				setState(2890);
				qualifiedName();
				}
				}
				setState(2895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SparkPlSqlParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SparkPlSqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SparkPlSqlParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_functionName);
		try {
			setState(2900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2896);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2897);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2898);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2899);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2902);
			identifier();
			setState(2907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,376,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2903);
					match(T__4);
					setState(2904);
					identifier();
					}
					} 
				}
				setState(2909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,376,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2910);
			identifier();
			setState(2911);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SparkPlSqlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SparkPlSqlParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2915); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2913);
						match(MINUS);
						setState(2914);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2917); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_identifier);
		try {
			setState(2925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2922);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2923);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2924);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SparkPlSqlParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_strictIdentifier);
		try {
			setState(2933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2927);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2928);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2929);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(2930);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2931);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2932);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SparkPlSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2935);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkPlSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SparkPlSqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SparkPlSqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SparkPlSqlParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkPlSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SparkPlSqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SparkPlSqlParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SparkPlSqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkPlSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SparkPlSqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkPlSqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_number);
		int _la;
		try {
			setState(2976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2937);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2938);
					match(MINUS);
					}
				}

				setState(2941);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2942);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2943);
					match(MINUS);
					}
				}

				setState(2946);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2947);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(2949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2948);
					match(MINUS);
					}
				}

				setState(2951);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2952);
					match(MINUS);
					}
				}

				setState(2955);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2956);
					match(MINUS);
					}
				}

				setState(2959);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2960);
					match(MINUS);
					}
				}

				setState(2963);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2964);
					match(MINUS);
					}
				}

				setState(2967);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2968);
					match(MINUS);
					}
				}

				setState(2971);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2972);
					match(MINUS);
					}
				}

				setState(2975);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(SparkPlSqlParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_alterColumnAction);
		int _la;
		try {
			setState(2985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2978);
				match(TYPE);
				setState(2979);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2980);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(2981);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(2982);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2983);
				match(NOT);
				setState(2984);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SparkPlSqlParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SparkPlSqlParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkPlSqlParser.ANALYZE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkPlSqlParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SparkPlSqlParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SparkPlSqlParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SparkPlSqlParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkPlSqlParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SparkPlSqlParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkPlSqlParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SparkPlSqlParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SparkPlSqlParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkPlSqlParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkPlSqlParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SparkPlSqlParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkPlSqlParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkPlSqlParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkPlSqlParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkPlSqlParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkPlSqlParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkPlSqlParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SparkPlSqlParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SparkPlSqlParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkPlSqlParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkPlSqlParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkPlSqlParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SparkPlSqlParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SparkPlSqlParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SparkPlSqlParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SparkPlSqlParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SparkPlSqlParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SparkPlSqlParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkPlSqlParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SparkPlSqlParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SparkPlSqlParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkPlSqlParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkPlSqlParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SparkPlSqlParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkPlSqlParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkPlSqlParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkPlSqlParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SparkPlSqlParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkPlSqlParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkPlSqlParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkPlSqlParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SparkPlSqlParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkPlSqlParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkPlSqlParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkPlSqlParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SparkPlSqlParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkPlSqlParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SparkPlSqlParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkPlSqlParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SparkPlSqlParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkPlSqlParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkPlSqlParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkPlSqlParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkPlSqlParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SparkPlSqlParser.GROUPING, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SparkPlSqlParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkPlSqlParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SparkPlSqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkPlSqlParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SparkPlSqlParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkPlSqlParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SparkPlSqlParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkPlSqlParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SparkPlSqlParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkPlSqlParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SparkPlSqlParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SparkPlSqlParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SparkPlSqlParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SparkPlSqlParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SparkPlSqlParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SparkPlSqlParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SparkPlSqlParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SparkPlSqlParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SparkPlSqlParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SparkPlSqlParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SparkPlSqlParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkPlSqlParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkPlSqlParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SparkPlSqlParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SparkPlSqlParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SparkPlSqlParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(SparkPlSqlParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkPlSqlParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkPlSqlParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SparkPlSqlParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SparkPlSqlParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SparkPlSqlParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SparkPlSqlParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkPlSqlParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SparkPlSqlParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkPlSqlParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SparkPlSqlParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SparkPlSqlParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkPlSqlParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkPlSqlParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkPlSqlParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkPlSqlParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkPlSqlParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkPlSqlParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SparkPlSqlParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SparkPlSqlParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkPlSqlParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkPlSqlParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkPlSqlParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SparkPlSqlParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SparkPlSqlParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SparkPlSqlParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkPlSqlParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkPlSqlParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SparkPlSqlParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SparkPlSqlParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SparkPlSqlParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SparkPlSqlParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SparkPlSqlParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkPlSqlParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SparkPlSqlParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkPlSqlParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkPlSqlParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SparkPlSqlParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SparkPlSqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkPlSqlParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkPlSqlParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkPlSqlParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SparkPlSqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SparkPlSqlParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkPlSqlParser.SCHEMA, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkPlSqlParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SparkPlSqlParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkPlSqlParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SparkPlSqlParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SparkPlSqlParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SparkPlSqlParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SparkPlSqlParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SparkPlSqlParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkPlSqlParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SparkPlSqlParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkPlSqlParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkPlSqlParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SparkPlSqlParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkPlSqlParser.SUBSTRING, 0); }
		public TerminalNode TABLES() { return getToken(SparkPlSqlParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkPlSqlParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkPlSqlParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkPlSqlParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SparkPlSqlParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkPlSqlParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkPlSqlParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkPlSqlParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SparkPlSqlParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SparkPlSqlParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkPlSqlParser.TRUNCATE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkPlSqlParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkPlSqlParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkPlSqlParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkPlSqlParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SparkPlSqlParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SparkPlSqlParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SparkPlSqlParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SparkPlSqlParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkPlSqlParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(SparkPlSqlParser.WINDOW, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2987);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DBPROPERTIES - 65)) | (1L << (DEFINED - 65)) | (1L << (DELETE - 65)) | (1L << (DELIMITED - 65)) | (1L << (DESC - 65)) | (1L << (DESCRIBE - 65)) | (1L << (DFS - 65)) | (1L << (DIRECTORIES - 65)) | (1L << (DIRECTORY - 65)) | (1L << (DISTRIBUTE - 65)) | (1L << (DROP - 65)) | (1L << (ESCAPED - 65)) | (1L << (EXCHANGE - 65)) | (1L << (EXISTS - 65)) | (1L << (EXPLAIN - 65)) | (1L << (EXPORT - 65)) | (1L << (EXTENDED - 65)) | (1L << (EXTERNAL - 65)) | (1L << (EXTRACT - 65)) | (1L << (FIELDS - 65)) | (1L << (FILEFORMAT - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FORMATTED - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GLOBAL - 65)) | (1L << (GROUPING - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (IMPORT - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INPATH - 65)) | (1L << (INPUTFORMAT - 65)) | (1L << (INSERT - 65)) | (1L << (INTERVAL - 65)) | (1L << (ITEMS - 65)) | (1L << (KEYS - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LAZY - 129)) | (1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OUT - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPAIR - 129)) | (1L << (REPLACE - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (RESET - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SET - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESAMPLE - 193)) | (1L << (TBLPROPERTIES - 193)) | (1L << (TEMPORARY - 193)) | (1L << (TERMINATED - 193)) | (1L << (TOUCH - 193)) | (1L << (TRANSACTION - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (TRANSFORM - 193)) | (1L << (TRIM - 193)) | (1L << (TRUE - 193)) | (1L << (TRUNCATE - 193)) | (1L << (UNARCHIVE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNCACHE - 193)) | (1L << (UNLOCK - 193)) | (1L << (UNSET - 193)) | (1L << (UPDATE - 193)) | (1L << (USE - 193)) | (1L << (VALUES - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (VIEW - 257)) | (1L << (VIEWS - 257)) | (1L << (WINDOW - 257)) | (1L << (DIV - 257)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SparkPlSqlParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SparkPlSqlParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkPlSqlParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SparkPlSqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SparkPlSqlParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SparkPlSqlParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SparkPlSqlParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SparkPlSqlParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SparkPlSqlParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SparkPlSqlParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SparkPlSqlParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SparkPlSqlParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkPlSqlParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SparkPlSqlParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SparkPlSqlParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2989);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (ANTI - 18)) | (1L << (CROSS - 18)) | (1L << (EXCEPT - 18)))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (FULL - 101)) | (1L << (INNER - 101)) | (1L << (INTERSECT - 101)) | (1L << (JOIN - 101)) | (1L << (LEFT - 101)) | (1L << (NATURAL - 101)) | (1L << (ON - 101)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (RIGHT - 196)) | (1L << (SEMI - 196)) | (1L << (SETMINUS - 196)) | (1L << (UNION - 196)) | (1L << (USING - 196)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SparkPlSqlParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SparkPlSqlParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SparkPlSqlParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SparkPlSqlParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkPlSqlParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SparkPlSqlParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SparkPlSqlParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkPlSqlParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SparkPlSqlParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SparkPlSqlParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SparkPlSqlParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SparkPlSqlParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SparkPlSqlParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkPlSqlParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SparkPlSqlParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SparkPlSqlParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkPlSqlParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SparkPlSqlParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SparkPlSqlParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkPlSqlParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SparkPlSqlParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SparkPlSqlParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SparkPlSqlParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SparkPlSqlParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SparkPlSqlParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkPlSqlParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkPlSqlParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkPlSqlParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SparkPlSqlParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkPlSqlParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SparkPlSqlParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkPlSqlParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkPlSqlParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SparkPlSqlParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SparkPlSqlParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkPlSqlParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkPlSqlParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkPlSqlParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SparkPlSqlParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SparkPlSqlParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SparkPlSqlParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SparkPlSqlParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SparkPlSqlParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SparkPlSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SparkPlSqlParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SparkPlSqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SparkPlSqlParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SparkPlSqlParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SparkPlSqlParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SparkPlSqlParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SparkPlSqlParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkPlSqlParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SparkPlSqlParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SparkPlSqlParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkPlSqlParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SparkPlSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkPlSqlParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SparkPlSqlParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkPlSqlParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkPlSqlParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkPlSqlParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkPlSqlParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SparkPlSqlParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SparkPlSqlParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SparkPlSqlParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SparkPlSqlParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SparkPlSqlParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkPlSqlParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkPlSqlParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SparkPlSqlParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkPlSqlParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SparkPlSqlParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkPlSqlParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkPlSqlParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkPlSqlParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SparkPlSqlParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SparkPlSqlParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SparkPlSqlParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SparkPlSqlParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkPlSqlParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SparkPlSqlParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkPlSqlParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SparkPlSqlParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SparkPlSqlParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SparkPlSqlParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkPlSqlParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SparkPlSqlParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkPlSqlParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkPlSqlParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkPlSqlParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SparkPlSqlParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SparkPlSqlParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SparkPlSqlParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SparkPlSqlParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SparkPlSqlParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SparkPlSqlParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SparkPlSqlParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkPlSqlParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SparkPlSqlParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SparkPlSqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkPlSqlParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SparkPlSqlParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkPlSqlParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SparkPlSqlParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkPlSqlParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SparkPlSqlParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SparkPlSqlParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SparkPlSqlParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkPlSqlParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SparkPlSqlParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SparkPlSqlParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SparkPlSqlParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SparkPlSqlParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SparkPlSqlParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SparkPlSqlParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SparkPlSqlParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SparkPlSqlParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SparkPlSqlParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SparkPlSqlParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SparkPlSqlParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SparkPlSqlParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SparkPlSqlParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkPlSqlParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkPlSqlParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SparkPlSqlParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SparkPlSqlParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SparkPlSqlParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SparkPlSqlParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SparkPlSqlParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SparkPlSqlParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkPlSqlParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkPlSqlParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SparkPlSqlParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SparkPlSqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkPlSqlParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SparkPlSqlParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SparkPlSqlParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SparkPlSqlParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SparkPlSqlParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkPlSqlParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SparkPlSqlParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SparkPlSqlParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SparkPlSqlParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SparkPlSqlParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkPlSqlParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SparkPlSqlParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SparkPlSqlParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SparkPlSqlParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkPlSqlParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkPlSqlParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkPlSqlParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkPlSqlParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkPlSqlParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkPlSqlParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SparkPlSqlParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SparkPlSqlParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkPlSqlParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SparkPlSqlParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkPlSqlParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkPlSqlParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SparkPlSqlParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SparkPlSqlParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SparkPlSqlParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkPlSqlParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkPlSqlParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SparkPlSqlParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SparkPlSqlParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SparkPlSqlParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SparkPlSqlParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SparkPlSqlParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SparkPlSqlParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkPlSqlParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SparkPlSqlParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkPlSqlParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkPlSqlParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SparkPlSqlParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SparkPlSqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkPlSqlParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkPlSqlParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkPlSqlParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SparkPlSqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SparkPlSqlParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkPlSqlParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SparkPlSqlParser.SECOND, 0); }
		public TerminalNode SELECT() { return getToken(SparkPlSqlParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkPlSqlParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SparkPlSqlParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkPlSqlParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SparkPlSqlParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SparkPlSqlParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SparkPlSqlParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SparkPlSqlParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SparkPlSqlParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SparkPlSqlParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SparkPlSqlParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SparkPlSqlParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SparkPlSqlParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkPlSqlParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SparkPlSqlParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkPlSqlParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkPlSqlParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SparkPlSqlParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkPlSqlParser.SUBSTRING, 0); }
		public TerminalNode TABLE() { return getToken(SparkPlSqlParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SparkPlSqlParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkPlSqlParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkPlSqlParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkPlSqlParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkPlSqlParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SparkPlSqlParser.THEN, 0); }
		public TerminalNode TO() { return getToken(SparkPlSqlParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SparkPlSqlParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SparkPlSqlParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkPlSqlParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkPlSqlParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkPlSqlParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SparkPlSqlParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SparkPlSqlParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkPlSqlParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SparkPlSqlParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkPlSqlParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkPlSqlParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkPlSqlParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SparkPlSqlParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SparkPlSqlParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkPlSqlParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SparkPlSqlParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SparkPlSqlParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SparkPlSqlParser.USE, 0); }
		public TerminalNode USER() { return getToken(SparkPlSqlParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SparkPlSqlParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SparkPlSqlParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkPlSqlParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(SparkPlSqlParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SparkPlSqlParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SparkPlSqlParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SparkPlSqlParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SparkPlSqlParser.YEAR, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkPlSqlListener ) ((SparkPlSqlListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkPlSqlVisitor ) return ((SparkPlSqlVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2991);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAY - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFERENCES - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SCHEMA - 192)) | (1L << (SECOND - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (UNLOCK - 192)) | (1L << (UNSET - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (DIV - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 95:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 97:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 98:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 130:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 131:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 133:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u012c\u0bb4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\3\2\6\2\u0118\n\2\r\2\16\2\u0119\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u0123\n\4\f\4\16\4\u0126\13\4\3\5\3\5\7\5"+
		"\u012a\n\5\f\5\16\5\u012d\13\5\3\6\3\6\7\6\u0131\n\6\f\6\16\6\u0134\13"+
		"\6\3\7\3\7\7\7\u0138\n\7\f\7\16\7\u013b\13\7\3\b\3\b\7\b\u013f\n\b\f\b"+
		"\16\b\u0142\13\b\3\t\3\t\7\t\u0146\n\t\f\t\16\t\u0149\13\t\3\n\3\n\5\n"+
		"\u014d\n\n\3\n\3\n\3\n\5\n\u0152\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u015a"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0162\n\n\f\n\16\n\u0165\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0178"+
		"\n\n\3\n\3\n\5\n\u017c\n\n\3\n\3\n\3\n\3\n\5\n\u0182\n\n\3\n\5\n\u0185"+
		"\n\n\3\n\5\n\u0188\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u018f\n\n\3\n\3\n\3\n\5"+
		"\n\u0194\n\n\3\n\5\n\u0197\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u019e\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01aa\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u01b3\n\n\f\n\16\n\u01b6\13\n\3\n\5\n\u01b9\n\n\3\n\5\n\u01bc"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u01c3\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u01ce\n\n\f\n\16\n\u01d1\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u01d8\n"+
		"\n\3\n\3\n\3\n\5\n\u01dd\n\n\3\n\5\n\u01e0\n\n\3\n\3\n\3\n\3\n\5\n\u01e6"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01f1\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0231\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u023a"+
		"\n\n\3\n\3\n\5\n\u023e\n\n\3\n\3\n\3\n\3\n\5\n\u0244\n\n\3\n\3\n\5\n\u0248"+
		"\n\n\3\n\3\n\3\n\5\n\u024d\n\n\3\n\3\n\3\n\3\n\5\n\u0253\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u025b\n\n\3\n\3\n\3\n\3\n\5\n\u0261\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u026e\n\n\3\n\6\n\u0271\n\n\r\n\16"+
		"\n\u0272\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0283"+
		"\n\n\3\n\3\n\3\n\7\n\u0288\n\n\f\n\16\n\u028b\13\n\3\n\5\n\u028e\n\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0294\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u02a3\n\n\3\n\3\n\5\n\u02a7\n\n\3\n\3\n\3\n\3\n\5\n\u02ad"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u02b3\n\n\3\n\5\n\u02b6\n\n\3\n\5\n\u02b9\n\n"+
		"\3\n\3\n\3\n\3\n\5\n\u02bf\n\n\3\n\3\n\5\n\u02c3\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u02cb\n\n\f\n\16\n\u02ce\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u02d6"+
		"\n\n\3\n\5\n\u02d9\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u02e2\n\n\3\n\3"+
		"\n\3\n\5\n\u02e7\n\n\3\n\3\n\3\n\3\n\5\n\u02ed\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u02f4\n\n\3\n\5\n\u02f7\n\n\3\n\3\n\3\n\3\n\5\n\u02fd\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u0306\n\n\f\n\16\n\u0309\13\n\5\n\u030b\n\n\3"+
		"\n\3\n\5\n\u030f\n\n\3\n\3\n\3\n\5\n\u0314\n\n\3\n\3\n\3\n\5\n\u0319\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0320\n\n\3\n\5\n\u0323\n\n\3\n\5\n\u0326\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u032d\n\n\3\n\3\n\3\n\5\n\u0332\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u033b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0343\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0349\n\n\3\n\5\n\u034c\n\n\3\n\5\n\u034f\n\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0355\n\n\3\n\3\n\5\n\u0359\n\n\3\n\3\n\5\n\u035d\n"+
		"\n\3\n\3\n\5\n\u0361\n\n\5\n\u0363\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u036b"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0373\n\n\3\n\3\n\3\n\3\n\5\n\u0379\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u037f\n\n\3\n\5\n\u0382\n\n\3\n\3\n\5\n\u0386\n"+
		"\n\3\n\5\n\u0389\n\n\3\n\3\n\5\n\u038d\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u03a4\n\n"+
		"\f\n\16\n\u03a7\13\n\5\n\u03a9\n\n\3\n\3\n\5\n\u03ad\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u03b3\n\n\3\n\5\n\u03b6\n\n\3\n\5\n\u03b9\n\n\3\n\3\n\3\n\3\n\5"+
		"\n\u03bf\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u03c7\n\n\3\n\3\n\3\n\5\n\u03cc"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u03d2\n\n\3\n\3\n\3\n\3\n\5\n\u03d8\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u03e2\n\n\f\n\16\n\u03e5\13\n\5\n\u03e7"+
		"\n\n\3\n\3\n\3\n\7\n\u03ec\n\n\f\n\16\n\u03ef\13\n\3\n\3\n\7\n\u03f3\n"+
		"\n\f\n\16\n\u03f6\13\n\3\n\3\n\3\n\7\n\u03fb\n\n\f\n\16\n\u03fe\13\n\5"+
		"\n\u0400\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0408\n\13\3\13\3\13\5"+
		"\13\u040c\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u0413\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0487\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u048f\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0497\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u04a0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u04aa\n"+
		"\13\3\f\3\f\5\f\u04ae\n\f\3\f\5\f\u04b1\n\f\3\f\3\f\3\f\3\f\5\f\u04b7"+
		"\n\f\3\f\3\f\3\r\3\r\5\r\u04bd\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u04c9\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u04d5\n\17\3\17\3\17\3\17\5\17\u04da\n\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\5\22\u04e3\n\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u04eb\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u04f2\n\23\5\23\u04f4\n\23\3"+
		"\23\3\23\3\23\5\23\u04f9\n\23\3\23\3\23\5\23\u04fd\n\23\3\23\3\23\3\23"+
		"\5\23\u0502\n\23\3\23\3\23\3\23\5\23\u0507\n\23\3\23\3\23\3\23\5\23\u050c"+
		"\n\23\3\23\5\23\u050f\n\23\3\23\3\23\3\23\5\23\u0514\n\23\3\23\3\23\5"+
		"\23\u0518\n\23\3\23\3\23\3\23\5\23\u051d\n\23\5\23\u051f\n\23\3\24\3\24"+
		"\5\24\u0523\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u052a\n\25\f\25\16\25\u052d"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u0534\n\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u053d\n\30\3\31\3\31\3\31\7\31\u0542\n\31\f\31\16\31"+
		"\u0545\13\31\3\32\3\32\3\32\3\32\7\32\u054b\n\32\f\32\16\32\u054e\13\32"+
		"\3\33\3\33\5\33\u0552\n\33\3\33\5\33\u0555\n\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0568"+
		"\n\35\f\35\16\35\u056b\13\35\3\36\3\36\3\36\3\36\7\36\u0571\n\36\f\36"+
		"\16\36\u0574\13\36\3\36\3\36\3\37\3\37\5\37\u057a\n\37\3\37\5\37\u057d"+
		"\n\37\3 \3 \3 \7 \u0582\n \f \16 \u0585\13 \3 \5 \u0588\n \3!\3!\3!\3"+
		"!\5!\u058e\n!\3\"\3\"\3\"\3\"\7\"\u0594\n\"\f\"\16\"\u0597\13\"\3\"\3"+
		"\"\3#\3#\3#\3#\7#\u059f\n#\f#\16#\u05a2\13#\3#\3#\3$\3$\3$\3$\3$\3$\5"+
		"$\u05ac\n$\3%\3%\3%\3%\3%\5%\u05b3\n%\3&\3&\3&\3&\5&\u05b9\n&\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\6(\u05c4\n(\r(\16(\u05c5\3(\3(\3(\3(\3(\5(\u05cd"+
		"\n(\3(\3(\3(\3(\3(\5(\u05d4\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u05e0"+
		"\n(\3(\3(\3(\3(\7(\u05e6\n(\f(\16(\u05e9\13(\3(\7(\u05ec\n(\f(\16(\u05ef"+
		"\13(\5(\u05f1\n(\3)\3)\3)\3)\3)\7)\u05f8\n)\f)\16)\u05fb\13)\5)\u05fd"+
		"\n)\3)\3)\3)\3)\3)\7)\u0604\n)\f)\16)\u0607\13)\5)\u0609\n)\3)\3)\3)\3"+
		")\3)\7)\u0610\n)\f)\16)\u0613\13)\5)\u0615\n)\3)\3)\3)\3)\3)\7)\u061c"+
		"\n)\f)\16)\u061f\13)\5)\u0621\n)\3)\5)\u0624\n)\3)\3)\3)\5)\u0629\n)\5"+
		")\u062b\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u0637\n+\3+\3+\3+\3+\3+\5"+
		"+\u063e\n+\3+\3+\3+\3+\3+\5+\u0645\n+\3+\7+\u0648\n+\f+\16+\u064b\13+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0656\n,\3-\3-\5-\u065a\n-\3-\3-\5-\u065e"+
		"\n-\3.\3.\6.\u0662\n.\r.\16.\u0663\3/\3/\5/\u0668\n/\3/\3/\3/\3/\7/\u066e"+
		"\n/\f/\16/\u0671\13/\3/\5/\u0674\n/\3/\5/\u0677\n/\3/\5/\u067a\n/\3/\5"+
		"/\u067d\n/\3/\3/\5/\u0681\n/\3\60\3\60\5\60\u0685\n\60\3\60\5\60\u0688"+
		"\n\60\3\60\3\60\5\60\u068c\n\60\3\60\7\60\u068f\n\60\f\60\16\60\u0692"+
		"\13\60\3\60\5\60\u0695\n\60\3\60\5\60\u0698\n\60\3\60\5\60\u069b\n\60"+
		"\3\60\5\60\u069e\n\60\5\60\u06a0\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u06ac\n\61\3\61\5\61\u06af\n\61\3\61\3\61\5\61"+
		"\u06b3\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u06bd\n\61\3"+
		"\61\3\61\5\61\u06c1\n\61\5\61\u06c3\n\61\3\61\5\61\u06c6\n\61\3\61\3\61"+
		"\5\61\u06ca\n\61\3\62\3\62\7\62\u06ce\n\62\f\62\16\62\u06d1\13\62\3\62"+
		"\5\62\u06d4\n\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u06df"+
		"\n\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u06e9\n\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u06f5\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0702\n\67\f\67\16\67\u0705"+
		"\13\67\3\67\3\67\5\67\u0709\n\67\38\38\38\78\u070e\n8\f8\168\u0711\13"+
		"8\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\5<\u0720\n<\3<\7<\u0723\n<\f"+
		"<\16<\u0726\13<\3<\3<\3=\3=\3=\3=\3=\3=\7=\u0730\n=\f=\16=\u0733\13=\3"+
		"=\3=\5=\u0737\n=\3>\3>\3>\3>\7>\u073d\n>\f>\16>\u0740\13>\3>\7>\u0743"+
		"\n>\f>\16>\u0746\13>\3>\5>\u0749\n>\3?\3?\3?\3?\3?\7?\u0750\n?\f?\16?"+
		"\u0753\13?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u075f\n?\f?\16?\u0762\13?"+
		"\3?\3?\5?\u0766\n?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0770\n?\f?\16?\u0773\13"+
		"?\3?\3?\5?\u0777\n?\3@\3@\3@\3@\7@\u077d\n@\f@\16@\u0780\13@\5@\u0782"+
		"\n@\3@\3@\5@\u0786\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u0792\nA\fA\16"+
		"A\u0795\13A\3A\3A\3A\3B\3B\3B\3B\3B\7B\u079f\nB\fB\16B\u07a2\13B\3B\3"+
		"B\5B\u07a6\nB\3C\3C\5C\u07aa\nC\3C\5C\u07ad\nC\3D\3D\3D\5D\u07b2\nD\3"+
		"D\3D\3D\3D\3D\7D\u07b9\nD\fD\16D\u07bc\13D\5D\u07be\nD\3D\3D\3D\5D\u07c3"+
		"\nD\3D\3D\3D\7D\u07c8\nD\fD\16D\u07cb\13D\5D\u07cd\nD\3E\3E\3F\3F\7F\u07d3"+
		"\nF\fF\16F\u07d6\13F\3G\3G\3G\3G\5G\u07dc\nG\3G\3G\3G\3G\3G\5G\u07e3\n"+
		"G\3H\5H\u07e6\nH\3H\3H\3H\5H\u07eb\nH\3H\5H\u07ee\nH\3H\3H\3H\5H\u07f3"+
		"\nH\3H\3H\5H\u07f7\nH\3H\5H\u07fa\nH\3H\5H\u07fd\nH\3I\3I\3I\3I\5I\u0803"+
		"\nI\3J\3J\3J\5J\u0808\nJ\3J\3J\3K\5K\u080d\nK\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\5K\u081f\nK\5K\u0821\nK\3K\5K\u0824\nK\3L\3L"+
		"\3L\3L\3M\3M\3M\7M\u082d\nM\fM\16M\u0830\13M\3N\3N\3N\3N\7N\u0836\nN\f"+
		"N\16N\u0839\13N\3N\3N\3O\3O\5O\u083f\nO\3P\3P\3P\3P\7P\u0845\nP\fP\16"+
		"P\u0848\13P\3P\3P\3Q\3Q\5Q\u084e\nQ\3R\3R\5R\u0852\nR\3R\3R\3R\3R\3R\3"+
		"R\5R\u085a\nR\3R\3R\3R\3R\3R\3R\5R\u0862\nR\3R\3R\3R\3R\5R\u0868\nR\3"+
		"S\3S\3S\3S\7S\u086e\nS\fS\16S\u0871\13S\3S\3S\3T\3T\3T\3T\3T\7T\u087a"+
		"\nT\fT\16T\u087d\13T\5T\u087f\nT\3T\3T\3T\3U\5U\u0885\nU\3U\3U\5U\u0889"+
		"\nU\5U\u088b\nU\3V\3V\3V\3V\3V\3V\3V\5V\u0894\nV\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\5V\u08a0\nV\5V\u08a2\nV\3V\3V\3V\3V\3V\5V\u08a9\nV\3V\3V\3V"+
		"\3V\3V\5V\u08b0\nV\3V\3V\3V\3V\5V\u08b6\nV\3V\3V\3V\3V\5V\u08bc\nV\5V"+
		"\u08be\nV\3W\3W\3W\7W\u08c3\nW\fW\16W\u08c6\13W\3X\3X\3X\7X\u08cb\nX\f"+
		"X\16X\u08ce\13X\3Y\3Y\3Y\5Y\u08d3\nY\3Y\3Y\3Z\3Z\3Z\5Z\u08da\nZ\3Z\3Z"+
		"\3[\3[\5[\u08e0\n[\3[\3[\5[\u08e4\n[\5[\u08e6\n[\3\\\3\\\3\\\7\\\u08eb"+
		"\n\\\f\\\16\\\u08ee\13\\\3]\3]\3]\3]\7]\u08f4\n]\f]\16]\u08f7\13]\3]\3"+
		"]\3^\3^\3^\3^\3^\3^\7^\u0901\n^\f^\16^\u0904\13^\3^\3^\5^\u0908\n^\3_"+
		"\3_\5_\u090c\n_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u091a\na\5a\u091c"+
		"\na\3a\3a\3a\3a\3a\3a\7a\u0924\na\fa\16a\u0927\13a\3b\5b\u092a\nb\3b\3"+
		"b\3b\3b\3b\3b\5b\u0932\nb\3b\3b\3b\3b\3b\7b\u0939\nb\fb\16b\u093c\13b"+
		"\3b\3b\3b\5b\u0941\nb\3b\3b\3b\3b\3b\3b\5b\u0949\nb\3b\3b\3b\5b\u094e"+
		"\nb\3b\3b\3b\3b\5b\u0954\nb\3b\3b\5b\u0958\nb\3b\3b\3b\5b\u095d\nb\3b"+
		"\3b\3b\5b\u0962\nb\3b\3b\3b\5b\u0967\nb\3c\3c\3c\3c\5c\u096d\nc\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\7c\u0982\nc\fc\16"+
		"c\u0985\13c\3d\3d\3d\3d\6d\u098b\nd\rd\16d\u098c\3d\3d\5d\u0991\nd\3d"+
		"\3d\3d\3d\3d\6d\u0998\nd\rd\16d\u0999\3d\3d\5d\u099e\nd\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\7d\u09ae\nd\fd\16d\u09b1\13d\5d\u09b3\nd"+
		"\3d\3d\3d\3d\3d\3d\5d\u09bb\nd\3d\3d\3d\3d\3d\3d\3d\5d\u09c4\nd\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\6d\u09d9\nd\rd\16"+
		"d\u09da\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u09e6\nd\3d\3d\3d\7d\u09eb\nd\f"+
		"d\16d\u09ee\13d\5d\u09f0\nd\3d\3d\3d\3d\3d\3d\3d\5d\u09f9\nd\3d\3d\5d"+
		"\u09fd\nd\3d\3d\3d\3d\3d\3d\3d\3d\6d\u0a07\nd\rd\16d\u0a08\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0a22\n"+
		"d\3d\3d\3d\3d\3d\5d\u0a29\nd\3d\5d\u0a2c\nd\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\5d\u0a3b\nd\3d\3d\5d\u0a3f\nd\3d\3d\3d\3d\3d\3d\3d\3d\7"+
		"d\u0a49\nd\fd\16d\u0a4c\13d\3e\3e\3e\3e\3e\3e\3e\3e\6e\u0a56\ne\re\16"+
		"e\u0a57\5e\u0a5a\ne\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3j\5j\u0a67\nj\3k\3"+
		"k\5k\u0a6b\nk\3l\3l\3l\6l\u0a70\nl\rl\16l\u0a71\3m\3m\3m\5m\u0a77\nm\3"+
		"n\3n\3n\3n\3n\3o\5o\u0a7f\no\3o\3o\5o\u0a83\no\3p\3p\3p\3p\3p\3p\3p\5"+
		"p\u0a8c\np\3q\3q\3q\5q\u0a91\nq\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\5r\u0aa2\nr\3r\3r\5r\u0aa6\nr\3r\3r\3r\3r\3r\7r\u0aad\nr\fr\16"+
		"r\u0ab0\13r\3r\5r\u0ab3\nr\5r\u0ab5\nr\3s\3s\3s\7s\u0aba\ns\fs\16s\u0abd"+
		"\13s\3t\3t\3t\3t\5t\u0ac3\nt\3t\5t\u0ac6\nt\3t\5t\u0ac9\nt\3u\3u\3u\7"+
		"u\u0ace\nu\fu\16u\u0ad1\13u\3v\3v\3v\3v\5v\u0ad7\nv\3v\5v\u0ada\nv\3w"+
		"\3w\3w\7w\u0adf\nw\fw\16w\u0ae2\13w\3x\3x\3x\3x\3x\5x\u0ae9\nx\3x\5x\u0aec"+
		"\nx\3y\3y\3y\3y\3y\3z\3z\3z\3z\7z\u0af7\nz\fz\16z\u0afa\13z\3{\3{\3{\3"+
		"{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\7|\u0b0b\n|\f|\16|\u0b0e\13|\3|\3|"+
		"\3|\3|\3|\7|\u0b15\n|\f|\16|\u0b18\13|\5|\u0b1a\n|\3|\3|\3|\3|\3|\7|\u0b21"+
		"\n|\f|\16|\u0b24\13|\5|\u0b26\n|\5|\u0b28\n|\3|\5|\u0b2b\n|\3|\5|\u0b2e"+
		"\n|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0b40\n}\3~\3~"+
		"\3~\3~\3~\3~\3~\5~\u0b49\n~\3\177\3\177\3\177\7\177\u0b4e\n\177\f\177"+
		"\16\177\u0b51\13\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0b57\n\u0080"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u0b5c\n\u0081\f\u0081\16\u0081\u0b5f"+
		"\13\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\6\u0083\u0b66\n\u0083"+
		"\r\u0083\16\u0083\u0b67\3\u0083\5\u0083\u0b6b\n\u0083\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u0b70\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u0b78\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\5\u0087"+
		"\u0b7e\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0b83\n\u0087\3\u0087\3"+
		"\u0087\3\u0087\5\u0087\u0b88\n\u0087\3\u0087\3\u0087\5\u0087\u0b8c\n\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0b90\n\u0087\3\u0087\3\u0087\5\u0087\u0b94\n"+
		"\u0087\3\u0087\3\u0087\5\u0087\u0b98\n\u0087\3\u0087\3\u0087\5\u0087\u0b9c"+
		"\n\u0087\3\u0087\3\u0087\5\u0087\u0ba0\n\u0087\3\u0087\5\u0087\u0ba3\n"+
		"\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088"+
		"\u0bac\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\7\u03a5\u03e3\u03ed\u03f4\u03fc\6T\u00c0\u00c4\u00c6\u008c\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\2+\4\2CC\u00b6\u00b6\4\2\"\"\u00c4"+
		"\u00c4\4\2AA\u0098\u0098\4\2ffss\3\2-.\4\2\u00e5\u00e5\u0103\u0103\4\2"+
		"\21\21%%\7\2**\66\66XXee\u008f\u008f\3\2GH\4\2XXee\4\2\u009c\u009c\u011d"+
		"\u011d\4\2\16\16\u0089\u0089\5\2@@\u0097\u0097\u00ce\u00ce\6\2SSzz\u00d7"+
		"\u00d7\u00f9\u00f9\5\2SS\u00d7\u00d7\u00f9\u00f9\4\2\31\31GG\4\2``\u0081"+
		"\u0081\4\2\20\20LL\4\2\u0121\u0121\u0123\u0123\5\2[[\u00f3\u00f3\u00fb"+
		"\u00fb\4\2\u0112\u0113\u0118\u0118\3\2\u0114\u0117\4\2\u0112\u0113\u011b"+
		"\u011b\4\2;;==\3\2\u00e3\u00e4\4\2\6\6ff\4\2\6\6bb\5\2\35\35\u0084\u0084"+
		"\u00ee\u00ee\3\2\u010a\u0111\3\2\u0112\u011c\6\2\23\23ss\u009b\u009b\u00a3"+
		"\u00a3\4\2[[\u00f3\u00f3\3\2\u0112\u0113\4\2MM\u00ac\u00ac\4\2\u00a4\u00a4"+
		"\u00dc\u00dc\4\2aa\u00b3\u00b3\3\2\u0122\u0123\4\2NN\u00d6\u00d6\65\2"+
		"\16\17\21\22\26\27\31\32\34\34\36\"%%\'*,,.\64\66\669:?ACKMNRRTZ]]_ad"+
		"ehjmmprtuwy{{~~\u0080\u0083\u0086\u0093\u0096\u0098\u009a\u009a\u009d"+
		"\u009e\u00a1\u00a2\u00a5\u00a5\u00a7\u00a8\u00aa\u00b3\u00b5\u00bd\u00bf"+
		"\u00c5\u00c7\u00ce\u00d2\u00d4\u00d6\u00d6\u00d8\u00da\u00dc\u00e4\u00e6"+
		"\u00ea\u00ed\u00ed\u00ef\u00f4\u00f6\u00f8\u00fc\u00ff\u0102\u0104\u0107"+
		"\u0107\u0117\u0117\21\2\24\2488SSggvvzz\177\177\u0085\u0085\u0099\u0099"+
		"\u009f\u009f\u00c6\u00c6\u00d1\u00d1\u00d7\u00d7\u00f9\u00f9\u0101\u0101"+
		"\23\2\16\23\25\679RTfhuwy{~\u0080\u0084\u0086\u0098\u009a\u009e\u00a0"+
		"\u00c5\u00c7\u00d0\u00d2\u00d6\u00d8\u00f8\u00fa\u0100\u0102\u0109\u0117"+
		"\u0117\2\u0d86\2\u0117\3\2\2\2\4\u011d\3\2\2\2\6\u0120\3\2\2\2\b\u0127"+
		"\3\2\2\2\n\u012e\3\2\2\2\f\u0135\3\2\2\2\16\u013c\3\2\2\2\20\u0143\3\2"+
		"\2\2\22\u03ff\3\2\2\2\24\u04a9\3\2\2\2\26\u04ab\3\2\2\2\30\u04bc\3\2\2"+
		"\2\32\u04c2\3\2\2\2\34\u04ce\3\2\2\2\36\u04db\3\2\2\2 \u04de\3\2\2\2\""+
		"\u04e2\3\2\2\2$\u051e\3\2\2\2&\u0520\3\2\2\2(\u0524\3\2\2\2*\u0530\3\2"+
		"\2\2,\u0535\3\2\2\2.\u053c\3\2\2\2\60\u053e\3\2\2\2\62\u0546\3\2\2\2\64"+
		"\u054f\3\2\2\2\66\u055a\3\2\2\28\u0569\3\2\2\2:\u056c\3\2\2\2<\u0577\3"+
		"\2\2\2>\u0587\3\2\2\2@\u058d\3\2\2\2B\u058f\3\2\2\2D\u059a\3\2\2\2F\u05ab"+
		"\3\2\2\2H\u05b2\3\2\2\2J\u05b4\3\2\2\2L\u05ba\3\2\2\2N\u05f0\3\2\2\2P"+
		"\u05fc\3\2\2\2R\u062c\3\2\2\2T\u062f\3\2\2\2V\u0655\3\2\2\2X\u0657\3\2"+
		"\2\2Z\u065f\3\2\2\2\\\u0680\3\2\2\2^\u069f\3\2\2\2`\u06ab\3\2\2\2b\u06cb"+
		"\3\2\2\2d\u06d7\3\2\2\2f\u06da\3\2\2\2h\u06e3\3\2\2\2j\u06f4\3\2\2\2l"+
		"\u0708\3\2\2\2n\u070a\3\2\2\2p\u0712\3\2\2\2r\u0716\3\2\2\2t\u0719\3\2"+
		"\2\2v\u071c\3\2\2\2x\u0736\3\2\2\2z\u0738\3\2\2\2|\u0776\3\2\2\2~\u0785"+
		"\3\2\2\2\u0080\u0787\3\2\2\2\u0082\u07a5\3\2\2\2\u0084\u07a7\3\2\2\2\u0086"+
		"\u07ae\3\2\2\2\u0088\u07ce\3\2\2\2\u008a\u07d0\3\2\2\2\u008c\u07e2\3\2"+
		"\2\2\u008e\u07fc\3\2\2\2\u0090\u0802\3\2\2\2\u0092\u0804\3\2\2\2\u0094"+
		"\u0823\3\2\2\2\u0096\u0825\3\2\2\2\u0098\u0829\3\2\2\2\u009a\u0831\3\2"+
		"\2\2\u009c\u083c\3\2\2\2\u009e\u0840\3\2\2\2\u00a0\u084b\3\2\2\2\u00a2"+
		"\u0867\3\2\2\2\u00a4\u0869\3\2\2\2\u00a6\u0874\3\2\2\2\u00a8\u088a\3\2"+
		"\2\2\u00aa\u08bd\3\2\2\2\u00ac\u08bf\3\2\2\2\u00ae\u08c7\3\2\2\2\u00b0"+
		"\u08d2\3\2\2\2\u00b2\u08d9\3\2\2\2\u00b4\u08dd\3\2\2\2\u00b6\u08e7\3\2"+
		"\2\2\u00b8\u08ef\3\2\2\2\u00ba\u0907\3\2\2\2\u00bc\u090b\3\2\2\2\u00be"+
		"\u090d\3\2\2\2\u00c0\u091b\3\2\2\2\u00c2\u0966\3\2\2\2\u00c4\u096c\3\2"+
		"\2\2\u00c6\u0a3e\3\2\2\2\u00c8\u0a59\3\2\2\2\u00ca\u0a5b\3\2\2\2\u00cc"+
		"\u0a5d\3\2\2\2\u00ce\u0a5f\3\2\2\2\u00d0\u0a61\3\2\2\2\u00d2\u0a63\3\2"+
		"\2\2\u00d4\u0a68\3\2\2\2\u00d6\u0a6f\3\2\2\2\u00d8\u0a73\3\2\2\2\u00da"+
		"\u0a78\3\2\2\2\u00dc\u0a82\3\2\2\2\u00de\u0a8b\3\2\2\2\u00e0\u0a90\3\2"+
		"\2\2\u00e2\u0ab4\3\2\2\2\u00e4\u0ab6\3\2\2\2\u00e6\u0abe\3\2\2\2\u00e8"+
		"\u0aca\3\2\2\2\u00ea\u0ad2\3\2\2\2\u00ec\u0adb\3\2\2\2\u00ee\u0ae3\3\2"+
		"\2\2\u00f0\u0aed\3\2\2\2\u00f2\u0af2\3\2\2\2\u00f4\u0afb\3\2\2\2\u00f6"+
		"\u0b2d\3\2\2\2\u00f8\u0b3f\3\2\2\2\u00fa\u0b48\3\2\2\2\u00fc\u0b4a\3\2"+
		"\2\2\u00fe\u0b56\3\2\2\2\u0100\u0b58\3\2\2\2\u0102\u0b60\3\2\2\2\u0104"+
		"\u0b6a\3\2\2\2\u0106\u0b6f\3\2\2\2\u0108\u0b77\3\2\2\2\u010a\u0b79\3\2"+
		"\2\2\u010c\u0ba2\3\2\2\2\u010e\u0bab\3\2\2\2\u0110\u0bad\3\2\2\2\u0112"+
		"\u0baf\3\2\2\2\u0114\u0bb1\3\2\2\2\u0116\u0118\5\4\3\2\u0117\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\7\2\2\3\u011c\3\3\2\2\2\u011d\u011e\5\22\n"+
		"\2\u011e\u011f\7\3\2\2\u011f\5\3\2\2\2\u0120\u0124\5\u00b4[\2\u0121\u0123"+
		"\7\2\2\3\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\7\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012b\5\u00b0"+
		"Y\2\u0128\u012a\7\2\2\3\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\t\3\2\2\2\u012d\u012b\3\2\2\2"+
		"\u012e\u0132\5\u00aeX\2\u012f\u0131\7\2\2\3\u0130\u012f\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\13\3\2\2"+
		"\2\u0134\u0132\3\2\2\2\u0135\u0139\5\u00b2Z\2\u0136\u0138\7\2\2\3\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\r\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0140\5\u00e2r\2\u013d"+
		"\u013f\7\2\2\3\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\17\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0147"+
		"\5\u00e8u\2\u0144\u0146\7\2\2\3\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2"+
		"\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\21\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u0400\5\"\22\2\u014b\u014d\5\62\32\2\u014c\u014b\3\2\2"+
		"\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0400\5N(\2\u014f\u0151"+
		"\7\u00ff\2\2\u0150\u0152\7\u0097\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\u0400\5\u00aeX\2\u0154\u0155\7\67\2\2"+
		"\u0155\u0159\5,\27\2\u0156\u0157\7p\2\2\u0157\u0158\7\u009b\2\2\u0158"+
		"\u015a\7U\2\2\u0159\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u0163\5\u00aeX\2\u015c\u0162\5 \21\2\u015d\u0162\5\36\20\2"+
		"\u015e\u015f\7\u0108\2\2\u015f\u0160\t\2\2\2\u0160\u0162\5:\36\2\u0161"+
		"\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0400\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7\21\2\2\u0167\u0168\5,\27\2\u0168\u0169\5"+
		"\u00aeX\2\u0169\u016a\7\u00d6\2\2\u016a\u016b\t\2\2\2\u016b\u016c\5:\36"+
		"\2\u016c\u0400\3\2\2\2\u016d\u016e\7\21\2\2\u016e\u016f\5,\27\2\u016f"+
		"\u0170\5\u00aeX\2\u0170\u0171\7\u00d6\2\2\u0171\u0172\5\36\20\2\u0172"+
		"\u0400\3\2\2\2\u0173\u0174\7N\2\2\u0174\u0177\5,\27\2\u0175\u0176\7p\2"+
		"\2\u0176\u0178\7U\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017b\5\u00aeX\2\u017a\u017c\t\3\2\2\u017b\u017a\3\2\2"+
		"\2\u017b\u017c\3\2\2\2\u017c\u0400\3\2\2\2\u017d\u017e\7\u00d9\2\2\u017e"+
		"\u0181\t\4\2\2\u017f\u0180\t\5\2\2\u0180\u0182\5\u00aeX\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0187\3\2\2\2\u0183\u0185\7\u0086\2"+
		"\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188"+
		"\7\u011d\2\2\u0187\u0184\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0400\3\2\2"+
		"\2\u0189\u018e\5\26\f\2\u018a\u018b\7\4\2\2\u018b\u018c\5\u00e8u\2\u018c"+
		"\u018d\7\5\2\2\u018d\u018f\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0191\5\66\34\2\u0191\u0196\58\35\2\u0192"+
		"\u0194\7\30\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3"+
		"\2\2\2\u0195\u0197\5\"\22\2\u0196\u0193\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0400\3\2\2\2\u0198\u019d\5\26\f\2\u0199\u019a\7\4\2\2\u019a\u019b\5"+
		"\u00e8u\2\u019b\u019c\7\5\2\2\u019c\u019e\3\2\2\2\u019d\u0199\3\2\2\2"+
		"\u019d\u019e\3\2\2\2\u019e\u01b4\3\2\2\2\u019f\u01b3\5 \21\2\u01a0\u01a1"+
		"\7\u00ad\2\2\u01a1\u01a2\7 \2\2\u01a2\u01a3\7\4\2\2\u01a3\u01a4\5\u00e8"+
		"u\2\u01a4\u01a5\7\5\2\2\u01a5\u01aa\3\2\2\2\u01a6\u01a7\7\u00ad\2\2\u01a7"+
		"\u01a8\7 \2\2\u01a8\u01aa\5\u0096L\2\u01a9\u01a0\3\2\2\2\u01a9\u01a6\3"+
		"\2\2\2\u01aa\u01b3\3\2\2\2\u01ab\u01b3\5\32\16\2\u01ac\u01b3\5\34\17\2"+
		"\u01ad\u01b3\5\u00aaV\2\u01ae\u01b3\5F$\2\u01af\u01b3\5\36\20\2\u01b0"+
		"\u01b1\7\u00e8\2\2\u01b1\u01b3\5:\36\2\u01b2\u019f\3\2\2\2\u01b2\u01a9"+
		"\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b2"+
		"\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01bb\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b7\u01b9\7\30\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3"+
		"\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\5\"\22\2\u01bb\u01b8\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u0400\3\2\2\2\u01bd\u01be\7\67\2\2\u01be\u01c2\7"+
		"\u00e5\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7\u009b\2\2\u01c1\u01c3\7U\2"+
		"\2\u01c2\u01bf\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5"+
		"\5\u00b0Y\2\u01c5\u01c6\7\u0086\2\2\u01c6\u01cf\5\u00b0Y\2\u01c7\u01ce"+
		"\5\66\34\2\u01c8\u01ce\5\u00aaV\2\u01c9\u01ce\5F$\2\u01ca\u01ce\5\36\20"+
		"\2\u01cb\u01cc\7\u00e8\2\2\u01cc\u01ce\5:\36\2\u01cd\u01c7\3\2\2\2\u01cd"+
		"\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u0400\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d7\5\30\r\2\u01d3\u01d4\7"+
		"\4\2\2\u01d4\u01d5\5\u00e8u\2\u01d5\u01d6\7\5\2\2\u01d6\u01d8\3\2\2\2"+
		"\u01d7\u01d3\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da"+
		"\5\66\34\2\u01da\u01df\58\35\2\u01db\u01dd\7\30\2\2\u01dc\u01db\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\5\"\22\2\u01df"+
		"\u01dc\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u0400\3\2\2\2\u01e1\u01e2\7\22"+
		"\2\2\u01e2\u01e3\7\u00e5\2\2\u01e3\u01e5\5\u00aeX\2\u01e4\u01e6\5(\25"+
		"\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8"+
		"\7\63\2\2\u01e8\u01f0\7\u00df\2\2\u01e9\u01f1\5\u0106\u0084\2\u01ea\u01eb"+
		"\7b\2\2\u01eb\u01ec\7.\2\2\u01ec\u01f1\5\u0098M\2\u01ed\u01ee\7b\2\2\u01ee"+
		"\u01ef\7\20\2\2\u01ef\u01f1\7.\2\2\u01f0\u01e9\3\2\2\2\u01f0\u01ea\3\2"+
		"\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u0400\3\2\2\2\u01f2"+
		"\u01f3\7\21\2\2\u01f3\u01f4\7\u00e5\2\2\u01f4\u01f5\5\u00aeX\2\u01f5\u01f6"+
		"\7\16\2\2\u01f6\u01f7\t\6\2\2\u01f7\u01f8\5\u00e4s\2\u01f8\u0400\3\2\2"+
		"\2\u01f9\u01fa\7\21\2\2\u01fa\u01fb\7\u00e5\2\2\u01fb\u01fc\5\u00aeX\2"+
		"\u01fc\u01fd\7\16\2\2\u01fd\u01fe\t\6\2\2\u01fe\u01ff\7\4\2\2\u01ff\u0200"+
		"\5\u00e4s\2\u0200\u0201\7\5\2\2\u0201\u0400\3\2\2\2\u0202\u0203\7\21\2"+
		"\2\u0203\u0204\7\u00e5\2\2\u0204\u0205\5\u00aeX\2\u0205\u0206\7\u00c0"+
		"\2\2\u0206\u0207\7-\2\2\u0207\u0208\5\u00aeX\2\u0208\u0209\7\u00ec\2\2"+
		"\u0209\u020a\5\u0102\u0082\2\u020a\u0400\3\2\2\2\u020b\u020c\7\21\2\2"+
		"\u020c\u020d\7\u00e5\2\2\u020d\u020e\5\u00aeX\2\u020e\u020f\7N\2\2\u020f"+
		"\u0210\t\6\2\2\u0210\u0211\7\4\2\2\u0211\u0212\5\u00acW\2\u0212\u0213"+
		"\7\5\2\2\u0213\u0400\3\2\2\2\u0214\u0215\7\21\2\2\u0215\u0216\7\u00e5"+
		"\2\2\u0216\u0217\5\u00aeX\2\u0217\u0218\7N\2\2\u0218\u0219\t\6\2\2\u0219"+
		"\u021a\5\u00acW\2\u021a\u0400\3\2\2\2\u021b\u021c\7\21\2\2\u021c\u021d"+
		"\t\7\2\2\u021d\u021e\5\u00aeX\2\u021e\u021f\7\u00c0\2\2\u021f\u0220\7"+
		"\u00ec\2\2\u0220\u0221\5\u00aeX\2\u0221\u0400\3\2\2\2\u0222\u0223\7\21"+
		"\2\2\u0223\u0224\t\7\2\2\u0224\u0225\5\u00aeX\2\u0225\u0226\7\u00d6\2"+
		"\2\u0226\u0227\7\u00e8\2\2\u0227\u0228\5:\36\2\u0228\u0400\3\2\2\2\u0229"+
		"\u022a\7\21\2\2\u022a\u022b\t\7\2\2\u022b\u022c\5\u00aeX\2\u022c\u022d"+
		"\7\u00fd\2\2\u022d\u0230\7\u00e8\2\2\u022e\u022f\7p\2\2\u022f\u0231\7"+
		"U\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\5:\36\2\u0233\u0400\3\2\2\2\u0234\u0235\7\21\2\2\u0235\u0236\7"+
		"\u00e5\2\2\u0236\u0237\5\u00aeX\2\u0237\u0239\t\b\2\2\u0238\u023a\7-\2"+
		"\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d"+
		"\5\u00aeX\2\u023c\u023e\5\u010e\u0088\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0400\3\2\2\2\u023f\u0240\7\21\2\2\u0240\u0241\7\u00e5"+
		"\2\2\u0241\u0243\5\u00aeX\2\u0242\u0244\5(\25\2\u0243\u0242\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\7%\2\2\u0246\u0248\7-\2"+
		"\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\5\u00aeX\2\u024a\u024c\5\u00eav\2\u024b\u024d\5\u00e0q\2\u024c\u024b"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0400\3\2\2\2\u024e\u024f\7\21\2\2"+
		"\u024f\u0250\7\u00e5\2\2\u0250\u0252\5\u00aeX\2\u0251\u0253\5(\25\2\u0252"+
		"\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\7\u00d6"+
		"\2\2\u0255\u0256\7\u00d3\2\2\u0256\u025a\7\u011d\2\2\u0257\u0258\7\u0108"+
		"\2\2\u0258\u0259\7\u00d4\2\2\u0259\u025b\5:\36\2\u025a\u0257\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u0400\3\2\2\2\u025c\u025d\7\21\2\2\u025d\u025e\7"+
		"\u00e5\2\2\u025e\u0260\5\u00aeX\2\u025f\u0261\5(\25\2\u0260\u025f\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\7\u00d6\2\2\u0263"+
		"\u0264\7\u00d4\2\2\u0264\u0265\5:\36\2\u0265\u0400\3\2\2\2\u0266\u0267"+
		"\7\21\2\2\u0267\u0268\t\7\2\2\u0268\u0269\5\u00aeX\2\u0269\u026d\7\16"+
		"\2\2\u026a\u026b\7p\2\2\u026b\u026c\7\u009b\2\2\u026c\u026e\7U\2\2\u026d"+
		"\u026a\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0271\5&"+
		"\24\2\u0270\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0400\3\2\2\2\u0274\u0275\7\21\2\2\u0275\u0276\7"+
		"\u00e5\2\2\u0276\u0277\5\u00aeX\2\u0277\u0278\5(\25\2\u0278\u0279\7\u00c0"+
		"\2\2\u0279\u027a\7\u00ec\2\2\u027a\u027b\5(\25\2\u027b\u0400\3\2\2\2\u027c"+
		"\u027d\7\21\2\2\u027d\u027e\t\7\2\2\u027e\u027f\5\u00aeX\2\u027f\u0282"+
		"\7N\2\2\u0280\u0281\7p\2\2\u0281\u0283\7U\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0289\5(\25\2\u0285\u0286\7\6"+
		"\2\2\u0286\u0288\5(\25\2\u0287\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2"+
		"\2\2\u028c\u028e\7\u00b7\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0400\3\2\2\2\u028f\u0290\7\21\2\2\u0290\u0291\7\u00e5\2\2\u0291\u0293"+
		"\5\u00aeX\2\u0292\u0294\5(\25\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295\u0296\7\u00d6\2\2\u0296\u0297\5\36\20\2\u0297"+
		"\u0400\3\2\2\2\u0298\u0299\7\21\2\2\u0299\u029a\7\u00e5\2\2\u029a\u029b"+
		"\5\u00aeX\2\u029b\u029c\7\u00bc\2\2\u029c\u029d\7\u00ae\2\2\u029d\u0400"+
		"\3\2\2\2\u029e\u029f\7N\2\2\u029f\u02a2\7\u00e5\2\2\u02a0\u02a1\7p\2\2"+
		"\u02a1\u02a3\7U\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a6\5\u00aeX\2\u02a5\u02a7\7\u00b7\2\2\u02a6\u02a5\3"+
		"\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u0400\3\2\2\2\u02a8\u02a9\7N\2\2\u02a9"+
		"\u02ac\7\u0103\2\2\u02aa\u02ab\7p\2\2\u02ab\u02ad\7U\2\2\u02ac\u02aa\3"+
		"\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u0400\5\u00aeX\2"+
		"\u02af\u02b2\7\67\2\2\u02b0\u02b1\7\u00a3\2\2\u02b1\u02b3\7\u00c2\2\2"+
		"\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b8\3\2\2\2\u02b4\u02b6"+
		"\7j\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b9\7\u00e9\2\2\u02b8\u02b5\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02be\7\u0103\2\2\u02bb\u02bc\7p\2\2\u02bc\u02bd\7\u009b"+
		"\2\2\u02bd\u02bf\7U\2\2\u02be\u02bb\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c2\5\u00aeX\2\u02c1\u02c3\5\u009eP\2\u02c2\u02c1"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02cc\3\2\2\2\u02c4\u02cb\5 \21\2\u02c5"+
		"\u02c6\7\u00ad\2\2\u02c6\u02c7\7\u009f\2\2\u02c7\u02cb\5\u0096L\2\u02c8"+
		"\u02c9\7\u00e8\2\2\u02c9\u02cb\5:\36\2\u02ca\u02c4\3\2\2\2\u02ca\u02c5"+
		"\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\30"+
		"\2\2\u02d0\u02d1\5\"\22\2\u02d1\u0400\3\2\2\2\u02d2\u02d5\7\67\2\2\u02d3"+
		"\u02d4\7\u00a3\2\2\u02d4\u02d6\7\u00c2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d9\7j\2\2\u02d8\u02d7\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7\u00e9\2\2\u02db\u02dc"+
		"\7\u0103\2\2\u02dc\u02e1\5\u00b0Y\2\u02dd\u02de\7\4\2\2\u02de\u02df\5"+
		"\u00e8u\2\u02df\u02e0\7\5\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02dd\3\2\2\2"+
		"\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\5\66\34\2\u02e4\u02e5"+
		"\7\u00a2\2\2\u02e5\u02e7\5:\36\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2"+
		"\2\u02e7\u0400\3\2\2\2\u02e8\u02e9\7\21\2\2\u02e9\u02ea\7\u0103\2\2\u02ea"+
		"\u02ec\5\u00aeX\2\u02eb\u02ed\7\30\2\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\5\"\22\2\u02ef\u0400\3\2\2\2"+
		"\u02f0\u02f3\7\67\2\2\u02f1\u02f2\7\u00a3\2\2\u02f2\u02f4\7\u00c2\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f7"+
		"\7\u00e9\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2"+
		"\2\u02f8\u02fc\7h\2\2\u02f9\u02fa\7p\2\2\u02fa\u02fb\7\u009b\2\2\u02fb"+
		"\u02fd\7U\2\2\u02fc\u02f9\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2"+
		"\2\2\u02fe\u02ff\5\u00aeX\2\u02ff\u0300\7\30\2\2\u0300\u030a\7\u011d\2"+
		"\2\u0301\u0302\7\u0101\2\2\u0302\u0307\5L\'\2\u0303\u0304\7\6\2\2\u0304"+
		"\u0306\5L\'\2\u0305\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u0301\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0400\3\2\2\2\u030c\u030e\7N"+
		"\2\2\u030d\u030f\7\u00e9\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0313\7h\2\2\u0311\u0312\7p\2\2\u0312\u0314\7U\2"+
		"\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0400"+
		"\5\u00aeX\2\u0316\u0318\7V\2\2\u0317\u0319\t\t\2\2\u0318\u0317\3\2\2\2"+
		"\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0400\5\22\n\2\u031b\u031c"+
		"\7\u00d9\2\2\u031c\u031f\7\u00e6\2\2\u031d\u031e\t\5\2\2\u031e\u0320\5"+
		"\u00aeX\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0325\3\2\2\2"+
		"\u0321\u0323\7\u0086\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0326\7\u011d\2\2\u0325\u0322\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0400\3\2\2\2\u0327\u0328\7\u00d9\2\2\u0328\u0329\7\u00e5"+
		"\2\2\u0329\u032c\7X\2\2\u032a\u032b\t\5\2\2\u032b\u032d\5\u00aeX\2\u032c"+
		"\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\7\u0086"+
		"\2\2\u032f\u0331\7\u011d\2\2\u0330\u0332\5(\25\2\u0331\u0330\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0400\3\2\2\2\u0333\u0334\7\u00d9\2\2\u0334\u0335"+
		"\7\u00e8\2\2\u0335\u033a\5\u00aeX\2\u0336\u0337\7\4\2\2\u0337\u0338\5"+
		"> \2\u0338\u0339\7\5\2\2\u0339\u033b\3\2\2\2\u033a\u0336\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u0400\3\2\2\2\u033c\u033d\7\u00d9\2\2\u033d\u033e"+
		"\7.\2\2\u033e\u033f\t\5\2\2\u033f\u0342\5\u00aeX\2\u0340\u0341\t\5\2\2"+
		"\u0341\u0343\5\u00aeX\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0400\3\2\2\2\u0344\u0345\7\u00d9\2\2\u0345\u0348\7\u0104\2\2\u0346\u0347"+
		"\t\5\2\2\u0347\u0349\5\u00aeX\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2"+
		"\2\u0349\u034e\3\2\2\2\u034a\u034c\7\u0086\2\2\u034b\u034a\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\7\u011d\2\2\u034e\u034b"+
		"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0400\3\2\2\2\u0350\u0351\7\u00d9\2"+
		"\2\u0351\u0352\7\u00ae\2\2\u0352\u0354\5\u00aeX\2\u0353\u0355\5(\25\2"+
		"\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0400\3\2\2\2\u0356\u0358"+
		"\7\u00d9\2\2\u0357\u0359\5\u0106\u0084\2\u0358\u0357\3\2\2\2\u0358\u0359"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u0362\7i\2\2\u035b\u035d\7\u0086\2"+
		"\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u0361"+
		"\5\u00aeX\2\u035f\u0361\7\u011d\2\2\u0360\u035e\3\2\2\2\u0360\u035f\3"+
		"\2\2\2\u0361\u0363\3\2\2\2\u0362\u035c\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0400\3\2\2\2\u0364\u0365\7\u00d9\2\2\u0365\u0366\7\67\2\2\u0366\u0367"+
		"\7\u00e5\2\2\u0367\u036a\5\u00aeX\2\u0368\u0369\7\30\2\2\u0369\u036b\7"+
		"\u00d3\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u0400\3\2\2\2"+
		"\u036c\u036d\7\u00d9\2\2\u036d\u036e\7:\2\2\u036e\u0400\7\u0097\2\2\u036f"+
		"\u0370\t\n\2\2\u0370\u0372\7h\2\2\u0371\u0373\7X\2\2\u0372\u0371\3\2\2"+
		"\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0400\5.\30\2\u0375\u0376"+
		"\t\n\2\2\u0376\u0378\5,\27\2\u0377\u0379\7X\2\2\u0378\u0377\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\5\u00aeX\2\u037b\u0400"+
		"\3\2\2\2\u037c\u037e\t\n\2\2\u037d\u037f\7\u00e5\2\2\u037e\u037d\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u0382\t\13\2\2\u0381"+
		"\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\5\u00ae"+
		"X\2\u0384\u0386\5(\25\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0388\3\2\2\2\u0387\u0389\5\60\31\2\u0388\u0387\3\2\2\2\u0388\u0389\3"+
		"\2\2\2\u0389\u0400\3\2\2\2\u038a\u038c\t\n\2\2\u038b\u038d\7\u00b8\2\2"+
		"\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0400"+
		"\5\"\22\2\u038f\u0390\7/\2\2\u0390\u0391\7\u009f\2\2\u0391\u0392\5,\27"+
		"\2\u0392\u0393\5\u00aeX\2\u0393\u0394\7}\2\2\u0394\u0395\t\f\2\2\u0395"+
		"\u0400\3\2\2\2\u0396\u0397\7/\2\2\u0397\u0398\7\u009f\2\2\u0398\u0399"+
		"\7\u00e5\2\2\u0399\u039a\5\u00aeX\2\u039a\u039b\7}\2\2\u039b\u039c\t\f"+
		"\2\2\u039c\u0400\3\2\2\2\u039d\u039e\7\u00bf\2\2\u039e\u039f\7\u00e5\2"+
		"\2\u039f\u0400\5\u00aeX\2\u03a0\u03a8\7\u00bf\2\2\u03a1\u03a9\7\u011d"+
		"\2\2\u03a2\u03a4\13\2\2\2\u03a3\u03a2\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2"+
		"\2\2\u03a8\u03a1\3\2\2\2\u03a8\u03a5\3\2\2\2\u03a9\u0400\3\2\2\2\u03aa"+
		"\u03ac\7!\2\2\u03ab\u03ad\7\u0083\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\7\u00e5\2\2\u03af\u03b2\5\u00ae"+
		"X\2\u03b0\u03b1\7\u00a2\2\2\u03b1\u03b3\5:\36\2\u03b2\u03b0\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b8\3\2\2\2\u03b4\u03b6\7\30\2\2\u03b5\u03b4\3"+
		"\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\5\"\22\2\u03b8"+
		"\u03b5\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u0400\3\2\2\2\u03ba\u03bb\7\u00f8"+
		"\2\2\u03bb\u03be\7\u00e5\2\2\u03bc\u03bd\7p\2\2\u03bd\u03bf\7U\2\2\u03be"+
		"\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u0400\5\u00ae"+
		"X\2\u03c1\u03c2\7\'\2\2\u03c2\u0400\7!\2\2\u03c3\u03c4\7\u008a\2\2\u03c4"+
		"\u03c6\7?\2\2\u03c5\u03c7\7\u008b\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7"+
		"\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\7w\2\2\u03c9\u03cb\7\u011d\2"+
		"\2\u03ca\u03cc\7\u00ab\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03ce\7|\2\2\u03ce\u03cf\7\u00e5\2\2\u03cf\u03d1"+
		"\5\u00aeX\2\u03d0\u03d2\5(\25\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2"+
		"\2\u03d2\u0400\3\2\2\2\u03d3\u03d4\7\u00f4\2\2\u03d4\u03d5\7\u00e5\2\2"+
		"\u03d5\u03d7\5\u00aeX\2\u03d6\u03d8\5(\25\2\u03d7\u03d6\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u0400\3\2\2\2\u03d9\u03da\7\u0096\2\2\u03da\u03db"+
		"\7\u00c1\2\2\u03db\u03dc\7\u00e5\2\2\u03dc\u0400\5\u00aeX\2\u03dd\u03de"+
		"\t\r\2\2\u03de\u03e6\5\u0106\u0084\2\u03df\u03e7\7\u011d\2\2\u03e0\u03e2"+
		"\13\2\2\2\u03e1\u03e0\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e4\3\2\2\2"+
		"\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03df"+
		"\3\2\2\2\u03e6\u03e3\3\2\2\2\u03e7\u0400\3\2\2\2\u03e8\u03e9\7\u00d6\2"+
		"\2\u03e9\u03ed\7\u00c8\2\2\u03ea\u03ec\13\2\2\2\u03eb\u03ea\3\2\2\2\u03ec"+
		"\u03ef\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u0400\3\2"+
		"\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f4\7\u00d6\2\2\u03f1\u03f3\13\2\2\2"+
		"\u03f2\u03f1\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f4\u03f2"+
		"\3\2\2\2\u03f5\u0400\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u0400\7\u00c3\2"+
		"\2\u03f8\u03fc\5\24\13\2\u03f9\u03fb\13\2\2\2\u03fa\u03f9\3\2\2\2\u03fb"+
		"\u03fe\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u0400\3\2"+
		"\2\2\u03fe\u03fc\3\2\2\2\u03ff\u014a\3\2\2\2\u03ff\u014c\3\2\2\2\u03ff"+
		"\u014f\3\2\2\2\u03ff\u0154\3\2\2\2\u03ff\u0166\3\2\2\2\u03ff\u016d\3\2"+
		"\2\2\u03ff\u0173\3\2\2\2\u03ff\u017d\3\2\2\2\u03ff\u0189\3\2\2\2\u03ff"+
		"\u0198\3\2\2\2\u03ff\u01bd\3\2\2\2\u03ff\u01d2\3\2\2\2\u03ff\u01e1\3\2"+
		"\2\2\u03ff\u01f2\3\2\2\2\u03ff\u01f9\3\2\2\2\u03ff\u0202\3\2\2\2\u03ff"+
		"\u020b\3\2\2\2\u03ff\u0214\3\2\2\2\u03ff\u021b\3\2\2\2\u03ff\u0222\3\2"+
		"\2\2\u03ff\u0229\3\2\2\2\u03ff\u0234\3\2\2\2\u03ff\u023f\3\2\2\2\u03ff"+
		"\u024e\3\2\2\2\u03ff\u025c\3\2\2\2\u03ff\u0266\3\2\2\2\u03ff\u0274\3\2"+
		"\2\2\u03ff\u027c\3\2\2\2\u03ff\u028f\3\2\2\2\u03ff\u0298\3\2\2\2\u03ff"+
		"\u029e\3\2\2\2\u03ff\u02a8\3\2\2\2\u03ff\u02af\3\2\2\2\u03ff\u02d2\3\2"+
		"\2\2\u03ff\u02e8\3\2\2\2\u03ff\u02f0\3\2\2\2\u03ff\u030c\3\2\2\2\u03ff"+
		"\u0316\3\2\2\2\u03ff\u031b\3\2\2\2\u03ff\u0327\3\2\2\2\u03ff\u0333\3\2"+
		"\2\2\u03ff\u033c\3\2\2\2\u03ff\u0344\3\2\2\2\u03ff\u0350\3\2\2\2\u03ff"+
		"\u0356\3\2\2\2\u03ff\u0364\3\2\2\2\u03ff\u036c\3\2\2\2\u03ff\u036f\3\2"+
		"\2\2\u03ff\u0375\3\2\2\2\u03ff\u037c\3\2\2\2\u03ff\u038a\3\2\2\2\u03ff"+
		"\u038f\3\2\2\2\u03ff\u0396\3\2\2\2\u03ff\u039d\3\2\2\2\u03ff\u03a0\3\2"+
		"\2\2\u03ff\u03aa\3\2\2\2\u03ff\u03ba\3\2\2\2\u03ff\u03c1\3\2\2\2\u03ff"+
		"\u03c3\3\2\2\2\u03ff\u03d3\3\2\2\2\u03ff\u03d9\3\2\2\2\u03ff\u03dd\3\2"+
		"\2\2\u03ff\u03e8\3\2\2\2\u03ff\u03f0\3\2\2\2\u03ff\u03f7\3\2\2\2\u03ff"+
		"\u03f8\3\2\2\2\u0400\23\3\2\2\2\u0401\u0402\7\67\2\2\u0402\u04aa\7\u00c8"+
		"\2\2\u0403\u0404\7N\2\2\u0404\u04aa\7\u00c8\2\2\u0405\u0407\7k\2\2\u0406"+
		"\u0408\7\u00c8\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u04aa"+
		"\3\2\2\2\u0409\u040b\7\u00c5\2\2\u040a\u040c\7\u00c8\2\2\u040b\u040a\3"+
		"\2\2\2\u040b\u040c\3\2\2\2\u040c\u04aa\3\2\2\2\u040d\u040e\7\u00d9\2\2"+
		"\u040e\u04aa\7k\2\2\u040f\u0410\7\u00d9\2\2\u0410\u0412\7\u00c8\2\2\u0411"+
		"\u0413\7k\2\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u04aa\3\2"+
		"\2\2\u0414\u0415\7\u00d9\2\2\u0415\u04aa\7\u00b5\2\2\u0416\u0417\7\u00d9"+
		"\2\2\u0417\u04aa\7\u00c9\2\2\u0418\u0419\7\u00d9\2\2\u0419\u041a\7:\2"+
		"\2\u041a\u04aa\7\u00c9\2\2\u041b\u041c\7W\2\2\u041c\u04aa\7\u00e5\2\2"+
		"\u041d\u041e\7r\2\2\u041e\u04aa\7\u00e5\2\2\u041f\u0420\7\u00d9\2\2\u0420"+
		"\u04aa\7\62\2\2\u0421\u0422\7\u00d9\2\2\u0422\u0423\7\67\2\2\u0423\u04aa"+
		"\7\u00e5\2\2\u0424\u0425\7\u00d9\2\2\u0425\u04aa\7\u00f0\2\2\u0426\u0427"+
		"\7\u00d9\2\2\u0427\u04aa\7u\2\2\u0428\u0429\7\u00d9\2\2\u0429\u04aa\7"+
		"\u008e\2\2\u042a\u042b\7\67\2\2\u042b\u04aa\7t\2\2\u042c\u042d\7N\2\2"+
		"\u042d\u04aa\7t\2\2\u042e\u042f\7\21\2\2\u042f\u04aa\7t\2\2\u0430\u0431"+
		"\7\u008d\2\2\u0431\u04aa\7\u00e5\2\2\u0432\u0433\7\u008d\2\2\u0433\u04aa"+
		"\7@\2\2\u0434\u0435\7\u00fc\2\2\u0435\u04aa\7\u00e5\2\2\u0436\u0437\7"+
		"\u00fc\2\2\u0437\u04aa\7@\2\2\u0438\u0439\7\67\2\2\u0439\u043a\7\u00e9"+
		"\2\2\u043a\u04aa\7\u0090\2\2\u043b\u043c\7N\2\2\u043c\u043d\7\u00e9\2"+
		"\2\u043d\u04aa\7\u0090\2\2\u043e\u043f\7\21\2\2\u043f\u0440\7\u00e5\2"+
		"\2\u0440\u0441\5\u00b0Y\2\u0441\u0442\7\u009b\2\2\u0442\u0443\7)\2\2\u0443"+
		"\u04aa\3\2\2\2\u0444\u0445\7\21\2\2\u0445\u0446\7\u00e5\2\2\u0446\u0447"+
		"\5\u00b0Y\2\u0447\u0448\7)\2\2\u0448\u0449\7 \2\2\u0449\u04aa\3\2\2\2"+
		"\u044a\u044b\7\21\2\2\u044b\u044c\7\u00e5\2\2\u044c\u044d\5\u00b0Y\2\u044d"+
		"\u044e\7\u009b\2\2\u044e\u044f\7\u00dd\2\2\u044f\u04aa\3\2\2\2\u0450\u0451"+
		"\7\21\2\2\u0451\u0452\7\u00e5\2\2\u0452\u0453\5\u00b0Y\2\u0453\u0454\7"+
		"\u00da\2\2\u0454\u0455\7 \2\2\u0455\u04aa\3\2\2\2\u0456\u0457\7\21\2\2"+
		"\u0457\u0458\7\u00e5\2\2\u0458\u0459\5\u00b0Y\2\u0459\u045a\7\u009b\2"+
		"\2\u045a\u045b\7\u00da\2\2\u045b\u04aa\3\2\2\2\u045c\u045d\7\21\2\2\u045d"+
		"\u045e\7\u00e5\2\2\u045e\u045f\5\u00b0Y\2\u045f\u0460\7\u009b\2\2\u0460"+
		"\u0461\7\u00e0\2\2\u0461\u0462\7\30\2\2\u0462\u0463\7J\2\2\u0463\u04aa"+
		"\3\2\2\2\u0464\u0465\7\21\2\2\u0465\u0466\7\u00e5\2\2\u0466\u0467\5\u00b0"+
		"Y\2\u0467\u0468\7\u00d6\2\2\u0468\u0469\7\u00da\2\2\u0469\u046a\7\u008c"+
		"\2\2\u046a\u04aa\3\2\2\2\u046b\u046c\7\21\2\2\u046c\u046d\7\u00e5\2\2"+
		"\u046d\u046e\5\u00b0Y\2\u046e\u046f\7T\2\2\u046f\u0470\7\u00ac\2\2\u0470"+
		"\u04aa\3\2\2\2\u0471\u0472\7\21\2\2\u0472\u0473\7\u00e5\2\2\u0473\u0474"+
		"\5\u00b0Y\2\u0474\u0475\7\26\2\2\u0475\u0476\7\u00ac\2\2\u0476\u04aa\3"+
		"\2\2\2\u0477\u0478\7\21\2\2\u0478\u0479\7\u00e5\2\2\u0479\u047a\5\u00b0"+
		"Y\2\u047a\u047b\7\u00f6\2\2\u047b\u047c\7\u00ac\2\2\u047c\u04aa\3\2\2"+
		"\2\u047d\u047e\7\21\2\2\u047e\u047f\7\u00e5\2\2\u047f\u0480\5\u00b0Y\2"+
		"\u0480\u0481\7\u00ed\2\2\u0481\u04aa\3\2\2\2\u0482\u0483\7\21\2\2\u0483"+
		"\u0484\7\u00e5\2\2\u0484\u0486\5\u00b0Y\2\u0485\u0487\5(\25\2\u0486\u0485"+
		"\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\7\61\2\2"+
		"\u0489\u04aa\3\2\2\2\u048a\u048b\7\21\2\2\u048b\u048c\7\u00e5\2\2\u048c"+
		"\u048e\5\u00b0Y\2\u048d\u048f\5(\25\2\u048e\u048d\3\2\2\2\u048e\u048f"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\7\64\2\2\u0491\u04aa\3\2\2\2"+
		"\u0492\u0493\7\21\2\2\u0493\u0494\7\u00e5\2\2\u0494\u0496\5\u00b0Y\2\u0495"+
		"\u0497\5(\25\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2"+
		"\2\2\u0498\u0499\7\u00d6\2\2\u0499\u049a\7_\2\2\u049a\u04aa\3\2\2\2\u049b"+
		"\u049c\7\21\2\2\u049c\u049d\7\u00e5\2\2\u049d\u049f\5\u00b0Y\2\u049e\u04a0"+
		"\5(\25\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a2\7\u00c2\2\2\u04a2\u04a3\7.\2\2\u04a3\u04aa\3\2\2\2\u04a4\u04a5"+
		"\7\u00de\2\2\u04a5\u04aa\7\u00ef\2\2\u04a6\u04aa\7\60\2\2\u04a7\u04aa"+
		"\7\u00ca\2\2\u04a8\u04aa\7I\2\2\u04a9\u0401\3\2\2\2\u04a9\u0403\3\2\2"+
		"\2\u04a9\u0405\3\2\2\2\u04a9\u0409\3\2\2\2\u04a9\u040d\3\2\2\2\u04a9\u040f"+
		"\3\2\2\2\u04a9\u0414\3\2\2\2\u04a9\u0416\3\2\2\2\u04a9\u0418\3\2\2\2\u04a9"+
		"\u041b\3\2\2\2\u04a9\u041d\3\2\2\2\u04a9\u041f\3\2\2\2\u04a9\u0421\3\2"+
		"\2\2\u04a9\u0424\3\2\2\2\u04a9\u0426\3\2\2\2\u04a9\u0428\3\2\2\2\u04a9"+
		"\u042a\3\2\2\2\u04a9\u042c\3\2\2\2\u04a9\u042e\3\2\2\2\u04a9\u0430\3\2"+
		"\2\2\u04a9\u0432\3\2\2\2\u04a9\u0434\3\2\2\2\u04a9\u0436\3\2\2\2\u04a9"+
		"\u0438\3\2\2\2\u04a9\u043b\3\2\2\2\u04a9\u043e\3\2\2\2\u04a9\u0444\3\2"+
		"\2\2\u04a9\u044a\3\2\2\2\u04a9\u0450\3\2\2\2\u04a9\u0456\3\2\2\2\u04a9"+
		"\u045c\3\2\2\2\u04a9\u0464\3\2\2\2\u04a9\u046b\3\2\2\2\u04a9\u0471\3\2"+
		"\2\2\u04a9\u0477\3\2\2\2\u04a9\u047d\3\2\2\2\u04a9\u0482\3\2\2\2\u04a9"+
		"\u048a\3\2\2\2\u04a9\u0492\3\2\2\2\u04a9\u049b\3\2\2\2\u04a9\u04a4\3\2"+
		"\2\2\u04a9\u04a6\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04a8\3\2\2\2\u04aa"+
		"\25\3\2\2\2\u04ab\u04ad\7\67\2\2\u04ac\u04ae\7\u00e9\2\2\u04ad\u04ac\3"+
		"\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af\u04b1\7Y\2\2\u04b0"+
		"\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b6\7\u00e5"+
		"\2\2\u04b3\u04b4\7p\2\2\u04b4\u04b5\7\u009b\2\2\u04b5\u04b7\7U\2\2\u04b6"+
		"\u04b3\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\5\u00ae"+
		"X\2\u04b9\27\3\2\2\2\u04ba\u04bb\7\67\2\2\u04bb\u04bd\7\u00a3\2\2\u04bc"+
		"\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\7\u00c2"+
		"\2\2\u04bf\u04c0\7\u00e5\2\2\u04c0\u04c1\5\u00aeX\2\u04c1\31\3\2\2\2\u04c2"+
		"\u04c3\7)\2\2\u04c3\u04c4\7 \2\2\u04c4\u04c8\5\u0096L\2\u04c5\u04c6\7"+
		"\u00dd\2\2\u04c6\u04c7\7 \2\2\u04c7\u04c9\5\u009aN\2\u04c8\u04c5\3\2\2"+
		"\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\7|\2\2\u04cb\u04cc"+
		"\7\u0121\2\2\u04cc\u04cd\7\37\2\2\u04cd\33\3\2\2\2\u04ce\u04cf\7\u00da"+
		"\2\2\u04cf\u04d0\7 \2\2\u04d0\u04d1\5\u0096L\2\u04d1\u04d4\7\u009f\2\2"+
		"\u04d2\u04d5\5B\"\2\u04d3\u04d5\5D#\2\u04d4\u04d2\3\2\2\2\u04d4\u04d3"+
		"\3\2\2\2\u04d5\u04d9\3\2\2\2\u04d6\u04d7\7\u00e0\2\2\u04d7\u04d8\7\30"+
		"\2\2\u04d8\u04da\7J\2\2\u04d9\u04d6\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\35\3\2\2\2\u04db\u04dc\7\u008c\2\2\u04dc\u04dd\7\u011d\2\2\u04dd\37\3"+
		"\2\2\2\u04de\u04df\7/\2\2\u04df\u04e0\7\u011d\2\2\u04e0!\3\2\2\2\u04e1"+
		"\u04e3\5\62\32\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3"+
		"\2\2\2\u04e4\u04e5\5T+\2\u04e5\u04e6\5P)\2\u04e6#\3\2\2\2\u04e7\u04e8"+
		"\7y\2\2\u04e8\u04ea\7\u00ab\2\2\u04e9\u04eb\7\u00e5\2\2\u04ea\u04e9\3"+
		"\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04f3\5\u00aeX\2"+
		"\u04ed\u04f1\5(\25\2\u04ee\u04ef\7p\2\2\u04ef\u04f0\7\u009b\2\2\u04f0"+
		"\u04f2\7U\2\2\u04f1\u04ee\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2"+
		"\2\2\u04f3\u04ed\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u051f\3\2\2\2\u04f5"+
		"\u04f6\7y\2\2\u04f6\u04f8\7|\2\2\u04f7\u04f9\7\u00e5\2\2\u04f8\u04f7\3"+
		"\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fc\5\u00aeX\2"+
		"\u04fb\u04fd\5(\25\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0501"+
		"\3\2\2\2\u04fe\u04ff\7p\2\2\u04ff\u0500\7\u009b\2\2\u0500\u0502\7U\2\2"+
		"\u0501\u04fe\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u051f\3\2\2\2\u0503\u0504"+
		"\7y\2\2\u0504\u0506\7\u00ab\2\2\u0505\u0507\7\u008b\2\2\u0506\u0505\3"+
		"\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\7K\2\2\u0509"+
		"\u050b\7\u011d\2\2\u050a\u050c\5\u00aaV\2\u050b\u050a\3\2\2\2\u050b\u050c"+
		"\3\2\2\2\u050c\u050e\3\2\2\2\u050d\u050f\5F$\2\u050e\u050d\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u051f\3\2\2\2\u0510\u0511\7y\2\2\u0511\u0513\7\u00ab"+
		"\2\2\u0512\u0514\7\u008b\2\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515\u0517\7K\2\2\u0516\u0518\7\u011d\2\2\u0517\u0516"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051c\5\66\34\2"+
		"\u051a\u051b\7\u00a2\2\2\u051b\u051d\5:\36\2\u051c\u051a\3\2\2\2\u051c"+
		"\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e\u04e7\3\2\2\2\u051e\u04f5\3\2"+
		"\2\2\u051e\u0503\3\2\2\2\u051e\u0510\3\2\2\2\u051f%\3\2\2\2\u0520\u0522"+
		"\5(\25\2\u0521\u0523\5\36\20\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2"+
		"\u0523\'\3\2\2\2\u0524\u0525\7\u00ac\2\2\u0525\u0526\7\4\2\2\u0526\u052b"+
		"\5*\26\2\u0527\u0528\7\6\2\2\u0528\u052a\5*\26\2\u0529\u0527\3\2\2\2\u052a"+
		"\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2"+
		"\2\2\u052d\u052b\3\2\2\2\u052e\u052f\7\5\2\2\u052f)\3\2\2\2\u0530\u0533"+
		"\5\u0106\u0084\2\u0531\u0532\7\u010a\2\2\u0532\u0534\5\u00c8e\2\u0533"+
		"\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534+\3\2\2\2\u0535\u0536\t\16\2\2"+
		"\u0536-\3\2\2\2\u0537\u053d\5\u0100\u0081\2\u0538\u053d\7\u011d\2\2\u0539"+
		"\u053d\5\u00caf\2\u053a\u053d\5\u00ccg\2\u053b\u053d\5\u00ceh\2\u053c"+
		"\u0537\3\2\2\2\u053c\u0538\3\2\2\2\u053c\u0539\3\2\2\2\u053c\u053a\3\2"+
		"\2\2\u053c\u053b\3\2\2\2\u053d/\3\2\2\2\u053e\u0543\5\u0106\u0084\2\u053f"+
		"\u0540\7\7\2\2\u0540\u0542\5\u0106\u0084\2\u0541\u053f\3\2\2\2\u0542\u0545"+
		"\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\61\3\2\2\2\u0545"+
		"\u0543\3\2\2\2\u0546\u0547\7\u0108\2\2\u0547\u054c\5\64\33\2\u0548\u0549"+
		"\7\6\2\2\u0549\u054b\5\64\33\2\u054a\u0548\3\2\2\2\u054b\u054e\3\2\2\2"+
		"\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\63\3\2\2\2\u054e\u054c"+
		"\3\2\2\2\u054f\u0551\5\u0102\u0082\2\u0550\u0552\5\u0096L\2\u0551\u0550"+
		"\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2\2\2\u0553\u0555\7\30\2\2"+
		"\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557"+
		"\7\4\2\2\u0557\u0558\5\"\22\2\u0558\u0559\7\5\2\2\u0559\65\3\2\2\2\u055a"+
		"\u055b\7\u0101\2\2\u055b\u055c\5\u00aeX\2\u055c\67\3\2\2\2\u055d\u055e"+
		"\7\u00a2\2\2\u055e\u0568\5:\36\2\u055f\u0560\7\u00ad\2\2\u0560\u0561\7"+
		" \2\2\u0561\u0568\5\u00b8]\2\u0562\u0568\5\32\16\2\u0563\u0568\5\36\20"+
		"\2\u0564\u0568\5 \21\2\u0565\u0566\7\u00e8\2\2\u0566\u0568\5:\36\2\u0567"+
		"\u055d\3\2\2\2\u0567\u055f\3\2\2\2\u0567\u0562\3\2\2\2\u0567\u0563\3\2"+
		"\2\2\u0567\u0564\3\2\2\2\u0567\u0565\3\2\2\2\u0568\u056b\3\2\2\2\u0569"+
		"\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a9\3\2\2\2\u056b\u0569\3\2\2\2"+
		"\u056c\u056d\7\4\2\2\u056d\u0572\5<\37\2\u056e\u056f\7\6\2\2\u056f\u0571"+
		"\5<\37\2\u0570\u056e\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572"+
		"\u0573\3\2\2\2\u0573\u0575\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u0576\7\5"+
		"\2\2\u0576;\3\2\2\2\u0577\u057c\5> \2\u0578\u057a\7\u010a\2\2\u0579\u0578"+
		"\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\5@!\2\u057c"+
		"\u0579\3\2\2\2\u057c\u057d\3\2\2\2\u057d=\3\2\2\2\u057e\u0583\5\u0106"+
		"\u0084\2\u057f\u0580\7\7\2\2\u0580\u0582\5\u0106\u0084\2\u0581\u057f\3"+
		"\2\2\2\u0582\u0585\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0588\3\2\2\2\u0585\u0583\3\2\2\2\u0586\u0588\7\u011d\2\2\u0587\u057e"+
		"\3\2\2\2\u0587\u0586\3\2\2\2\u0588?\3\2\2\2\u0589\u058e\7\u0121\2\2\u058a"+
		"\u058e\7\u0123\2\2\u058b\u058e\5\u00d0i\2\u058c\u058e\7\u011d\2\2\u058d"+
		"\u0589\3\2\2\2\u058d\u058a\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058c\3\2"+
		"\2\2\u058eA\3\2\2\2\u058f\u0590\7\4\2\2\u0590\u0595\5\u00c8e\2\u0591\u0592"+
		"\7\6\2\2\u0592\u0594\5\u00c8e\2\u0593\u0591\3\2\2\2\u0594\u0597\3\2\2"+
		"\2\u0595\u0593\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u0595"+
		"\3\2\2\2\u0598\u0599\7\5\2\2\u0599C\3\2\2\2\u059a\u059b\7\4\2\2\u059b"+
		"\u05a0\5B\"\2\u059c\u059d\7\6\2\2\u059d\u059f\5B\"\2\u059e\u059c\3\2\2"+
		"\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3"+
		"\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05a4\7\5\2\2\u05a4E\3\2\2\2\u05a5"+
		"\u05a6\7\u00e0\2\2\u05a6\u05a7\7\30\2\2\u05a7\u05ac\5H%\2\u05a8\u05a9"+
		"\7\u00e0\2\2\u05a9\u05aa\7 \2\2\u05aa\u05ac\5J&\2\u05ab\u05a5\3\2\2\2"+
		"\u05ab\u05a8\3\2\2\2\u05acG\3\2\2\2\u05ad\u05ae\7x\2\2\u05ae\u05af\7\u011d"+
		"\2\2\u05af\u05b0\7\u00a7\2\2\u05b0\u05b3\7\u011d\2\2\u05b1\u05b3\5\u0106"+
		"\u0084\2\u05b2\u05ad\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3I\3\2\2\2\u05b4"+
		"\u05b8\7\u011d\2\2\u05b5\u05b6\7\u0108\2\2\u05b6\u05b7\7\u00d4\2\2\u05b7"+
		"\u05b9\5:\36\2\u05b8\u05b5\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9K\3\2\2\2"+
		"\u05ba\u05bb\5\u0106\u0084\2\u05bb\u05bc\7\u011d\2\2\u05bcM\3\2\2\2\u05bd"+
		"\u05be\5$\23\2\u05be\u05bf\5T+\2\u05bf\u05c0\5P)\2\u05c0\u05f1\3\2\2\2"+
		"\u05c1\u05c3\5z>\2\u05c2\u05c4\5R*\2\u05c3\u05c2\3\2\2\2\u05c4\u05c5\3"+
		"\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05f1\3\2\2\2\u05c7"+
		"\u05c8\7E\2\2\u05c8\u05c9\7f\2\2\u05c9\u05ca\5\u00aeX\2\u05ca\u05cc\5"+
		"\u00a8U\2\u05cb\u05cd\5r:\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u05f1\3\2\2\2\u05ce\u05cf\7\u00fe\2\2\u05cf\u05d0\5\u00aeX\2\u05d0\u05d1"+
		"\5\u00a8U\2\u05d1\u05d3\5d\63\2\u05d2\u05d4\5r:\2\u05d3\u05d2\3\2\2\2"+
		"\u05d3\u05d4\3\2\2\2\u05d4\u05f1\3\2\2\2\u05d5\u05d6\7\u0093\2\2\u05d6"+
		"\u05d7\7|\2\2\u05d7\u05d8\5\u00aeX\2\u05d8\u05d9\5\u00a8U\2\u05d9\u05df"+
		"\7\u0101\2\2\u05da\u05e0\5\u00aeX\2\u05db\u05dc\7\4\2\2\u05dc\u05dd\5"+
		"\"\22\2\u05dd\u05de\7\5\2\2\u05de\u05e0\3\2\2\2\u05df\u05da\3\2\2\2\u05df"+
		"\u05db\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\5\u00a8U\2\u05e2\u05e3"+
		"\7\u009f\2\2\u05e3\u05e7\5\u00c0a\2\u05e4\u05e6\5f\64\2\u05e5\u05e4\3"+
		"\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"\u05ed\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05ec\5h\65\2\u05eb\u05ea\3\2"+
		"\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05bd\3\2\2\2\u05f0\u05c1\3\2"+
		"\2\2\u05f0\u05c7\3\2\2\2\u05f0\u05ce\3\2\2\2\u05f0\u05d5\3\2\2\2\u05f1"+
		"O\3\2\2\2\u05f2\u05f3\7\u00a4\2\2\u05f3\u05f4\7 \2\2\u05f4\u05f9\5X-\2"+
		"\u05f5\u05f6\7\6\2\2\u05f6\u05f8\5X-\2\u05f7\u05f5\3\2\2\2\u05f8\u05fb"+
		"\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb"+
		"\u05f9\3\2\2\2\u05fc\u05f2\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0608\3\2"+
		"\2\2\u05fe\u05ff\7(\2\2\u05ff\u0600\7 \2\2\u0600\u0605\5\u00be`\2\u0601"+
		"\u0602\7\6\2\2\u0602\u0604\5\u00be`\2\u0603\u0601\3\2\2\2\u0604\u0607"+
		"\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0609\3\2\2\2\u0607"+
		"\u0605\3\2\2\2\u0608\u05fe\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u0614\3\2"+
		"\2\2\u060a\u060b\7M\2\2\u060b\u060c\7 \2\2\u060c\u0611\5\u00be`\2\u060d"+
		"\u060e\7\6\2\2\u060e\u0610\5\u00be`\2\u060f\u060d\3\2\2\2\u0610\u0613"+
		"\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0615\3\2\2\2\u0613"+
		"\u0611\3\2\2\2\u0614\u060a\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0620\3\2"+
		"\2\2\u0616\u0617\7\u00dc\2\2\u0617\u0618\7 \2\2\u0618\u061d\5X-\2\u0619"+
		"\u061a\7\6\2\2\u061a\u061c\5X-\2\u061b\u0619\3\2\2\2\u061c\u061f\3\2\2"+
		"\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u061d"+
		"\3\2\2\2\u0620\u0616\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\3\2\2\2\u0622"+
		"\u0624\5\u00f2z\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u062a"+
		"\3\2\2\2\u0625\u0628\7\u0087\2\2\u0626\u0629\7\20\2\2\u0627\u0629\5\u00be"+
		"`\2\u0628\u0626\3\2\2\2\u0628\u0627\3\2\2\2\u0629\u062b\3\2\2\2\u062a"+
		"\u0625\3\2\2\2\u062a\u062b\3\2\2\2\u062bQ\3\2\2\2\u062c\u062d\5$\23\2"+
		"\u062d\u062e\5\\/\2\u062eS\3\2\2\2\u062f\u0630\b+\1\2\u0630\u0631\5V,"+
		"\2\u0631\u0649\3\2\2\2\u0632\u0633\f\5\2\2\u0633\u0634\6+\3\2\u0634\u0636"+
		"\t\17\2\2\u0635\u0637\5\u0088E\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2"+
		"\2\u0637\u0638\3\2\2\2\u0638\u0648\5T+\6\u0639\u063a\f\4\2\2\u063a\u063b"+
		"\6+\5\2\u063b\u063d\7z\2\2\u063c\u063e\5\u0088E\2\u063d\u063c\3\2\2\2"+
		"\u063d\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0648\5T+\5\u0640\u0641"+
		"\f\3\2\2\u0641\u0642\6+\7\2\u0642\u0644\t\20\2\2\u0643\u0645\5\u0088E"+
		"\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648"+
		"\5T+\4\u0647\u0632\3\2\2\2\u0647\u0639\3\2\2\2\u0647\u0640\3\2\2\2\u0648"+
		"\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064aU\3\2\2\2"+
		"\u064b\u0649\3\2\2\2\u064c\u0656\5^\60\2\u064d\u0656\5Z.\2\u064e\u064f"+
		"\7\u00e5\2\2\u064f\u0656\5\u00aeX\2\u0650\u0656\5\u00a4S\2\u0651\u0652"+
		"\7\4\2\2\u0652\u0653\5\"\22\2\u0653\u0654\7\5\2\2\u0654\u0656\3\2\2\2"+
		"\u0655\u064c\3\2\2\2\u0655\u064d\3\2\2\2\u0655\u064e\3\2\2\2\u0655\u0650"+
		"\3\2\2\2\u0655\u0651\3\2\2\2\u0656W\3\2\2\2\u0657\u0659\5\u00be`\2\u0658"+
		"\u065a\t\21\2\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065d\3"+
		"\2\2\2\u065b\u065c\7\u009d\2\2\u065c\u065e\t\22\2\2\u065d\u065b\3\2\2"+
		"\2\u065d\u065e\3\2\2\2\u065eY\3\2\2\2\u065f\u0661\5z>\2\u0660\u0662\5"+
		"\\/\2\u0661\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0661\3\2\2\2\u0663"+
		"\u0664\3\2\2\2\u0664[\3\2\2\2\u0665\u0667\5`\61\2\u0666\u0668\5r:\2\u0667"+
		"\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\5P"+
		")\2\u066a\u0681\3\2\2\2\u066b\u066f\5b\62\2\u066c\u066e\5\u0086D\2\u066d"+
		"\u066c\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2"+
		"\2\2\u0670\u0673\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0674\5r:\2\u0673\u0672"+
		"\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\3\2\2\2\u0675\u0677\5|?\2\u0676"+
		"\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678\u067a\5t"+
		";\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c\3\2\2\2\u067b"+
		"\u067d\5\u00f2z\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e"+
		"\3\2\2\2\u067e\u067f\5P)\2\u067f\u0681\3\2\2\2\u0680\u0665\3\2\2\2\u0680"+
		"\u066b\3\2\2\2\u0681]\3\2\2\2\u0682\u0684\5`\61\2\u0683\u0685\5z>\2\u0684"+
		"\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687\3\2\2\2\u0686\u0688\5r"+
		":\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u06a0\3\2\2\2\u0689"+
		"\u068b\5b\62\2\u068a\u068c\5z>\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2"+
		"\2\u068c\u0690\3\2\2\2\u068d\u068f\5\u0086D\2\u068e\u068d\3\2\2\2\u068f"+
		"\u0692\3\2\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0694\3\2"+
		"\2\2\u0692\u0690\3\2\2\2\u0693\u0695\5r:\2\u0694\u0693\3\2\2\2\u0694\u0695"+
		"\3\2\2\2\u0695\u0697\3\2\2\2\u0696\u0698\5|?\2\u0697\u0696\3\2\2\2\u0697"+
		"\u0698\3\2\2\2\u0698\u069a\3\2\2\2\u0699\u069b\5t;\2\u069a\u0699\3\2\2"+
		"\2\u069a\u069b\3\2\2\2\u069b\u069d\3\2\2\2\u069c\u069e\5\u00f2z\2\u069d"+
		"\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a0\3\2\2\2\u069f\u0682\3\2"+
		"\2\2\u069f\u0689\3\2\2\2\u06a0_\3\2\2\2\u06a1\u06a2\7\u00d0\2\2\u06a2"+
		"\u06a3\7\u00f1\2\2\u06a3\u06a4\7\4\2\2\u06a4\u06a5\5\u00b6\\\2\u06a5\u06a6"+
		"\7\5\2\2\u06a6\u06ac\3\2\2\2\u06a7\u06a8\7\u0091\2\2\u06a8\u06ac\5\u00b6"+
		"\\\2\u06a9\u06aa\7\u00bd\2\2\u06aa\u06ac\5\u00b6\\\2\u06ab\u06a1\3\2\2"+
		"\2\u06ab\u06a7\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06af"+
		"\5\u00aaV\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b2\3\2\2"+
		"\2\u06b0\u06b1\7\u00bb\2\2\u06b1\u06b3\7\u011d\2\2\u06b2\u06b0\3\2\2\2"+
		"\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\7\u0101\2\2\u06b5"+
		"\u06c2\7\u011d\2\2\u06b6\u06c0\7\30\2\2\u06b7\u06c1\5\u0098M\2\u06b8\u06c1"+
		"\5\u00e8u\2\u06b9\u06bc\7\4\2\2\u06ba\u06bd\5\u0098M\2\u06bb\u06bd\5\u00e8"+
		"u\2\u06bc\u06ba\3\2\2\2\u06bc\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be"+
		"\u06bf\7\5\2\2\u06bf\u06c1\3\2\2\2\u06c0\u06b7\3\2\2\2\u06c0\u06b8\3\2"+
		"\2\2\u06c0\u06b9\3\2\2\2\u06c1\u06c3\3\2\2\2\u06c2\u06b6\3\2\2\2\u06c2"+
		"\u06c3\3\2\2\2\u06c3\u06c5\3\2\2\2\u06c4\u06c6\5\u00aaV\2\u06c5\u06c4"+
		"\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c8\7\u00ba\2"+
		"\2\u06c8\u06ca\7\u011d\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca"+
		"a\3\2\2\2\u06cb\u06cf\7\u00d0\2\2\u06cc\u06ce\5v<\2\u06cd\u06cc\3\2\2"+
		"\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d3"+
		"\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2\u06d4\5\u0088E\2\u06d3\u06d2\3\2\2"+
		"\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\5\u00b6\\\2\u06d6"+
		"c\3\2\2\2\u06d7\u06d8\7\u00d6\2\2\u06d8\u06d9\5n8\2\u06d9e\3\2\2\2\u06da"+
		"\u06db\7\u0105\2\2\u06db\u06de\7\u0092\2\2\u06dc\u06dd\7\23\2\2\u06dd"+
		"\u06df\5\u00c0a\2\u06de\u06dc\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0"+
		"\3\2\2\2\u06e0\u06e1\7\u00eb\2\2\u06e1\u06e2\5j\66\2\u06e2g\3\2\2\2\u06e3"+
		"\u06e4\7\u0105\2\2\u06e4\u06e5\7\u009b\2\2\u06e5\u06e8\7\u0092\2\2\u06e6"+
		"\u06e7\7\23\2\2\u06e7\u06e9\5\u00c0a\2\u06e8\u06e6\3\2\2\2\u06e8\u06e9"+
		"\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\7\u00eb\2\2\u06eb\u06ec\5l\67"+
		"\2\u06eci\3\2\2\2\u06ed\u06f5\7E\2\2\u06ee\u06ef\7\u00fe\2\2\u06ef\u06f0"+
		"\7\u00d6\2\2\u06f0\u06f5\7\u0114\2\2\u06f1\u06f2\7\u00fe\2\2\u06f2\u06f3"+
		"\7\u00d6\2\2\u06f3\u06f5\5n8\2\u06f4\u06ed\3\2\2\2\u06f4\u06ee\3\2\2\2"+
		"\u06f4\u06f1\3\2\2\2\u06f5k\3\2\2\2\u06f6\u06f7\7y\2\2\u06f7\u0709\7\u0114"+
		"\2\2\u06f8\u06f9\7y\2\2\u06f9\u06fa\7\4\2\2\u06fa\u06fb\5\u00acW\2\u06fb"+
		"\u06fc\7\5\2\2\u06fc\u06fd\7\u0102\2\2\u06fd\u06fe\7\4\2\2\u06fe\u0703"+
		"\5\u00be`\2\u06ff\u0700\7\6\2\2\u0700\u0702\5\u00be`\2\u0701\u06ff\3\2"+
		"\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704"+
		"\u0706\3\2\2\2\u0705\u0703\3\2\2\2\u0706\u0707\7\5\2\2\u0707\u0709\3\2"+
		"\2\2\u0708\u06f6\3\2\2\2\u0708\u06f8\3\2\2\2\u0709m\3\2\2\2\u070a\u070f"+
		"\5p9\2\u070b\u070c\7\6\2\2\u070c\u070e\5p9\2\u070d\u070b\3\2\2\2\u070e"+
		"\u0711\3\2\2\2\u070f\u070d\3\2\2\2\u070f\u0710\3\2\2\2\u0710o\3\2\2\2"+
		"\u0711\u070f\3\2\2\2\u0712\u0713\5\u00aeX\2\u0713\u0714\7\u010a\2\2\u0714"+
		"\u0715\5\u00be`\2\u0715q\3\2\2\2\u0716\u0717\7\u0106\2\2\u0717\u0718\5"+
		"\u00c0a\2\u0718s\3\2\2\2\u0719\u071a\7n\2\2\u071a\u071b\5\u00c0a\2\u071b"+
		"u\3\2\2\2\u071c\u071d\7\b\2\2\u071d\u0724\5x=\2\u071e\u0720\7\6\2\2\u071f"+
		"\u071e\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0723\5x"+
		"=\2\u0722\u071f\3\2\2\2\u0723\u0726\3\2\2\2\u0724\u0722\3\2\2\2\u0724"+
		"\u0725\3\2\2\2\u0725\u0727\3\2\2\2\u0726\u0724\3\2\2\2\u0727\u0728\7\t"+
		"\2\2\u0728w\3\2\2\2\u0729\u0737\5\u0106\u0084\2\u072a\u072b\5\u0106\u0084"+
		"\2\u072b\u072c\7\4\2\2\u072c\u0731\5\u00c6d\2\u072d\u072e\7\6\2\2\u072e"+
		"\u0730\5\u00c6d\2\u072f\u072d\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f"+
		"\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\3\2\2\2\u0733\u0731\3\2\2\2\u0734"+
		"\u0735\7\5\2\2\u0735\u0737\3\2\2\2\u0736\u0729\3\2\2\2\u0736\u072a\3\2"+
		"\2\2\u0737y\3\2\2\2\u0738\u0739\7f\2\2\u0739\u073e\5\u008aF\2\u073a\u073b"+
		"\7\6\2\2\u073b\u073d\5\u008aF\2\u073c\u073a\3\2\2\2\u073d\u0740\3\2\2"+
		"\2\u073e\u073c\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0744\3\2\2\2\u0740\u073e"+
		"\3\2\2\2\u0741\u0743\5\u0086D\2\u0742\u0741\3\2\2\2\u0743\u0746\3\2\2"+
		"\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0748\3\2\2\2\u0746\u0744"+
		"\3\2\2\2\u0747\u0749\5\u0080A\2\u0748\u0747\3\2\2\2\u0748\u0749\3\2\2"+
		"\2\u0749{\3\2\2\2\u074a\u074b\7l\2\2\u074b\u074c\7 \2\2\u074c\u0751\5"+
		"\u00be`\2\u074d\u074e\7\6\2\2\u074e\u0750\5\u00be`\2\u074f\u074d\3\2\2"+
		"\2\u0750\u0753\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0765"+
		"\3\2\2\2\u0753\u0751\3\2\2\2\u0754\u0755\7\u0108\2\2\u0755\u0766\7\u00cb"+
		"\2\2\u0756\u0757\7\u0108\2\2\u0757\u0766\79\2\2\u0758\u0759\7m\2\2\u0759"+
		"\u075a\7\u00d8\2\2\u075a\u075b\7\4\2\2\u075b\u0760\5~@\2\u075c\u075d\7"+
		"\6\2\2\u075d\u075f\5~@\2\u075e\u075c\3\2\2\2\u075f\u0762\3\2\2\2\u0760"+
		"\u075e\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762\u0760\3\2"+
		"\2\2\u0763\u0764\7\5\2\2\u0764\u0766\3\2\2\2\u0765\u0754\3\2\2\2\u0765"+
		"\u0756\3\2\2\2\u0765\u0758\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0777\3\2"+
		"\2\2\u0767\u0768\7l\2\2\u0768\u0769\7 \2\2\u0769\u076a\7m\2\2\u076a\u076b"+
		"\7\u00d8\2\2\u076b\u076c\7\4\2\2\u076c\u0771\5~@\2\u076d\u076e\7\6\2\2"+
		"\u076e\u0770\5~@\2\u076f\u076d\3\2\2\2\u0770\u0773\3\2\2\2\u0771\u076f"+
		"\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0774\3\2\2\2\u0773\u0771\3\2\2\2\u0774"+
		"\u0775\7\5\2\2\u0775\u0777\3\2\2\2\u0776\u074a\3\2\2\2\u0776\u0767\3\2"+
		"\2\2\u0777}\3\2\2\2\u0778\u0781\7\4\2\2\u0779\u077e\5\u00be`\2\u077a\u077b"+
		"\7\6\2\2\u077b\u077d\5\u00be`\2\u077c\u077a\3\2\2\2\u077d\u0780\3\2\2"+
		"\2\u077e\u077c\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e"+
		"\3\2\2\2\u0781\u0779\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0783\3\2\2\2\u0783"+
		"\u0786\7\5\2\2\u0784\u0786\5\u00be`\2\u0785\u0778\3\2\2\2\u0785\u0784"+
		"\3\2\2\2\u0786\177\3\2\2\2\u0787\u0788\7\u00b0\2\2\u0788\u0789\7\4\2\2"+
		"\u0789\u078a\5\u00b6\\\2\u078a\u078b\7b\2\2\u078b\u078c\5\u0082B\2\u078c"+
		"\u078d\7s\2\2\u078d\u078e\7\4\2\2\u078e\u0793\5\u0084C\2\u078f\u0790\7"+
		"\6\2\2\u0790\u0792\5\u0084C\2\u0791\u078f\3\2\2\2\u0792\u0795\3\2\2\2"+
		"\u0793\u0791\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0796\3\2\2\2\u0795\u0793"+
		"\3\2\2\2\u0796\u0797\7\5\2\2\u0797\u0798\7\5\2\2\u0798\u0081\3\2\2\2\u0799"+
		"\u07a6\5\u0106\u0084\2\u079a\u079b\7\4\2\2\u079b\u07a0\5\u0106\u0084\2"+
		"\u079c\u079d\7\6\2\2\u079d\u079f\5\u0106\u0084\2\u079e\u079c\3\2\2\2\u079f"+
		"\u07a2\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a3\3\2"+
		"\2\2\u07a2\u07a0\3\2\2\2\u07a3\u07a4\7\5\2\2\u07a4\u07a6\3\2\2\2\u07a5"+
		"\u0799\3\2\2\2\u07a5\u079a\3\2\2\2\u07a6\u0083\3\2\2\2\u07a7\u07ac\5\u00be"+
		"`\2\u07a8\u07aa\7\30\2\2\u07a9\u07a8\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa"+
		"\u07ab\3\2\2\2\u07ab\u07ad\5\u0106\u0084\2\u07ac\u07a9\3\2\2\2\u07ac\u07ad"+
		"\3\2\2\2\u07ad\u0085\3\2\2\2\u07ae\u07af\7\u0082\2\2\u07af\u07b1\7\u0103"+
		"\2\2\u07b0\u07b2\7\u00a6\2\2\u07b1\u07b0\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2"+
		"\u07b3\3\2\2\2\u07b3\u07b4\5\u0100\u0081\2\u07b4\u07bd\7\4\2\2\u07b5\u07ba"+
		"\5\u00be`\2\u07b6\u07b7\7\6\2\2\u07b7\u07b9\5\u00be`\2\u07b8\u07b6\3\2"+
		"\2\2\u07b9\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb"+
		"\u07be\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07b5\3\2\2\2\u07bd\u07be\3\2"+
		"\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c0\7\5\2\2\u07c0\u07cc\5\u0106\u0084"+
		"\2\u07c1\u07c3\7\30\2\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3"+
		"\u07c4\3\2\2\2\u07c4\u07c9\5\u0106\u0084\2\u07c5\u07c6\7\6\2\2\u07c6\u07c8"+
		"\5\u0106\u0084\2\u07c7\u07c5\3\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3"+
		"\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cd\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cc"+
		"\u07c2\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u0087\3\2\2\2\u07ce\u07cf\t\23"+
		"\2\2\u07cf\u0089\3\2\2\2\u07d0\u07d4\5\u00a2R\2\u07d1\u07d3\5\u008cG\2"+
		"\u07d2\u07d1\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d4\u07d5"+
		"\3\2\2\2\u07d5\u008b\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d7\u07d8\5\u008eH"+
		"\2\u07d8\u07d9\7\177\2\2\u07d9\u07db\5\u00a2R\2\u07da\u07dc\5\u0090I\2"+
		"\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07e3\3\2\2\2\u07dd\u07de"+
		"\7\u0099\2\2\u07de\u07df\5\u008eH\2\u07df\u07e0\7\177\2\2\u07e0\u07e1"+
		"\5\u00a2R\2\u07e1\u07e3\3\2\2\2\u07e2\u07d7\3\2\2\2\u07e2\u07dd\3\2\2"+
		"\2\u07e3\u008d\3\2\2\2\u07e4\u07e6\7v\2\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6"+
		"\3\2\2\2\u07e6\u07fd\3\2\2\2\u07e7\u07fd\78\2\2\u07e8\u07ea\7\u0085\2"+
		"\2\u07e9\u07eb\7\u00a6\2\2\u07ea\u07e9\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb"+
		"\u07fd\3\2\2\2\u07ec\u07ee\7\u0085\2\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee"+
		"\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07fd\7\u00d1\2\2\u07f0\u07f2\7\u00c6"+
		"\2\2\u07f1\u07f3\7\u00a6\2\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3"+
		"\u07fd\3\2\2\2\u07f4\u07f6\7g\2\2\u07f5\u07f7\7\u00a6\2\2\u07f6\u07f5"+
		"\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07fd\3\2\2\2\u07f8\u07fa\7\u0085\2"+
		"\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd"+
		"\7\24\2\2\u07fc\u07e5\3\2\2\2\u07fc\u07e7\3\2\2\2\u07fc\u07e8\3\2\2\2"+
		"\u07fc\u07ed\3\2\2\2\u07fc\u07f0\3\2\2\2\u07fc\u07f4\3\2\2\2\u07fc\u07f9"+
		"\3\2\2\2\u07fd\u008f\3\2\2\2\u07fe\u07ff\7\u009f\2\2\u07ff\u0803\5\u00c0"+
		"a\2\u0800\u0801\7\u0101\2\2\u0801\u0803\5\u0096L\2\u0802\u07fe\3\2\2\2"+
		"\u0802\u0800\3\2\2\2\u0803\u0091\3\2\2\2\u0804\u0805\7\u00e7\2\2\u0805"+
		"\u0807\7\4\2\2\u0806\u0808\5\u0094K\2\u0807\u0806\3\2\2\2\u0807\u0808"+
		"\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080a\7\5\2\2\u080a\u0093\3\2\2\2\u080b"+
		"\u080d\7\u0113\2\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e"+
		"\3\2\2\2\u080e\u080f\t\24\2\2\u080f\u0824\7\u00af\2\2\u0810\u0811\5\u00be"+
		"`\2\u0811\u0812\7\u00cd\2\2\u0812\u0824\3\2\2\2\u0813\u0814\7\36\2\2\u0814"+
		"\u0815\7\u0121\2\2\u0815\u0816\7\u00a5\2\2\u0816\u0817\7\u009e\2\2\u0817"+
		"\u0820\7\u0121\2\2\u0818\u081e\7\u009f\2\2\u0819\u081f\5\u0106\u0084\2"+
		"\u081a\u081b\5\u0100\u0081\2\u081b\u081c\7\4\2\2\u081c\u081d\7\5\2\2\u081d"+
		"\u081f\3\2\2\2\u081e\u0819\3\2\2\2\u081e\u081a\3\2\2\2\u081f\u0821\3\2"+
		"\2\2\u0820\u0818\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0824\3\2\2\2\u0822"+
		"\u0824\5\u00be`\2\u0823\u080c\3\2\2\2\u0823\u0810\3\2\2\2\u0823\u0813"+
		"\3\2\2\2\u0823\u0822\3\2\2\2\u0824\u0095\3\2\2\2\u0825\u0826\7\4\2\2\u0826"+
		"\u0827\5\u0098M\2\u0827\u0828\7\5\2\2\u0828\u0097\3\2\2\2\u0829\u082e"+
		"\5\u0102\u0082\2\u082a\u082b\7\6\2\2\u082b\u082d\5\u0102\u0082\2\u082c"+
		"\u082a\3\2\2\2\u082d\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2"+
		"\2\2\u082f\u0099\3\2\2\2\u0830\u082e\3\2\2\2\u0831\u0832\7\4\2\2\u0832"+
		"\u0837\5\u009cO\2\u0833\u0834\7\6\2\2\u0834\u0836\5\u009cO\2\u0835\u0833"+
		"\3\2\2\2\u0836\u0839\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838"+
		"\u083a\3\2\2\2\u0839\u0837\3\2\2\2\u083a\u083b\7\5\2\2\u083b\u009b\3\2"+
		"\2\2\u083c\u083e\5\u0102\u0082\2\u083d\u083f\t\21\2\2\u083e\u083d\3\2"+
		"\2\2\u083e\u083f\3\2\2\2\u083f\u009d\3\2\2\2\u0840\u0841\7\4\2\2\u0841"+
		"\u0846\5\u00a0Q\2\u0842\u0843\7\6\2\2\u0843\u0845\5\u00a0Q\2\u0844\u0842"+
		"\3\2\2\2\u0845\u0848\3\2\2\2\u0846\u0844\3\2\2\2\u0846\u0847\3\2\2\2\u0847"+
		"\u0849\3\2\2\2\u0848\u0846\3\2\2\2\u0849\u084a\7\5\2\2\u084a\u009f\3\2"+
		"\2\2\u084b\u084d\5\u0106\u0084\2\u084c\u084e\5 \21\2\u084d\u084c\3\2\2"+
		"\2\u084d\u084e\3\2\2\2\u084e\u00a1\3\2\2\2\u084f\u0851\5\u00aeX\2\u0850"+
		"\u0852\5\u0092J\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853"+
		"\3\2\2\2\u0853\u0854\5\u00a8U\2\u0854\u0868\3\2\2\2\u0855\u0856\7\4\2"+
		"\2\u0856\u0857\5\"\22\2\u0857\u0859\7\5\2\2\u0858\u085a\5\u0092J\2\u0859"+
		"\u0858\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\5\u00a8"+
		"U\2\u085c\u0868\3\2\2\2\u085d\u085e\7\4\2\2\u085e\u085f\5\u008aF\2\u085f"+
		"\u0861\7\5\2\2\u0860\u0862\5\u0092J\2\u0861\u0860\3\2\2\2\u0861\u0862"+
		"\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\5\u00a8U\2\u0864\u0868\3\2\2"+
		"\2\u0865\u0868\5\u00a4S\2\u0866\u0868\5\u00a6T\2\u0867\u084f\3\2\2\2\u0867"+
		"\u0855\3\2\2\2\u0867\u085d\3\2\2\2\u0867\u0865\3\2\2\2\u0867\u0866\3\2"+
		"\2\2\u0868\u00a3\3\2\2\2\u0869\u086a\7\u0102\2\2\u086a\u086f\5\u00be`"+
		"\2\u086b\u086c\7\6\2\2\u086c\u086e\5\u00be`\2\u086d\u086b\3\2\2\2\u086e"+
		"\u0871\3\2\2\2\u086f\u086d\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0872\3\2"+
		"\2\2\u0871\u086f\3\2\2\2\u0872\u0873\5\u00a8U\2\u0873\u00a5\3\2\2\2\u0874"+
		"\u0875\5\u0102\u0082\2\u0875\u087e\7\4\2\2\u0876\u087b\5\u00be`\2\u0877"+
		"\u0878\7\6\2\2\u0878\u087a\5\u00be`\2\u0879\u0877\3\2\2\2\u087a\u087d"+
		"\3\2\2\2\u087b\u0879\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087f\3\2\2\2\u087d"+
		"\u087b\3\2\2\2\u087e\u0876\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\3\2"+
		"\2\2\u0880\u0881\7\5\2\2\u0881\u0882\5\u00a8U\2\u0882\u00a7\3\2\2\2\u0883"+
		"\u0885\7\30\2\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2\2\u0885";
	private static final String _serializedATNSegment1 =
		"\u0886\3\2\2\2\u0886\u0888\5\u0108\u0085\2\u0887\u0889\5\u0096L\2\u0888"+
		"\u0887\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b\3\2\2\2\u088a\u0884\3\2"+
		"\2\2\u088a\u088b\3\2\2\2\u088b\u00a9\3\2\2\2\u088c\u088d\7\u00cc\2\2\u088d"+
		"\u088e\7d\2\2\u088e\u088f\7\u00d3\2\2\u088f\u0893\7\u011d\2\2\u0890\u0891"+
		"\7\u0108\2\2\u0891\u0892\7\u00d4\2\2\u0892\u0894\5:\36\2\u0893\u0890\3"+
		"\2\2\2\u0893\u0894\3\2\2\2\u0894\u08be\3\2\2\2\u0895\u0896\7\u00cc\2\2"+
		"\u0896\u0897\7d\2\2\u0897\u08a1\7F\2\2\u0898\u0899\7]\2\2\u0899\u089a"+
		"\7\u00ea\2\2\u089a\u089b\7 \2\2\u089b\u089f\7\u011d\2\2\u089c\u089d\7"+
		"R\2\2\u089d\u089e\7 \2\2\u089e\u08a0\7\u011d\2\2\u089f\u089c\3\2\2\2\u089f"+
		"\u08a0\3\2\2\2\u08a0\u08a2\3\2\2\2\u08a1\u0898\3\2\2\2\u08a1\u08a2\3\2"+
		"\2\2\u08a2\u08a8\3\2\2\2\u08a3\u08a4\7,\2\2\u08a4\u08a5\7~\2\2\u08a5\u08a6"+
		"\7\u00ea\2\2\u08a6\u08a7\7 \2\2\u08a7\u08a9\7\u011d\2\2\u08a8\u08a3\3"+
		"\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08af\3\2\2\2\u08aa\u08ab\7\u0091\2\2"+
		"\u08ab\u08ac\7\u0080\2\2\u08ac\u08ad\7\u00ea\2\2\u08ad\u08ae\7 \2\2\u08ae"+
		"\u08b0\7\u011d\2\2\u08af\u08aa\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b5"+
		"\3\2\2\2\u08b1\u08b2\7\u0088\2\2\u08b2\u08b3\7\u00ea\2\2\u08b3\u08b4\7"+
		" \2\2\u08b4\u08b6\7\u011d\2\2\u08b5\u08b1\3\2\2\2\u08b5\u08b6\3\2\2\2"+
		"\u08b6\u08bb\3\2\2\2\u08b7\u08b8\7\u009c\2\2\u08b8\u08b9\7D\2\2\u08b9"+
		"\u08ba\7\30\2\2\u08ba\u08bc\7\u011d\2\2\u08bb\u08b7\3\2\2\2\u08bb\u08bc"+
		"\3\2\2\2\u08bc\u08be\3\2\2\2\u08bd\u088c\3\2\2\2\u08bd\u0895\3\2\2\2\u08be"+
		"\u00ab\3\2\2\2\u08bf\u08c4\5\u00aeX\2\u08c0\u08c1\7\6\2\2\u08c1\u08c3"+
		"\5\u00aeX\2\u08c2\u08c0\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2"+
		"\2\u08c4\u08c5\3\2\2\2\u08c5\u00ad\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7\u08cc"+
		"\5\u0102\u0082\2\u08c8\u08c9\7\7\2\2\u08c9\u08cb\5\u0102\u0082\2\u08ca"+
		"\u08c8\3\2\2\2\u08cb\u08ce\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cd\3\2"+
		"\2\2\u08cd\u00af\3\2\2\2\u08ce\u08cc\3\2\2\2\u08cf\u08d0\5\u0102\u0082"+
		"\2\u08d0\u08d1\7\7\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08cf\3\2\2\2\u08d2\u08d3"+
		"\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\5\u0102\u0082\2\u08d5\u00b1\3"+
		"\2\2\2\u08d6\u08d7\5\u0102\u0082\2\u08d7\u08d8\7\7\2\2\u08d8\u08da\3\2"+
		"\2\2\u08d9\u08d6\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08db\3\2\2\2\u08db"+
		"\u08dc\5\u0102\u0082\2\u08dc\u00b3\3\2\2\2\u08dd\u08e5\5\u00be`\2\u08de"+
		"\u08e0\7\30\2\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e3\3"+
		"\2\2\2\u08e1\u08e4\5\u0102\u0082\2\u08e2\u08e4\5\u0096L\2\u08e3\u08e1"+
		"\3\2\2\2\u08e3\u08e2\3\2\2\2\u08e4\u08e6\3\2\2\2\u08e5\u08df\3\2\2\2\u08e5"+
		"\u08e6\3\2\2\2\u08e6\u00b5\3\2\2\2\u08e7\u08ec\5\u00b4[\2\u08e8\u08e9"+
		"\7\6\2\2\u08e9\u08eb\5\u00b4[\2\u08ea\u08e8\3\2\2\2\u08eb\u08ee\3\2\2"+
		"\2\u08ec\u08ea\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u00b7\3\2\2\2\u08ee\u08ec"+
		"\3\2\2\2\u08ef\u08f0\7\4\2\2\u08f0\u08f5\5\u00ba^\2\u08f1\u08f2\7\6\2"+
		"\2\u08f2\u08f4\5\u00ba^\2\u08f3\u08f1\3\2\2\2\u08f4\u08f7\3\2\2\2\u08f5"+
		"\u08f3\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8\3\2\2\2\u08f7\u08f5\3\2"+
		"\2\2\u08f8\u08f9\7\5\2\2\u08f9\u00b9\3\2\2\2\u08fa\u0908\5\u0100\u0081"+
		"\2\u08fb\u08fc\5\u0106\u0084\2\u08fc\u08fd\7\4\2\2\u08fd\u0902\5\u00bc"+
		"_\2\u08fe\u08ff\7\6\2\2\u08ff\u0901\5\u00bc_\2\u0900\u08fe\3\2\2\2\u0901"+
		"\u0904\3\2\2\2\u0902\u0900\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0905\3\2"+
		"\2\2\u0904\u0902\3\2\2\2\u0905\u0906\7\5\2\2\u0906\u0908\3\2\2\2\u0907"+
		"\u08fa\3\2\2\2\u0907\u08fb\3\2\2\2\u0908\u00bb\3\2\2\2\u0909\u090c\5\u0100"+
		"\u0081\2\u090a\u090c\5\u00c8e\2\u090b\u0909\3\2\2\2\u090b\u090a\3\2\2"+
		"\2\u090c\u00bd\3\2\2\2\u090d\u090e\5\u00c0a\2\u090e\u00bf\3\2\2\2\u090f"+
		"\u0910\ba\1\2\u0910\u0911\7\u009b\2\2\u0911\u091c\5\u00c0a\7\u0912\u0913"+
		"\7U\2\2\u0913\u0914\7\4\2\2\u0914\u0915\5\"\22\2\u0915\u0916\7\5\2\2\u0916"+
		"\u091c\3\2\2\2\u0917\u0919\5\u00c4c\2\u0918\u091a\5\u00c2b\2\u0919\u0918"+
		"\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091c\3\2\2\2\u091b\u090f\3\2\2\2\u091b"+
		"\u0912\3\2\2\2\u091b\u0917\3\2\2\2\u091c\u0925\3\2\2\2\u091d\u091e\f\4"+
		"\2\2\u091e\u091f\7\23\2\2\u091f\u0924\5\u00c0a\5\u0920\u0921\f\3\2\2\u0921"+
		"\u0922\7\u00a3\2\2\u0922\u0924\5\u00c0a\4\u0923\u091d\3\2\2\2\u0923\u0920"+
		"\3\2\2\2\u0924\u0927\3\2\2\2\u0925\u0923\3\2\2\2\u0925\u0926\3\2\2\2\u0926"+
		"\u00c1\3\2\2\2\u0927\u0925\3\2\2\2\u0928\u092a\7\u009b\2\2\u0929\u0928"+
		"\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c\7\34\2\2"+
		"\u092c\u092d\5\u00c4c\2\u092d\u092e\7\23\2\2\u092e\u092f\5\u00c4c\2\u092f"+
		"\u0967\3\2\2\2\u0930\u0932\7\u009b\2\2\u0931\u0930\3\2\2\2\u0931\u0932"+
		"\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\7s\2\2\u0934\u0935\7\4\2\2\u0935"+
		"\u093a\5\u00be`\2\u0936\u0937\7\6\2\2\u0937\u0939\5\u00be`\2\u0938\u0936"+
		"\3\2\2\2\u0939\u093c\3\2\2\2\u093a\u0938\3\2\2\2\u093a\u093b\3\2\2\2\u093b"+
		"\u093d\3\2\2\2\u093c\u093a\3\2\2\2\u093d\u093e\7\5\2\2\u093e\u0967\3\2"+
		"\2\2\u093f\u0941\7\u009b\2\2\u0940\u093f\3\2\2\2\u0940\u0941\3\2\2\2\u0941"+
		"\u0942\3\2\2\2\u0942\u0943\7s\2\2\u0943\u0944\7\4\2\2\u0944\u0945\5\""+
		"\22\2\u0945\u0946\7\5\2\2\u0946\u0967\3\2\2\2\u0947\u0949\7\u009b\2\2"+
		"\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b"+
		"\7\u00c7\2\2\u094b\u0967\5\u00c4c\2\u094c\u094e\7\u009b\2\2\u094d\u094c"+
		"\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\7\u0086\2"+
		"\2\u0950\u0953\5\u00c4c\2\u0951\u0952\7Q\2\2\u0952\u0954\7\u011d\2\2\u0953"+
		"\u0951\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0967\3\2\2\2\u0955\u0957\7}"+
		"\2\2\u0956\u0958\7\u009b\2\2\u0957\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958"+
		"\u0959\3\2\2\2\u0959\u0967\7\u009c\2\2\u095a\u095c\7}\2\2\u095b\u095d"+
		"\7\u009b\2\2\u095c\u095b\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e\3\2\2"+
		"\2\u095e\u0967\t\25\2\2\u095f\u0961\7}\2\2\u0960\u0962\7\u009b\2\2\u0961"+
		"\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\7L"+
		"\2\2\u0964\u0965\7f\2\2\u0965\u0967\5\u00c4c\2\u0966\u0929\3\2\2\2\u0966"+
		"\u0931\3\2\2\2\u0966\u0940\3\2\2\2\u0966\u0948\3\2\2\2\u0966\u094d\3\2"+
		"\2\2\u0966\u0955\3\2\2\2\u0966\u095a\3\2\2\2\u0966\u095f\3\2\2\2\u0967"+
		"\u00c3\3\2\2\2\u0968\u0969\bc\1\2\u0969\u096d\5\u00c6d\2\u096a\u096b\t"+
		"\26\2\2\u096b\u096d\5\u00c4c\t\u096c\u0968\3\2\2\2\u096c\u096a\3\2\2\2"+
		"\u096d\u0983\3\2\2\2\u096e\u096f\f\b\2\2\u096f\u0970\t\27\2\2\u0970\u0982"+
		"\5\u00c4c\t\u0971\u0972\f\7\2\2\u0972\u0973\t\30\2\2\u0973\u0982\5\u00c4"+
		"c\b\u0974\u0975\f\6\2\2\u0975\u0976\7\u0119\2\2\u0976\u0982\5\u00c4c\7"+
		"\u0977\u0978\f\5\2\2\u0978\u0979\7\u011c\2\2\u0979\u0982\5\u00c4c\6\u097a"+
		"\u097b\f\4\2\2\u097b\u097c\7\u011a\2\2\u097c\u0982\5\u00c4c\5\u097d\u097e"+
		"\f\3\2\2\u097e\u097f\5\u00caf\2\u097f\u0980\5\u00c4c\4\u0980\u0982\3\2"+
		"\2\2\u0981\u096e\3\2\2\2\u0981\u0971\3\2\2\2\u0981\u0974\3\2\2\2\u0981"+
		"\u0977\3\2\2\2\u0981\u097a\3\2\2\2\u0981\u097d\3\2\2\2\u0982\u0985\3\2"+
		"\2\2\u0983\u0981\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u00c5\3\2\2\2\u0985"+
		"\u0983\3\2\2\2\u0986\u0987\bd\1\2\u0987\u0a3f\t\31\2\2\u0988\u098a\7#"+
		"\2\2\u0989\u098b\5\u00f0y\2\u098a\u0989\3\2\2\2\u098b\u098c\3\2\2\2\u098c"+
		"\u098a\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u0990\3\2\2\2\u098e\u098f\7O"+
		"\2\2\u098f\u0991\5\u00be`\2\u0990\u098e\3\2\2\2\u0990\u0991\3\2\2\2\u0991"+
		"\u0992\3\2\2\2\u0992\u0993\7P\2\2\u0993\u0a3f\3\2\2\2\u0994\u0995\7#\2"+
		"\2\u0995\u0997\5\u00be`\2\u0996\u0998\5\u00f0y\2\u0997\u0996\3\2\2\2\u0998"+
		"\u0999\3\2\2\2\u0999\u0997\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099d\3\2"+
		"\2\2\u099b\u099c\7O\2\2\u099c\u099e\5\u00be`\2\u099d\u099b\3\2\2\2\u099d"+
		"\u099e\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0\7P\2\2\u09a0\u0a3f\3\2"+
		"\2\2\u09a1\u09a2\7$\2\2\u09a2\u09a3\7\4\2\2\u09a3\u09a4\5\u00be`\2\u09a4"+
		"\u09a5\7\30\2\2\u09a5\u09a6\5\u00e2r\2\u09a6\u09a7\7\5\2\2\u09a7\u0a3f"+
		"\3\2\2\2\u09a8\u09a9\7\u00e2\2\2\u09a9\u09b2\7\4\2\2\u09aa\u09af\5\u00b4"+
		"[\2\u09ab\u09ac\7\6\2\2\u09ac\u09ae\5\u00b4[\2\u09ad\u09ab\3\2\2\2\u09ae"+
		"\u09b1\3\2\2\2\u09af\u09ad\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b3\3\2"+
		"\2\2\u09b1\u09af\3\2\2\2\u09b2\u09aa\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3"+
		"\u09b4\3\2\2\2\u09b4\u0a3f\7\5\2\2\u09b5\u09b6\7`\2\2\u09b6\u09b7\7\4"+
		"\2\2\u09b7\u09ba\5\u00be`\2\u09b8\u09b9\7q\2\2\u09b9\u09bb\7\u009d\2\2"+
		"\u09ba\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd"+
		"\7\5\2\2\u09bd\u0a3f\3\2\2\2\u09be\u09bf\7\u0081\2\2\u09bf\u09c0\7\4\2"+
		"\2\u09c0\u09c3\5\u00be`\2\u09c1\u09c2\7q\2\2\u09c2\u09c4\7\u009d\2\2\u09c3"+
		"\u09c1\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c6\7\5"+
		"\2\2\u09c6\u0a3f\3\2\2\2\u09c7\u09c8\7\u00b2\2\2\u09c8\u09c9\7\4\2\2\u09c9"+
		"\u09ca\5\u00c4c\2\u09ca\u09cb\7s\2\2\u09cb\u09cc\5\u00c4c\2\u09cc\u09cd"+
		"\7\5\2\2\u09cd\u0a3f\3\2\2\2\u09ce\u0a3f\5\u00c8e\2\u09cf\u0a3f\7\u0114"+
		"\2\2\u09d0\u09d1\5\u0100\u0081\2\u09d1\u09d2\7\7\2\2\u09d2\u09d3\7\u0114"+
		"\2\2\u09d3\u0a3f\3\2\2\2\u09d4\u09d5\7\4\2\2\u09d5\u09d8\5\u00b4[\2\u09d6"+
		"\u09d7\7\6\2\2\u09d7\u09d9\5\u00b4[\2\u09d8\u09d6\3\2\2\2\u09d9\u09da"+
		"\3\2\2\2\u09da\u09d8\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc"+
		"\u09dd\7\5\2\2\u09dd\u0a3f\3\2\2\2\u09de\u09df\7\4\2\2\u09df\u09e0\5\""+
		"\22\2\u09e0\u09e1\7\5\2\2\u09e1\u0a3f\3\2\2\2\u09e2\u09e3\5\u00fe\u0080"+
		"\2\u09e3\u09ef\7\4\2\2\u09e4\u09e6\5\u0088E\2\u09e5\u09e4\3\2\2\2\u09e5"+
		"\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09ec\5\u00be`\2\u09e8\u09e9"+
		"\7\6\2\2\u09e9\u09eb\5\u00be`\2\u09ea\u09e8\3\2\2\2\u09eb\u09ee\3\2\2"+
		"\2\u09ec\u09ea\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09f0\3\2\2\2\u09ee\u09ec"+
		"\3\2\2\2\u09ef\u09e5\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1"+
		"\u09f8\7\5\2\2\u09f2\u09f3\7^\2\2\u09f3\u09f4\7\4\2\2\u09f4\u09f5\7\u0106"+
		"\2\2\u09f5\u09f6\5\u00c0a\2\u09f6\u09f7\7\5\2\2\u09f7\u09f9\3\2\2\2\u09f8"+
		"\u09f2\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09fc\3\2\2\2\u09fa\u09fb\7\u00a8"+
		"\2\2\u09fb\u09fd\5\u00f6|\2\u09fc\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd"+
		"\u0a3f\3\2\2\2\u09fe\u09ff\5\u0106\u0084\2\u09ff\u0a00\7\n\2\2\u0a00\u0a01"+
		"\5\u00be`\2\u0a01\u0a3f\3\2\2\2\u0a02\u0a03\7\4\2\2\u0a03\u0a06\5\u0106"+
		"\u0084\2\u0a04\u0a05\7\6\2\2\u0a05\u0a07\5\u0106\u0084\2\u0a06\u0a04\3"+
		"\2\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a06\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09"+
		"\u0a0a\3\2\2\2\u0a0a\u0a0b\7\5\2\2\u0a0b\u0a0c\7\n\2\2\u0a0c\u0a0d\5\u00be"+
		"`\2\u0a0d\u0a3f\3\2\2\2\u0a0e\u0a3f\5\u0106\u0084\2\u0a0f\u0a10\7\4\2"+
		"\2\u0a10\u0a11\5\u00be`\2\u0a11\u0a12\7\5\2\2\u0a12\u0a3f\3\2\2\2\u0a13"+
		"\u0a14\7Z\2\2\u0a14\u0a15\7\4\2\2\u0a15\u0a16\5\u0106\u0084\2\u0a16\u0a17"+
		"\7f\2\2\u0a17\u0a18\5\u00c4c\2\u0a18\u0a19\7\5\2\2\u0a19\u0a3f\3\2\2\2"+
		"\u0a1a\u0a1b\t\32\2\2\u0a1b\u0a1c\7\4\2\2\u0a1c\u0a1d\5\u00c4c\2\u0a1d"+
		"\u0a1e\t\33\2\2\u0a1e\u0a21\5\u00c4c\2\u0a1f\u0a20\t\34\2\2\u0a20\u0a22"+
		"\5\u00c4c\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a23\3\2\2"+
		"\2\u0a23\u0a24\7\5\2\2\u0a24\u0a3f\3\2\2\2\u0a25\u0a26\7\u00f2\2\2\u0a26"+
		"\u0a28\7\4\2\2\u0a27\u0a29\t\35\2\2\u0a28\u0a27\3\2\2\2\u0a28\u0a29\3"+
		"\2\2\2\u0a29\u0a2b\3\2\2\2\u0a2a\u0a2c\5\u00c4c\2\u0a2b\u0a2a\3\2\2\2"+
		"\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a2e\7f\2\2\u0a2e\u0a2f"+
		"\5\u00c4c\2\u0a2f\u0a30\7\5\2\2\u0a30\u0a3f\3\2\2\2\u0a31\u0a32\7\u00aa"+
		"\2\2\u0a32\u0a33\7\4\2\2\u0a33\u0a34\5\u00c4c\2\u0a34\u0a35\7\u00b1\2"+
		"\2\u0a35\u0a36\5\u00c4c\2\u0a36\u0a37\7f\2\2\u0a37\u0a3a\5\u00c4c\2\u0a38"+
		"\u0a39\7b\2\2\u0a39\u0a3b\5\u00c4c\2\u0a3a\u0a38\3\2\2\2\u0a3a\u0a3b\3"+
		"\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3d\7\5\2\2\u0a3d\u0a3f\3\2\2\2\u0a3e"+
		"\u0986\3\2\2\2\u0a3e\u0988\3\2\2\2\u0a3e\u0994\3\2\2\2\u0a3e\u09a1\3\2"+
		"\2\2\u0a3e\u09a8\3\2\2\2\u0a3e\u09b5\3\2\2\2\u0a3e\u09be\3\2\2\2\u0a3e"+
		"\u09c7\3\2\2\2\u0a3e\u09ce\3\2\2\2\u0a3e\u09cf\3\2\2\2\u0a3e\u09d0\3\2"+
		"\2\2\u0a3e\u09d4\3\2\2\2\u0a3e\u09de\3\2\2\2\u0a3e\u09e2\3\2\2\2\u0a3e"+
		"\u09fe\3\2\2\2\u0a3e\u0a02\3\2\2\2\u0a3e\u0a0e\3\2\2\2\u0a3e\u0a0f\3\2"+
		"\2\2\u0a3e\u0a13\3\2\2\2\u0a3e\u0a1a\3\2\2\2\u0a3e\u0a25\3\2\2\2\u0a3e"+
		"\u0a31\3\2\2\2\u0a3f\u0a4a\3\2\2\2\u0a40\u0a41\f\n\2\2\u0a41\u0a42\7\13"+
		"\2\2\u0a42\u0a43\5\u00c4c\2\u0a43\u0a44\7\f\2\2\u0a44\u0a49\3\2\2\2\u0a45"+
		"\u0a46\f\b\2\2\u0a46\u0a47\7\7\2\2\u0a47\u0a49\5\u0106\u0084\2\u0a48\u0a40"+
		"\3\2\2\2\u0a48\u0a45\3\2\2\2\u0a49\u0a4c\3\2\2\2\u0a4a\u0a48\3\2\2\2\u0a4a"+
		"\u0a4b\3\2\2\2\u0a4b\u00c7\3\2\2\2\u0a4c\u0a4a\3\2\2\2\u0a4d\u0a5a\7\u009c"+
		"\2\2\u0a4e\u0a5a\5\u00d2j\2\u0a4f\u0a50\5\u0106\u0084\2\u0a50\u0a51\7"+
		"\u011d\2\2\u0a51\u0a5a\3\2\2\2\u0a52\u0a5a\5\u010c\u0087\2\u0a53\u0a5a"+
		"\5\u00d0i\2\u0a54\u0a56\7\u011d\2\2\u0a55\u0a54\3\2\2\2\u0a56\u0a57\3"+
		"\2\2\2\u0a57\u0a55\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58\u0a5a\3\2\2\2\u0a59"+
		"\u0a4d\3\2\2\2\u0a59\u0a4e\3\2\2\2\u0a59\u0a4f\3\2\2\2\u0a59\u0a52\3\2"+
		"\2\2\u0a59\u0a53\3\2\2\2\u0a59\u0a55\3\2\2\2\u0a5a\u00c9\3\2\2\2\u0a5b"+
		"\u0a5c\t\36\2\2\u0a5c\u00cb\3\2\2\2\u0a5d\u0a5e\t\37\2\2\u0a5e\u00cd\3"+
		"\2\2\2\u0a5f\u0a60\t \2\2\u0a60\u00cf\3\2\2\2\u0a61\u0a62\t!\2\2\u0a62"+
		"\u00d1\3\2\2\2\u0a63\u0a66\7{\2\2\u0a64\u0a67\5\u00d4k\2\u0a65\u0a67\5"+
		"\u00d8m\2\u0a66\u0a64\3\2\2\2\u0a66\u0a65\3\2\2\2\u0a66\u0a67\3\2\2\2"+
		"\u0a67\u00d3\3\2\2\2\u0a68\u0a6a\5\u00d6l\2\u0a69\u0a6b\5\u00dan\2\u0a6a"+
		"\u0a69\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u00d5\3\2\2\2\u0a6c\u0a6d\5\u00dc"+
		"o\2\u0a6d\u0a6e\5\u00dep\2\u0a6e\u0a70\3\2\2\2\u0a6f\u0a6c\3\2\2\2\u0a70"+
		"\u0a71\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u00d7\3\2"+
		"\2\2\u0a73\u0a76\5\u00dan\2\u0a74\u0a77\5\u00d6l\2\u0a75\u0a77\5\u00da"+
		"n\2\u0a76\u0a74\3\2\2\2\u0a76\u0a75\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77"+
		"\u00d9\3\2\2\2\u0a78\u0a79\5\u00dco\2\u0a79\u0a7a\5\u00dep\2\u0a7a\u0a7b"+
		"\7\u00ec\2\2\u0a7b\u0a7c\5\u00dep\2\u0a7c\u00db\3\2\2\2\u0a7d\u0a7f\t"+
		"\"\2\2\u0a7e\u0a7d\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80"+
		"\u0a83\t\24\2\2\u0a81\u0a83\7\u011d\2\2\u0a82\u0a7e\3\2\2\2\u0a82\u0a81"+
		"\3\2\2\2\u0a83\u00dd\3\2\2\2\u0a84\u0a8c\7B\2\2\u0a85\u0a8c\7o\2\2\u0a86"+
		"\u0a8c\7\u0094\2\2\u0a87\u0a8c\7\u0095\2\2\u0a88\u0a8c\7\u00cf\2\2\u0a89"+
		"\u0a8c\7\u0109\2\2\u0a8a\u0a8c\5\u0106\u0084\2\u0a8b\u0a84\3\2\2\2\u0a8b"+
		"\u0a85\3\2\2\2\u0a8b\u0a86\3\2\2\2\u0a8b\u0a87\3\2\2\2\u0a8b\u0a88\3\2"+
		"\2\2\u0a8b\u0a89\3\2\2\2\u0a8b\u0a8a\3\2\2\2\u0a8c\u00df\3\2\2\2\u0a8d"+
		"\u0a91\7`\2\2\u0a8e\u0a8f\7\17\2\2\u0a8f\u0a91\5\u0102\u0082\2\u0a90\u0a8d"+
		"\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a91\u00e1\3\2\2\2\u0a92\u0a93\7\27\2\2"+
		"\u0a93\u0a94\7\u010e\2\2\u0a94\u0a95\5\u00e2r\2\u0a95\u0a96\7\u0110\2"+
		"\2\u0a96\u0ab5\3\2\2\2\u0a97\u0a98\7\u0091\2\2\u0a98\u0a99\7\u010e\2\2"+
		"\u0a99\u0a9a\5\u00e2r\2\u0a9a\u0a9b\7\6\2\2\u0a9b\u0a9c\5\u00e2r\2\u0a9c"+
		"\u0a9d\7\u0110\2\2\u0a9d\u0ab5\3\2\2\2\u0a9e\u0aa5\7\u00e2\2\2\u0a9f\u0aa1"+
		"\7\u010e\2\2\u0aa0\u0aa2\5\u00ecw\2\u0aa1\u0aa0\3\2\2\2\u0aa1\u0aa2\3"+
		"\2\2\2\u0aa2\u0aa3\3\2\2\2\u0aa3\u0aa6\7\u0110\2\2\u0aa4\u0aa6\7\u010c"+
		"\2\2\u0aa5\u0a9f\3\2\2\2\u0aa5\u0aa4\3\2\2\2\u0aa6\u0ab5\3\2\2\2\u0aa7"+
		"\u0ab2\5\u0106\u0084\2\u0aa8\u0aa9\7\4\2\2\u0aa9\u0aae\7\u0121\2\2\u0aaa"+
		"\u0aab\7\6\2\2\u0aab\u0aad\7\u0121\2\2\u0aac\u0aaa\3\2\2\2\u0aad\u0ab0"+
		"\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0ab1\3\2\2\2\u0ab0"+
		"\u0aae\3\2\2\2\u0ab1\u0ab3\7\5\2\2\u0ab2\u0aa8\3\2\2\2\u0ab2\u0ab3\3\2"+
		"\2\2\u0ab3\u0ab5\3\2\2\2\u0ab4\u0a92\3\2\2\2\u0ab4\u0a97\3\2\2\2\u0ab4"+
		"\u0a9e\3\2\2\2\u0ab4\u0aa7\3\2\2\2\u0ab5\u00e3\3\2\2\2\u0ab6\u0abb\5\u00e6"+
		"t\2\u0ab7\u0ab8\7\6\2\2\u0ab8\u0aba\5\u00e6t\2\u0ab9\u0ab7\3\2\2\2\u0aba"+
		"\u0abd\3\2\2\2\u0abb\u0ab9\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u00e5\3\2"+
		"\2\2\u0abd\u0abb\3\2\2\2\u0abe\u0abf\5\u00aeX\2\u0abf\u0ac2\5\u00e2r\2"+
		"\u0ac0\u0ac1\7\u009b\2\2\u0ac1\u0ac3\7\u009c\2\2\u0ac2\u0ac0\3\2\2\2\u0ac2"+
		"\u0ac3\3\2\2\2\u0ac3\u0ac5\3\2\2\2\u0ac4\u0ac6\5 \21\2\u0ac5\u0ac4\3\2"+
		"\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0ac8\3\2\2\2\u0ac7\u0ac9\5\u00e0q\2\u0ac8"+
		"\u0ac7\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u00e7\3\2\2\2\u0aca\u0acf\5\u00ea"+
		"v\2\u0acb\u0acc\7\6\2\2\u0acc\u0ace\5\u00eav\2\u0acd\u0acb\3\2\2\2\u0ace"+
		"\u0ad1\3\2\2\2\u0acf\u0acd\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0\u00e9\3\2"+
		"\2\2\u0ad1\u0acf\3\2\2\2\u0ad2\u0ad3\5\u0102\u0082\2\u0ad3\u0ad6\5\u00e2"+
		"r\2\u0ad4\u0ad5\7\u009b\2\2\u0ad5\u0ad7\7\u009c\2\2\u0ad6\u0ad4\3\2\2"+
		"\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ad9\3\2\2\2\u0ad8\u0ada\5 \21\2\u0ad9\u0ad8"+
		"\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u00eb\3\2\2\2\u0adb\u0ae0\5\u00eex"+
		"\2\u0adc\u0add\7\6\2\2\u0add\u0adf\5\u00eex\2\u0ade\u0adc\3\2\2\2\u0adf"+
		"\u0ae2\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u00ed\3\2"+
		"\2\2\u0ae2\u0ae0\3\2\2\2\u0ae3\u0ae4\5\u0106\u0084\2\u0ae4\u0ae5\7\r\2"+
		"\2\u0ae5\u0ae8\5\u00e2r\2\u0ae6\u0ae7\7\u009b\2\2\u0ae7\u0ae9\7\u009c"+
		"\2\2\u0ae8\u0ae6\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0aeb\3\2\2\2\u0aea"+
		"\u0aec\5 \21\2\u0aeb\u0aea\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u00ef\3\2"+
		"\2\2\u0aed\u0aee\7\u0105\2\2\u0aee\u0aef\5\u00be`\2\u0aef\u0af0\7\u00eb"+
		"\2\2\u0af0\u0af1\5\u00be`\2\u0af1\u00f1\3\2\2\2\u0af2\u0af3\7\u0107\2"+
		"\2\u0af3\u0af8\5\u00f4{\2\u0af4\u0af5\7\6\2\2\u0af5\u0af7\5\u00f4{\2\u0af6"+
		"\u0af4\3\2\2\2\u0af7\u0afa\3\2\2\2\u0af8\u0af6\3\2\2\2\u0af8\u0af9\3\2"+
		"\2\2\u0af9\u00f3\3\2\2\2\u0afa\u0af8\3\2\2\2\u0afb\u0afc\5\u0102\u0082"+
		"\2\u0afc\u0afd\7\30\2\2\u0afd\u0afe\5\u00f6|\2\u0afe\u00f5\3\2\2\2\u0aff"+
		"\u0b2e\5\u0102\u0082\2\u0b00\u0b01\7\4\2\2\u0b01\u0b02\5\u0102\u0082\2"+
		"\u0b02\u0b03\7\5\2\2\u0b03\u0b2e\3\2\2\2\u0b04\u0b27\7\4\2\2\u0b05\u0b06"+
		"\7(\2\2\u0b06\u0b07\7 \2\2\u0b07\u0b0c\5\u00be`\2\u0b08\u0b09\7\6\2\2"+
		"\u0b09\u0b0b\5\u00be`\2\u0b0a\u0b08\3\2\2\2\u0b0b\u0b0e\3\2\2\2\u0b0c"+
		"\u0b0a\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b28\3\2\2\2\u0b0e\u0b0c\3\2"+
		"\2\2\u0b0f\u0b10\t#\2\2\u0b10\u0b11\7 \2\2\u0b11\u0b16\5\u00be`\2\u0b12"+
		"\u0b13\7\6\2\2\u0b13\u0b15\5\u00be`\2\u0b14\u0b12\3\2\2\2\u0b15\u0b18"+
		"\3\2\2\2\u0b16\u0b14\3\2\2\2\u0b16\u0b17\3\2\2\2\u0b17\u0b1a\3\2\2\2\u0b18"+
		"\u0b16\3\2\2\2\u0b19\u0b0f\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b25\3\2"+
		"\2\2\u0b1b\u0b1c\t$\2\2\u0b1c\u0b1d\7 \2\2\u0b1d\u0b22\5X-\2\u0b1e\u0b1f"+
		"\7\6\2\2\u0b1f\u0b21\5X-\2\u0b20\u0b1e\3\2\2\2\u0b21\u0b24\3\2\2\2\u0b22"+
		"\u0b20\3\2\2\2\u0b22\u0b23\3\2\2\2\u0b23\u0b26\3\2\2\2\u0b24\u0b22\3\2"+
		"\2\2\u0b25\u0b1b\3\2\2\2\u0b25\u0b26\3\2\2\2\u0b26\u0b28\3\2\2\2\u0b27"+
		"\u0b05\3\2\2\2\u0b27\u0b19\3\2\2\2\u0b28\u0b2a\3\2\2\2\u0b29\u0b2b\5\u00f8"+
		"}\2\u0b2a\u0b29\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c"+
		"\u0b2e\7\5\2\2\u0b2d\u0aff\3\2\2\2\u0b2d\u0b00\3\2\2\2\u0b2d\u0b04\3\2"+
		"\2\2\u0b2e\u00f7\3\2\2\2\u0b2f\u0b30\7\u00b9\2\2\u0b30\u0b40\5\u00fa~"+
		"\2\u0b31\u0b32\7\u00cd\2\2\u0b32\u0b40\5\u00fa~\2\u0b33\u0b34\7\u00b9"+
		"\2\2\u0b34\u0b35\7\34\2\2\u0b35\u0b36\5\u00fa~\2\u0b36\u0b37\7\23\2\2"+
		"\u0b37\u0b38\5\u00fa~\2\u0b38\u0b40\3\2\2\2\u0b39\u0b3a\7\u00cd\2\2\u0b3a"+
		"\u0b3b\7\34\2\2\u0b3b\u0b3c\5\u00fa~\2\u0b3c\u0b3d\7\23\2\2\u0b3d\u0b3e"+
		"\5\u00fa~\2\u0b3e\u0b40\3\2\2\2\u0b3f\u0b2f\3\2\2\2\u0b3f\u0b31\3\2\2"+
		"\2\u0b3f\u0b33\3\2\2\2\u0b3f\u0b39\3\2\2\2\u0b40\u00f9\3\2\2\2\u0b41\u0b42"+
		"\7\u00f7\2\2\u0b42\u0b49\t%\2\2\u0b43\u0b44\7:\2\2\u0b44\u0b49\7\u00cc"+
		"\2\2\u0b45\u0b46\5\u00be`\2\u0b46\u0b47\t%\2\2\u0b47\u0b49\3\2\2\2\u0b48"+
		"\u0b41\3\2\2\2\u0b48\u0b43\3\2\2\2\u0b48\u0b45\3\2\2\2\u0b49\u00fb\3\2"+
		"\2\2\u0b4a\u0b4f\5\u0100\u0081\2\u0b4b\u0b4c\7\6\2\2\u0b4c\u0b4e\5\u0100"+
		"\u0081\2\u0b4d\u0b4b\3\2\2\2\u0b4e\u0b51\3\2\2\2\u0b4f\u0b4d\3\2\2\2\u0b4f"+
		"\u0b50\3\2\2\2\u0b50\u00fd\3\2\2\2\u0b51\u0b4f\3\2\2\2\u0b52\u0b57\5\u0100"+
		"\u0081\2\u0b53\u0b57\7^\2\2\u0b54\u0b57\7\u0085\2\2\u0b55\u0b57\7\u00c6"+
		"\2\2\u0b56\u0b52\3\2\2\2\u0b56\u0b53\3\2\2\2\u0b56\u0b54\3\2\2\2\u0b56"+
		"\u0b55\3\2\2\2\u0b57\u00ff\3\2\2\2\u0b58\u0b5d\5\u0106\u0084\2\u0b59\u0b5a"+
		"\7\7\2\2\u0b5a\u0b5c\5\u0106\u0084\2\u0b5b\u0b59\3\2\2\2\u0b5c\u0b5f\3"+
		"\2\2\2\u0b5d\u0b5b\3\2\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e\u0101\3\2\2\2\u0b5f"+
		"\u0b5d\3\2\2\2\u0b60\u0b61\5\u0106\u0084\2\u0b61\u0b62\5\u0104\u0083\2"+
		"\u0b62\u0103\3\2\2\2\u0b63\u0b64\7\u0113\2\2\u0b64\u0b66\5\u0106\u0084"+
		"\2\u0b65\u0b63\3\2\2\2\u0b66\u0b67\3\2\2\2\u0b67\u0b65\3\2\2\2\u0b67\u0b68"+
		"\3\2\2\2\u0b68\u0b6b\3\2\2\2\u0b69\u0b6b\3\2\2\2\u0b6a\u0b65\3\2\2\2\u0b6a"+
		"\u0b69\3\2\2\2\u0b6b\u0105\3\2\2\2\u0b6c\u0b70\5\u0108\u0085\2\u0b6d\u0b6e"+
		"\6\u0084\22\2\u0b6e\u0b70\5\u0112\u008a\2\u0b6f\u0b6c\3\2\2\2\u0b6f\u0b6d"+
		"\3\2\2\2\u0b70\u0107\3\2\2\2\u0b71\u0b78\7\u0126\2\2\u0b72\u0b78\5\u010a"+
		"\u0086\2\u0b73\u0b74\6\u0085\23\2\u0b74\u0b78\5\u0110\u0089\2\u0b75\u0b76"+
		"\6\u0085\24\2\u0b76\u0b78\5\u0114\u008b\2\u0b77\u0b71\3\2\2\2\u0b77\u0b72"+
		"\3\2\2\2\u0b77\u0b73\3\2\2\2\u0b77\u0b75\3\2\2\2\u0b78\u0109\3\2\2\2\u0b79"+
		"\u0b7a\7\u0127\2\2\u0b7a\u010b\3\2\2\2\u0b7b\u0b7d\6\u0087\25\2\u0b7c"+
		"\u0b7e\7\u0113\2\2\u0b7d\u0b7c\3\2\2\2\u0b7d\u0b7e\3\2\2\2\u0b7e\u0b7f"+
		"\3\2\2\2\u0b7f\u0ba3\7\u0122\2\2\u0b80\u0b82\6\u0087\26\2\u0b81\u0b83"+
		"\7\u0113\2\2\u0b82\u0b81\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0b84\3\2\2"+
		"\2\u0b84\u0ba3\7\u0123\2\2\u0b85\u0b87\6\u0087\27\2\u0b86\u0b88\7\u0113"+
		"\2\2\u0b87\u0b86\3\2\2\2\u0b87\u0b88\3\2\2\2\u0b88\u0b89\3\2\2\2\u0b89"+
		"\u0ba3\t&\2\2\u0b8a\u0b8c\7\u0113\2\2\u0b8b\u0b8a\3\2\2\2\u0b8b\u0b8c"+
		"\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u0ba3\7\u0121\2\2\u0b8e\u0b90\7\u0113"+
		"\2\2\u0b8f\u0b8e\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0b91\3\2\2\2\u0b91"+
		"\u0ba3\7\u011e\2\2\u0b92\u0b94\7\u0113\2\2\u0b93\u0b92\3\2\2\2\u0b93\u0b94"+
		"\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95\u0ba3\7\u011f\2\2\u0b96\u0b98\7\u0113"+
		"\2\2\u0b97\u0b96\3\2\2\2\u0b97\u0b98\3\2\2\2\u0b98\u0b99\3\2\2\2\u0b99"+
		"\u0ba3\7\u0120\2\2\u0b9a\u0b9c\7\u0113\2\2\u0b9b\u0b9a\3\2\2\2\u0b9b\u0b9c"+
		"\3\2\2\2\u0b9c\u0b9d\3\2\2\2\u0b9d\u0ba3\7\u0124\2\2\u0b9e\u0ba0\7\u0113"+
		"\2\2\u0b9f\u0b9e\3\2\2\2\u0b9f\u0ba0\3\2\2\2\u0ba0\u0ba1\3\2\2\2\u0ba1"+
		"\u0ba3\7\u0125\2\2\u0ba2\u0b7b\3\2\2\2\u0ba2\u0b80\3\2\2\2\u0ba2\u0b85"+
		"\3\2\2\2\u0ba2\u0b8b\3\2\2\2\u0ba2\u0b8f\3\2\2\2\u0ba2\u0b93\3\2\2\2\u0ba2"+
		"\u0b97\3\2\2\2\u0ba2\u0b9b\3\2\2\2\u0ba2\u0b9f\3\2\2\2\u0ba3\u010d\3\2"+
		"\2\2\u0ba4\u0ba5\7\u00f5\2\2\u0ba5\u0bac\5\u00e2r\2\u0ba6\u0bac\5 \21"+
		"\2\u0ba7\u0bac\5\u00e0q\2\u0ba8\u0ba9\t\'\2\2\u0ba9\u0baa\7\u009b\2\2"+
		"\u0baa\u0bac\7\u009c\2\2\u0bab\u0ba4\3\2\2\2\u0bab\u0ba6\3\2\2\2\u0bab"+
		"\u0ba7\3\2\2\2\u0bab\u0ba8\3\2\2\2\u0bac\u010f\3\2\2\2\u0bad\u0bae\t("+
		"\2\2\u0bae\u0111\3\2\2\2\u0baf\u0bb0\t)\2\2\u0bb0\u0113\3\2\2\2\u0bb1"+
		"\u0bb2\t*\2\2\u0bb2\u0115\3\2\2\2\u018a\u0119\u0124\u012b\u0132\u0139"+
		"\u0140\u0147\u014c\u0151\u0159\u0161\u0163\u0177\u017b\u0181\u0184\u0187"+
		"\u018e\u0193\u0196\u019d\u01a9\u01b2\u01b4\u01b8\u01bb\u01c2\u01cd\u01cf"+
		"\u01d7\u01dc\u01df\u01e5\u01f0\u0230\u0239\u023d\u0243\u0247\u024c\u0252"+
		"\u025a\u0260\u026d\u0272\u0282\u0289\u028d\u0293\u02a2\u02a6\u02ac\u02b2"+
		"\u02b5\u02b8\u02be\u02c2\u02ca\u02cc\u02d5\u02d8\u02e1\u02e6\u02ec\u02f3"+
		"\u02f6\u02fc\u0307\u030a\u030e\u0313\u0318\u031f\u0322\u0325\u032c\u0331"+
		"\u033a\u0342\u0348\u034b\u034e\u0354\u0358\u035c\u0360\u0362\u036a\u0372"+
		"\u0378\u037e\u0381\u0385\u0388\u038c\u03a5\u03a8\u03ac\u03b2\u03b5\u03b8"+
		"\u03be\u03c6\u03cb\u03d1\u03d7\u03e3\u03e6\u03ed\u03f4\u03fc\u03ff\u0407"+
		"\u040b\u0412\u0486\u048e\u0496\u049f\u04a9\u04ad\u04b0\u04b6\u04bc\u04c8"+
		"\u04d4\u04d9\u04e2\u04ea\u04f1\u04f3\u04f8\u04fc\u0501\u0506\u050b\u050e"+
		"\u0513\u0517\u051c\u051e\u0522\u052b\u0533\u053c\u0543\u054c\u0551\u0554"+
		"\u0567\u0569\u0572\u0579\u057c\u0583\u0587\u058d\u0595\u05a0\u05ab\u05b2"+
		"\u05b8\u05c5\u05cc\u05d3\u05df\u05e7\u05ed\u05f0\u05f9\u05fc\u0605\u0608"+
		"\u0611\u0614\u061d\u0620\u0623\u0628\u062a\u0636\u063d\u0644\u0647\u0649"+
		"\u0655\u0659\u065d\u0663\u0667\u066f\u0673\u0676\u0679\u067c\u0680\u0684"+
		"\u0687\u068b\u0690\u0694\u0697\u069a\u069d\u069f\u06ab\u06ae\u06b2\u06bc"+
		"\u06c0\u06c2\u06c5\u06c9\u06cf\u06d3\u06de\u06e8\u06f4\u0703\u0708\u070f"+
		"\u071f\u0724\u0731\u0736\u073e\u0744\u0748\u0751\u0760\u0765\u0771\u0776"+
		"\u077e\u0781\u0785\u0793\u07a0\u07a5\u07a9\u07ac\u07b1\u07ba\u07bd\u07c2"+
		"\u07c9\u07cc\u07d4\u07db\u07e2\u07e5\u07ea\u07ed\u07f2\u07f6\u07f9\u07fc"+
		"\u0802\u0807\u080c\u081e\u0820\u0823\u082e\u0837\u083e\u0846\u084d\u0851"+
		"\u0859\u0861\u0867\u086f\u087b\u087e\u0884\u0888\u088a\u0893\u089f\u08a1"+
		"\u08a8\u08af\u08b5\u08bb\u08bd\u08c4\u08cc\u08d2\u08d9\u08df\u08e3\u08e5"+
		"\u08ec\u08f5\u0902\u0907\u090b\u0919\u091b\u0923\u0925\u0929\u0931\u093a"+
		"\u0940\u0948\u094d\u0953\u0957\u095c\u0961\u0966\u096c\u0981\u0983\u098c"+
		"\u0990\u0999\u099d\u09af\u09b2\u09ba\u09c3\u09da\u09e5\u09ec\u09ef\u09f8"+
		"\u09fc\u0a08\u0a21\u0a28\u0a2b\u0a3a\u0a3e\u0a48\u0a4a\u0a57\u0a59\u0a66"+
		"\u0a6a\u0a71\u0a76\u0a7e\u0a82\u0a8b\u0a90\u0aa1\u0aa5\u0aae\u0ab2\u0ab4"+
		"\u0abb\u0ac2\u0ac5\u0ac8\u0acf\u0ad6\u0ad9\u0ae0\u0ae8\u0aeb\u0af8\u0b0c"+
		"\u0b16\u0b19\u0b22\u0b25\u0b27\u0b2a\u0b2d\u0b3f\u0b48\u0b4f\u0b56\u0b5d"+
		"\u0b67\u0b6a\u0b6f\u0b77\u0b7d\u0b82\u0b87\u0b8b\u0b8f\u0b93\u0b97\u0b9b"+
		"\u0b9f\u0ba2\u0bab";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}