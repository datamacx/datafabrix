// Generated from /Users/bipulkumar/Code/learn_workspace/datafabrix/splsql/src/main/scala/com/datamacx/datafabrix/antlr4/splsql/SparkPlSql.g4 by ANTLR 4.9.2
package com.datamacx.datafabrix.antlr4.splsql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkPlSqlParser}.
 */
public interface SparkPlSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#multipleStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatement(SparkPlSqlParser.MultipleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#multipleStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatement(SparkPlSqlParser.MultipleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SparkPlSqlParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SparkPlSqlParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(SparkPlSqlParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(SparkPlSqlParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(SparkPlSqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(SparkPlSqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleMultipartIdentifier(SparkPlSqlParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleMultipartIdentifier(SparkPlSqlParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(SparkPlSqlParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(SparkPlSqlParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(SparkPlSqlParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(SparkPlSqlParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(SparkPlSqlParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(SparkPlSqlParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(SparkPlSqlParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(SparkPlSqlParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(SparkPlSqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(SparkPlSqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(SparkPlSqlParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(SparkPlSqlParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateNamespace(SparkPlSqlParser.CreateNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateNamespace(SparkPlSqlParser.CreateNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceProperties(SparkPlSqlParser.SetNamespacePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceProperties(SparkPlSqlParser.SetNamespacePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceLocation(SparkPlSqlParser.SetNamespaceLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceLocation(SparkPlSqlParser.SetNamespaceLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropNamespace(SparkPlSqlParser.DropNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropNamespace(SparkPlSqlParser.DropNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowNamespaces(SparkPlSqlParser.ShowNamespacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowNamespaces(SparkPlSqlParser.ShowNamespacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SparkPlSqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SparkPlSqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(SparkPlSqlParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(SparkPlSqlParser.CreateHiveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(SparkPlSqlParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(SparkPlSqlParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTable(SparkPlSqlParser.ReplaceTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTable(SparkPlSqlParser.ReplaceTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(SparkPlSqlParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(SparkPlSqlParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(SparkPlSqlParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(SparkPlSqlParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableColumn(SparkPlSqlParser.RenameTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableColumn(SparkPlSqlParser.RenameTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableColumns(SparkPlSqlParser.DropTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableColumns(SparkPlSqlParser.DropTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SparkPlSqlParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SparkPlSqlParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(SparkPlSqlParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(SparkPlSqlParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(SparkPlSqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(SparkPlSqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAlterColumn(SparkPlSqlParser.AlterTableAlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAlterColumn(SparkPlSqlParser.AlterTableAlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveChangeColumn(SparkPlSqlParser.HiveChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveChangeColumn(SparkPlSqlParser.HiveChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(SparkPlSqlParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(SparkPlSqlParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(SparkPlSqlParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(SparkPlSqlParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(SparkPlSqlParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(SparkPlSqlParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(SparkPlSqlParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(SparkPlSqlParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(SparkPlSqlParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(SparkPlSqlParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(SparkPlSqlParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(SparkPlSqlParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SparkPlSqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SparkPlSqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SparkPlSqlParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SparkPlSqlParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SparkPlSqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SparkPlSqlParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(SparkPlSqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(SparkPlSqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(SparkPlSqlParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(SparkPlSqlParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SparkPlSqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SparkPlSqlParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SparkPlSqlParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SparkPlSqlParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SparkPlSqlParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SparkPlSqlParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(SparkPlSqlParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(SparkPlSqlParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(SparkPlSqlParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(SparkPlSqlParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(SparkPlSqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(SparkPlSqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SparkPlSqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SparkPlSqlParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowViews(SparkPlSqlParser.ShowViewsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowViews(SparkPlSqlParser.ShowViewsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(SparkPlSqlParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(SparkPlSqlParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(SparkPlSqlParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(SparkPlSqlParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(SparkPlSqlParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(SparkPlSqlParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCurrentNamespace(SparkPlSqlParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCurrentNamespace(SparkPlSqlParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(SparkPlSqlParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(SparkPlSqlParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeNamespace(SparkPlSqlParser.DescribeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeNamespace(SparkPlSqlParser.DescribeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeRelation(SparkPlSqlParser.DescribeRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeRelation(SparkPlSqlParser.DescribeRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(SparkPlSqlParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(SparkPlSqlParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentNamespace(SparkPlSqlParser.CommentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentNamespace(SparkPlSqlParser.CommentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(SparkPlSqlParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(SparkPlSqlParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(SparkPlSqlParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(SparkPlSqlParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(SparkPlSqlParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(SparkPlSqlParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(SparkPlSqlParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(SparkPlSqlParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(SparkPlSqlParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(SparkPlSqlParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(SparkPlSqlParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(SparkPlSqlParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(SparkPlSqlParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(SparkPlSqlParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SparkPlSqlParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SparkPlSqlParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(SparkPlSqlParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(SparkPlSqlParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(SparkPlSqlParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(SparkPlSqlParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(SparkPlSqlParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(SparkPlSqlParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(SparkPlSqlParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(SparkPlSqlParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(SparkPlSqlParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(SparkPlSqlParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(SparkPlSqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(SparkPlSqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(SparkPlSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(SparkPlSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(SparkPlSqlParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(SparkPlSqlParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(SparkPlSqlParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(SparkPlSqlParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(SparkPlSqlParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(SparkPlSqlParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(SparkPlSqlParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(SparkPlSqlParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(SparkPlSqlParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(SparkPlSqlParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SparkPlSqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SparkPlSqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(SparkPlSqlParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(SparkPlSqlParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(SparkPlSqlParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(SparkPlSqlParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(SparkPlSqlParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(SparkPlSqlParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(SparkPlSqlParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(SparkPlSqlParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(SparkPlSqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(SparkPlSqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(SparkPlSqlParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(SparkPlSqlParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(SparkPlSqlParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(SparkPlSqlParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(SparkPlSqlParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(SparkPlSqlParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(SparkPlSqlParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(SparkPlSqlParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(SparkPlSqlParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(SparkPlSqlParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(SparkPlSqlParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(SparkPlSqlParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(SparkPlSqlParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(SparkPlSqlParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(SparkPlSqlParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(SparkPlSqlParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(SparkPlSqlParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(SparkPlSqlParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(SparkPlSqlParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(SparkPlSqlParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(SparkPlSqlParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(SparkPlSqlParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(SparkPlSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(SparkPlSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(SparkPlSqlParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(SparkPlSqlParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(SparkPlSqlParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(SparkPlSqlParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(SparkPlSqlParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(SparkPlSqlParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(SparkPlSqlParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(SparkPlSqlParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkPlSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(SparkPlSqlParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkPlSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(SparkPlSqlParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkPlSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(SparkPlSqlParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkPlSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(SparkPlSqlParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(SparkPlSqlParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(SparkPlSqlParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SparkPlSqlParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SparkPlSqlParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(SparkPlSqlParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(SparkPlSqlParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(SparkPlSqlParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(SparkPlSqlParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(SparkPlSqlParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(SparkPlSqlParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(SparkPlSqlParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(SparkPlSqlParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(SparkPlSqlParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(SparkPlSqlParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(SparkPlSqlParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(SparkPlSqlParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(SparkPlSqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(SparkPlSqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkPlSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(SparkPlSqlParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkPlSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(SparkPlSqlParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkPlSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(SparkPlSqlParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkPlSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(SparkPlSqlParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(SparkPlSqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(SparkPlSqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(SparkPlSqlParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(SparkPlSqlParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(SparkPlSqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(SparkPlSqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(SparkPlSqlParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(SparkPlSqlParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SparkPlSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SparkPlSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(SparkPlSqlParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(SparkPlSqlParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(SparkPlSqlParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(SparkPlSqlParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(SparkPlSqlParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(SparkPlSqlParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkPlSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterTransformQuerySpecification(SparkPlSqlParser.TransformQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkPlSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitTransformQuerySpecification(SparkPlSqlParser.TransformQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkPlSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(SparkPlSqlParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkPlSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(SparkPlSqlParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void enterTransformClause(SparkPlSqlParser.TransformClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void exitTransformClause(SparkPlSqlParser.TransformClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SparkPlSqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SparkPlSqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(SparkPlSqlParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(SparkPlSqlParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClause(SparkPlSqlParser.MatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClause(SparkPlSqlParser.MatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(SparkPlSqlParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(SparkPlSqlParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void enterMatchedAction(SparkPlSqlParser.MatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void exitMatchedAction(SparkPlSqlParser.MatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedAction(SparkPlSqlParser.NotMatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedAction(SparkPlSqlParser.NotMatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(SparkPlSqlParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(SparkPlSqlParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SparkPlSqlParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SparkPlSqlParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SparkPlSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SparkPlSqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SparkPlSqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SparkPlSqlParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(SparkPlSqlParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(SparkPlSqlParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(SparkPlSqlParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(SparkPlSqlParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SparkPlSqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SparkPlSqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(SparkPlSqlParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(SparkPlSqlParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(SparkPlSqlParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(SparkPlSqlParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(SparkPlSqlParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(SparkPlSqlParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(SparkPlSqlParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(SparkPlSqlParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(SparkPlSqlParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(SparkPlSqlParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(SparkPlSqlParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(SparkPlSqlParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(SparkPlSqlParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(SparkPlSqlParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(SparkPlSqlParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(SparkPlSqlParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(SparkPlSqlParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(SparkPlSqlParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SparkPlSqlParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SparkPlSqlParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(SparkPlSqlParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(SparkPlSqlParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(SparkPlSqlParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(SparkPlSqlParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(SparkPlSqlParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(SparkPlSqlParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(SparkPlSqlParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(SparkPlSqlParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(SparkPlSqlParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(SparkPlSqlParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(SparkPlSqlParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(SparkPlSqlParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SparkPlSqlParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SparkPlSqlParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(SparkPlSqlParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(SparkPlSqlParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(SparkPlSqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(SparkPlSqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(SparkPlSqlParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(SparkPlSqlParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(SparkPlSqlParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(SparkPlSqlParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(SparkPlSqlParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(SparkPlSqlParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SparkPlSqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SparkPlSqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(SparkPlSqlParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(SparkPlSqlParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(SparkPlSqlParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(SparkPlSqlParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(SparkPlSqlParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(SparkPlSqlParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(SparkPlSqlParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(SparkPlSqlParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(SparkPlSqlParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(SparkPlSqlParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(SparkPlSqlParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(SparkPlSqlParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(SparkPlSqlParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(SparkPlSqlParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkPlSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(SparkPlSqlParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkPlSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(SparkPlSqlParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkPlSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(SparkPlSqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkPlSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(SparkPlSqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierList(SparkPlSqlParser.MultipartIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierList(SparkPlSqlParser.MultipartIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(SparkPlSqlParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(SparkPlSqlParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(SparkPlSqlParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(SparkPlSqlParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(SparkPlSqlParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(SparkPlSqlParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(SparkPlSqlParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(SparkPlSqlParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(SparkPlSqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(SparkPlSqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#transformList}.
	 * @param ctx the parse tree
	 */
	void enterTransformList(SparkPlSqlParser.TransformListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#transformList}.
	 * @param ctx the parse tree
	 */
	void exitTransformList(SparkPlSqlParser.TransformListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkPlSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(SparkPlSqlParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkPlSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(SparkPlSqlParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkPlSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(SparkPlSqlParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkPlSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(SparkPlSqlParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(SparkPlSqlParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(SparkPlSqlParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SparkPlSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SparkPlSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SparkPlSqlParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SparkPlSqlParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SparkPlSqlParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SparkPlSqlParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(SparkPlSqlParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(SparkPlSqlParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SparkPlSqlParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SparkPlSqlParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SparkPlSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SparkPlSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SparkPlSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SparkPlSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SparkPlSqlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SparkPlSqlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SparkPlSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SparkPlSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SparkPlSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SparkPlSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(SparkPlSqlParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(SparkPlSqlParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SparkPlSqlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SparkPlSqlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SparkPlSqlParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SparkPlSqlParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SparkPlSqlParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SparkPlSqlParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(SparkPlSqlParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(SparkPlSqlParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(SparkPlSqlParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(SparkPlSqlParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(SparkPlSqlParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(SparkPlSqlParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(SparkPlSqlParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(SparkPlSqlParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SparkPlSqlParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SparkPlSqlParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(SparkPlSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(SparkPlSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(SparkPlSqlParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(SparkPlSqlParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDatetime(SparkPlSqlParser.CurrentDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDatetime(SparkPlSqlParser.CurrentDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(SparkPlSqlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(SparkPlSqlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(SparkPlSqlParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(SparkPlSqlParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SparkPlSqlParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SparkPlSqlParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SparkPlSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SparkPlSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(SparkPlSqlParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(SparkPlSqlParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(SparkPlSqlParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(SparkPlSqlParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SparkPlSqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SparkPlSqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(SparkPlSqlParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(SparkPlSqlParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SparkPlSqlParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SparkPlSqlParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(SparkPlSqlParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(SparkPlSqlParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SparkPlSqlParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SparkPlSqlParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(SparkPlSqlParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(SparkPlSqlParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SparkPlSqlParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SparkPlSqlParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SparkPlSqlParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SparkPlSqlParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SparkPlSqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SparkPlSqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SparkPlSqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SparkPlSqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SparkPlSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SparkPlSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(SparkPlSqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(SparkPlSqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(SparkPlSqlParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(SparkPlSqlParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SparkPlSqlParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SparkPlSqlParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(SparkPlSqlParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(SparkPlSqlParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(SparkPlSqlParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(SparkPlSqlParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(SparkPlSqlParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(SparkPlSqlParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(SparkPlSqlParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(SparkPlSqlParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(SparkPlSqlParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(SparkPlSqlParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(SparkPlSqlParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(SparkPlSqlParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(SparkPlSqlParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(SparkPlSqlParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(SparkPlSqlParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(SparkPlSqlParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkPlSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(SparkPlSqlParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkPlSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(SparkPlSqlParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkPlSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(SparkPlSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkPlSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(SparkPlSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPositionList(SparkPlSqlParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPositionList(SparkPlSqlParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPosition(SparkPlSqlParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPosition(SparkPlSqlParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(SparkPlSqlParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(SparkPlSqlParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(SparkPlSqlParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(SparkPlSqlParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(SparkPlSqlParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(SparkPlSqlParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(SparkPlSqlParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(SparkPlSqlParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SparkPlSqlParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SparkPlSqlParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(SparkPlSqlParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(SparkPlSqlParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(SparkPlSqlParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(SparkPlSqlParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkPlSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(SparkPlSqlParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkPlSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(SparkPlSqlParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkPlSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(SparkPlSqlParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkPlSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(SparkPlSqlParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(SparkPlSqlParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(SparkPlSqlParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(SparkPlSqlParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(SparkPlSqlParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(SparkPlSqlParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(SparkPlSqlParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SparkPlSqlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SparkPlSqlParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SparkPlSqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SparkPlSqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(SparkPlSqlParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(SparkPlSqlParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkPlSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(SparkPlSqlParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkPlSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(SparkPlSqlParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkPlSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(SparkPlSqlParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkPlSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(SparkPlSqlParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SparkPlSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SparkPlSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkPlSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SparkPlSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkPlSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SparkPlSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkPlSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SparkPlSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkPlSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SparkPlSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SparkPlSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SparkPlSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(SparkPlSqlParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(SparkPlSqlParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SparkPlSqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SparkPlSqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterLegacyDecimalLiteral(SparkPlSqlParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitLegacyDecimalLiteral(SparkPlSqlParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SparkPlSqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SparkPlSqlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(SparkPlSqlParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(SparkPlSqlParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(SparkPlSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(SparkPlSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(SparkPlSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(SparkPlSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SparkPlSqlParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SparkPlSqlParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(SparkPlSqlParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(SparkPlSqlParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAction(SparkPlSqlParser.AlterColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAction(SparkPlSqlParser.AlterColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(SparkPlSqlParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(SparkPlSqlParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(SparkPlSqlParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(SparkPlSqlParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkPlSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SparkPlSqlParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkPlSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SparkPlSqlParser.NonReservedContext ctx);
}