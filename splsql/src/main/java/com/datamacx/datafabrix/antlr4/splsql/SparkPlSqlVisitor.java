// Generated from /Users/bipulkumar/Code/learn_workspace/datafabrix/splsql/src/main/scala/com/datamacx/datafabrix/antlr4/splsql/SparkPlSql.g4 by ANTLR 4.9.2
package com.datamacx.datafabrix.antlr4.splsql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkPlSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkPlSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#multipleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatement(SparkPlSqlParser.MultipleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SparkPlSqlParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(SparkPlSqlParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(SparkPlSqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleMultipartIdentifier(SparkPlSqlParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFunctionIdentifier(SparkPlSqlParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(SparkPlSqlParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#singleTableSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableSchema(SparkPlSqlParser.SingleTableSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SparkPlSqlParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(SparkPlSqlParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SparkPlSqlParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNamespace(SparkPlSqlParser.CreateNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceProperties(SparkPlSqlParser.SetNamespacePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceLocation(SparkPlSqlParser.SetNamespaceLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropNamespace(SparkPlSqlParser.DropNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowNamespaces(SparkPlSqlParser.ShowNamespacesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SparkPlSqlParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateHiveTable(SparkPlSqlParser.CreateHiveTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(SparkPlSqlParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTable(SparkPlSqlParser.ReplaceTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(SparkPlSqlParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableColumns(SparkPlSqlParser.AddTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableColumn(SparkPlSqlParser.RenameTableColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableColumns(SparkPlSqlParser.DropTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SparkPlSqlParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(SparkPlSqlParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(SparkPlSqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAlterColumn(SparkPlSqlParser.AlterTableAlterColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiveChangeColumn(SparkPlSqlParser.HiveChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(SparkPlSqlParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(SparkPlSqlParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(SparkPlSqlParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(SparkPlSqlParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(SparkPlSqlParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverPartitions(SparkPlSqlParser.RecoverPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SparkPlSqlParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(SparkPlSqlParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SparkPlSqlParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(SparkPlSqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(SparkPlSqlParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SparkPlSqlParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SparkPlSqlParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SparkPlSqlParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(SparkPlSqlParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTable(SparkPlSqlParser.ShowTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(SparkPlSqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(SparkPlSqlParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowViews(SparkPlSqlParser.ShowViewsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(SparkPlSqlParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(SparkPlSqlParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(SparkPlSqlParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCurrentNamespace(SparkPlSqlParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(SparkPlSqlParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeNamespace(SparkPlSqlParser.DescribeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeRelation(SparkPlSqlParser.DescribeRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeQuery(SparkPlSqlParser.DescribeQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentNamespace(SparkPlSqlParser.CommentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTable(SparkPlSqlParser.CommentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(SparkPlSqlParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(SparkPlSqlParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(SparkPlSqlParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(SparkPlSqlParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(SparkPlSqlParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(SparkPlSqlParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SparkPlSqlParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(SparkPlSqlParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(SparkPlSqlParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(SparkPlSqlParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(SparkPlSqlParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkPlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(SparkPlSqlParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(SparkPlSqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(SparkPlSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTableHeader(SparkPlSqlParser.ReplaceTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(SparkPlSqlParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(SparkPlSqlParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(SparkPlSqlParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#commentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSpec(SparkPlSqlParser.CommentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SparkPlSqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteTable(SparkPlSqlParser.InsertOverwriteTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoTable(SparkPlSqlParser.InsertIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteHiveDir(SparkPlSqlParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkPlSqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteDir(SparkPlSqlParser.InsertOverwriteDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(SparkPlSqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(SparkPlSqlParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(SparkPlSqlParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(SparkPlSqlParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(SparkPlSqlParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(SparkPlSqlParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(SparkPlSqlParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(SparkPlSqlParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(SparkPlSqlParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#createTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableClauses(SparkPlSqlParser.CreateTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(SparkPlSqlParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(SparkPlSqlParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(SparkPlSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(SparkPlSqlParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(SparkPlSqlParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(SparkPlSqlParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(SparkPlSqlParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkPlSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(SparkPlSqlParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkPlSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(SparkPlSqlParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(SparkPlSqlParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SparkPlSqlParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(SparkPlSqlParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(SparkPlSqlParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFromTable(SparkPlSqlParser.DeleteFromTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateTable(SparkPlSqlParser.UpdateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkPlSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeIntoTable(SparkPlSqlParser.MergeIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(SparkPlSqlParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(SparkPlSqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkPlSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(SparkPlSqlParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkPlSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(SparkPlSqlParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(SparkPlSqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStmt(SparkPlSqlParser.FromStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SparkPlSqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(SparkPlSqlParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkPlSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SparkPlSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SparkPlSqlParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#fromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatement(SparkPlSqlParser.FromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#fromStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatementBody(SparkPlSqlParser.FromStatementBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkPlSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformQuerySpecification(SparkPlSqlParser.TransformQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkPlSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularQuerySpecification(SparkPlSqlParser.RegularQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#transformClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformClause(SparkPlSqlParser.TransformClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SparkPlSqlParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(SparkPlSqlParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#matchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedClause(SparkPlSqlParser.MatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#notMatchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedClause(SparkPlSqlParser.NotMatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#matchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedAction(SparkPlSqlParser.MatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#notMatchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedAction(SparkPlSqlParser.NotMatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(SparkPlSqlParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SparkPlSqlParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SparkPlSqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SparkPlSqlParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(SparkPlSqlParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(SparkPlSqlParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SparkPlSqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#aggregationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationClause(SparkPlSqlParser.AggregationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(SparkPlSqlParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#pivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotClause(SparkPlSqlParser.PivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#pivotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotColumn(SparkPlSqlParser.PivotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#pivotValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotValue(SparkPlSqlParser.PivotValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(SparkPlSqlParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SparkPlSqlParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(SparkPlSqlParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(SparkPlSqlParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SparkPlSqlParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(SparkPlSqlParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(SparkPlSqlParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByPercentile(SparkPlSqlParser.SampleByPercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByRows(SparkPlSqlParser.SampleByRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBucket(SparkPlSqlParser.SampleByBucketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkPlSqlParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBytes(SparkPlSqlParser.SampleByBytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SparkPlSqlParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(SparkPlSqlParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(SparkPlSqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(SparkPlSqlParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(SparkPlSqlParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(SparkPlSqlParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SparkPlSqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(SparkPlSqlParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(SparkPlSqlParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(SparkPlSqlParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkPlSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(SparkPlSqlParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(SparkPlSqlParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(SparkPlSqlParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(SparkPlSqlParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkPlSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(SparkPlSqlParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkPlSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(SparkPlSqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierList(SparkPlSqlParser.MultipartIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifier(SparkPlSqlParser.MultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(SparkPlSqlParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(SparkPlSqlParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(SparkPlSqlParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(SparkPlSqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#transformList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformList(SparkPlSqlParser.TransformListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkPlSqlParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityTransform(SparkPlSqlParser.IdentityTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkPlSqlParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyTransform(SparkPlSqlParser.ApplyTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#transformArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformArgument(SparkPlSqlParser.TransformArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparkPlSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SparkPlSqlParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SparkPlSqlParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SparkPlSqlParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkPlSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SparkPlSqlParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SparkPlSqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SparkPlSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SparkPlSqlParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SparkPlSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkPlSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SparkPlSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(SparkPlSqlParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SparkPlSqlParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SparkPlSqlParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SparkPlSqlParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(SparkPlSqlParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(SparkPlSqlParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(SparkPlSqlParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay(SparkPlSqlParser.OverlayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(SparkPlSqlParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SparkPlSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(SparkPlSqlParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDatetime(SparkPlSqlParser.CurrentDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(SparkPlSqlParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(SparkPlSqlParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SparkPlSqlParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SparkPlSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(SparkPlSqlParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim(SparkPlSqlParser.TrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SparkPlSqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(SparkPlSqlParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(SparkPlSqlParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkPlSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(SparkPlSqlParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SparkPlSqlParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(SparkPlSqlParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SparkPlSqlParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SparkPlSqlParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SparkPlSqlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SparkPlSqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SparkPlSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SparkPlSqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(SparkPlSqlParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SparkPlSqlParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SparkPlSqlParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingMultiUnitsInterval(SparkPlSqlParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiUnitsInterval(SparkPlSqlParser.MultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingUnitToUnitInterval(SparkPlSqlParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitToUnitInterval(SparkPlSqlParser.UnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(SparkPlSqlParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(SparkPlSqlParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#colPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColPosition(SparkPlSqlParser.ColPositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkPlSqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(SparkPlSqlParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkPlSqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(SparkPlSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPositionList(SparkPlSqlParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPosition(SparkPlSqlParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(SparkPlSqlParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(SparkPlSqlParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(SparkPlSqlParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(SparkPlSqlParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SparkPlSqlParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(SparkPlSqlParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(SparkPlSqlParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkPlSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(SparkPlSqlParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkPlSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(SparkPlSqlParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(SparkPlSqlParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(SparkPlSqlParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(SparkPlSqlParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SparkPlSqlParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SparkPlSqlParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifier(SparkPlSqlParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkPlSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorIdent(SparkPlSqlParser.ErrorIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkPlSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealIdent(SparkPlSqlParser.RealIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SparkPlSqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkPlSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SparkPlSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkPlSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(SparkPlSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SparkPlSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentLiteral(SparkPlSqlParser.ExponentLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SparkPlSqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyDecimalLiteral(SparkPlSqlParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SparkPlSqlParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(SparkPlSqlParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(SparkPlSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(SparkPlSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SparkPlSqlParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkPlSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(SparkPlSqlParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#alterColumnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAction(SparkPlSqlParser.AlterColumnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnsiNonReserved(SparkPlSqlParser.AnsiNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#strictNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNonReserved(SparkPlSqlParser.StrictNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkPlSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(SparkPlSqlParser.NonReservedContext ctx);
}