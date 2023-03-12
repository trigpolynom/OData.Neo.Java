package odata.neo.java.core.Services.Foundations.Parser;

// Generated from OData.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ODataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ODataVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ODataParser#odatauri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdatauri(ODataParser.OdatauriContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#serviceroot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceroot(ODataParser.ServicerootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#odatarelativeuri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdatarelativeuri(ODataParser.OdatarelativeuriContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#resourcepath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourcepath(ODataParser.ResourcepathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#collectionnavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionnavigation(ODataParser.CollectionnavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#collectionnavpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionnavpath(ODataParser.CollectionnavpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#keypredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeypredicate(ODataParser.KeypredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#simplekey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplekey(ODataParser.SimplekeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#compoundkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundkey(ODataParser.CompoundkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#keyvaluepair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyvaluepair(ODataParser.KeyvaluepairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#keypropertyvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeypropertyvalue(ODataParser.KeypropertyvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#keypropertyalias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeypropertyalias(ODataParser.KeypropertyaliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#keypathsegments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeypathsegments(ODataParser.KeypathsegmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#keypathliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeypathliteral(ODataParser.KeypathliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singlenavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglenavigation(ODataParser.SinglenavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singlenavpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglenavpath(ODataParser.SinglenavpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#propertypath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertypath(ODataParser.PropertypathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#collectionpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionpath(ODataParser.CollectionpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivepath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivepath(ODataParser.PrimitivepathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexcolpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexcolpath(ODataParser.ComplexcolpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexpath(ODataParser.ComplexpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexnavpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexnavpath(ODataParser.ComplexnavpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#filterinpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterinpath(ODataParser.FilterinpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEach(ODataParser.EachContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(ODataParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ref_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_1(ODataParser.Ref_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ODataParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#querysegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerysegment(ODataParser.QuerysegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ordinalindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinalindex(ODataParser.OrdinalindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundoperation(ODataParser.BoundoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#actionimportcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionimportcall(ODataParser.ActionimportcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundactioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundactioncall(ODataParser.BoundactioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundentityfunctioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundentityfunctioncall(ODataParser.BoundentityfunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundentitycolfunctioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundentitycolfunctioncall(ODataParser.BoundentitycolfunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundcomplexfunctioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundcomplexfunctioncall(ODataParser.BoundcomplexfunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundcomplexcolfunctioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundcomplexcolfunctioncall(ODataParser.BoundcomplexcolfunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundprimitivefunctioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundprimitivefunctioncall(ODataParser.BoundprimitivefunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundprimitivecolfunctioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundprimitivecolfunctioncall(ODataParser.BoundprimitivecolfunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundfunctioncallnoparens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundfunctioncallnoparens(ODataParser.BoundfunctioncallnoparensContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityfunctionimportcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityfunctionimportcall(ODataParser.EntityfunctionimportcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitycolfunctionimportcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitycolfunctionimportcall(ODataParser.EntitycolfunctionimportcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexfunctionimportcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexfunctionimportcall(ODataParser.ComplexfunctionimportcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexcolfunctionimportcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexcolfunctionimportcall(ODataParser.ComplexcolfunctionimportcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivefunctionimportcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivefunctionimportcall(ODataParser.PrimitivefunctionimportcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivecolfunctionimportcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivecolfunctionimportcall(ODataParser.PrimitivecolfunctionimportcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#functionimportcallnoparens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionimportcallnoparens(ODataParser.FunctionimportcallnoparensContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#functionparameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionparameters(ODataParser.FunctionparametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#functionparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionparameter(ODataParser.FunctionparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#parametername}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametername(ODataParser.ParameternameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#parameteralias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameteralias(ODataParser.ParameteraliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#crossjoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossjoin(ODataParser.CrossjoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#queryoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryoptions(ODataParser.QueryoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#queryoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryoption(ODataParser.QueryoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#batchoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatchoptions(ODataParser.BatchoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#batchoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatchoption(ODataParser.BatchoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#metadataoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataoptions(ODataParser.MetadataoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#metadataoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataoption(ODataParser.MetadataoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityoptions(ODataParser.EntityoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityidoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityidoption(ODataParser.EntityidoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitycastoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitycastoptions(ODataParser.EntitycastoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitycastoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitycastoption(ODataParser.EntitycastoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ODataParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#systemqueryoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemqueryoption(ODataParser.SystemqueryoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#compute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompute(ODataParser.ComputeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#computeitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeitem(ODataParser.ComputeitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#computedproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedproperty(ODataParser.ComputedpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#expand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpand(ODataParser.ExpandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#expanditem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanditem(ODataParser.ExpanditemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#expandpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandpath(ODataParser.ExpandpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#expandcountoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandcountoption(ODataParser.ExpandcountoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#expandrefoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandrefoption(ODataParser.ExpandrefoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#expandoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandoption(ODataParser.ExpandoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#levels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevels(ODataParser.LevelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(ODataParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby(ODataParser.OrderbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#orderbyitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderbyitem(ODataParser.OrderbyitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ODataParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(ODataParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(ODataParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(ODataParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#inlinecount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlinecount(ODataParser.InlinecountContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#schemaversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaversion(ODataParser.SchemaversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(ODataParser.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchexpr(ODataParser.SearchexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchparenexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchparenexpr(ODataParser.SearchparenexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchnegateexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchnegateexpr(ODataParser.SearchnegateexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchorexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchorexpr(ODataParser.SearchorexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchandexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchandexpr(ODataParser.SearchandexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchphrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchphrase(ODataParser.SearchphraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchword(ODataParser.SearchwordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchchar(ODataParser.SearchcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#searchexpr_incomplete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchexpr_incomplete(ODataParser.Searchexpr_incompleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(ODataParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectitem(ODataParser.SelectitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectproperty(ODataParser.SelectpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectpath(ODataParser.SelectpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectoptionpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectoptionpc(ODataParser.SelectoptionpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectoption(ODataParser.SelectoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#alloperationsinschema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlloperationsinschema(ODataParser.AlloperationsinschemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#optionallyqualifiedactionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionallyqualifiedactionname(ODataParser.OptionallyqualifiedactionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#optionallyqualifiedfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionallyqualifiedfunctionname(ODataParser.OptionallyqualifiedfunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#parameternames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameternames(ODataParser.ParameternamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#deltatoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeltatoken(ODataParser.DeltatokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#skiptoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkiptoken(ODataParser.SkiptokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#aliasandvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasandvalue(ODataParser.AliasandvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#nameandvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameandvalue(ODataParser.NameandvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#parametervalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametervalue(ODataParser.ParametervalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#customqueryoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomqueryoption(ODataParser.CustomqueryoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#customname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomname(ODataParser.CustomnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#customvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomvalue(ODataParser.CustomvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexannotationinquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexannotationinquery(ODataParser.ComplexannotationinqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityannotationinquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityannotationinquery(ODataParser.EntityannotationinqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitiveannotationinquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveannotationinquery(ODataParser.PrimitiveannotationinqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivecolannotationinquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivecolannotationinquery(ODataParser.PrimitivecolannotationinqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(ODataParser.ContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#contextfragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextfragment(ODataParser.ContextfragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityset(ODataParser.EntitysetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#containmentnavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainmentnavigation(ODataParser.ContainmentnavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#navigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigation(ODataParser.NavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectlist(ODataParser.SelectlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectlistitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectlistitem(ODataParser.SelectlistitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#selectlistproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectlistproperty(ODataParser.SelectlistpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#contextpropertypath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextpropertypath(ODataParser.ContextpropertypathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qualifiedactionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedactionname(ODataParser.QualifiedactionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qualifiedfunctionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedfunctionname(ODataParser.QualifiedfunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexannotationinfragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexannotationinfragment(ODataParser.ComplexannotationinfragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityannotationinfragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityannotationinfragment(ODataParser.EntityannotationinfragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#commonexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonexpr(ODataParser.CommonexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boolcommonexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolcommonexpr(ODataParser.BoolcommonexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#rootexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootexpr(ODataParser.RootexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#firstmemberexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstmemberexpr(ODataParser.FirstmemberexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#memberexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberexpr(ODataParser.MemberexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#directmemberexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectmemberexpr(ODataParser.DirectmemberexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#propertypathexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertypathexpr(ODataParser.PropertypathexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#annotationexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationexpr(ODataParser.AnnotationexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#annotationinquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationinquery(ODataParser.AnnotationinqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#annotationinfragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationinfragment(ODataParser.AnnotationinfragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#annotationqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationqualifier(ODataParser.AnnotationqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#inscopevariableexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInscopevariableexpr(ODataParser.InscopevariableexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#implicitvariableexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitvariableexpr(ODataParser.ImplicitvariableexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#lambdavariableexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdavariableexpr(ODataParser.LambdavariableexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#collectionnavigationexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionnavigationexpr(ODataParser.CollectionnavigationexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#collectionnavnocastexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionnavnocastexpr(ODataParser.CollectionnavnocastexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singlenavigationexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglenavigationexpr(ODataParser.SinglenavigationexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#filterexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterexpr(ODataParser.FilterexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexcolpathexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexcolpathexpr(ODataParser.ComplexcolpathexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#collectionpathexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionpathexpr(ODataParser.CollectionpathexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexpathexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexpathexpr(ODataParser.ComplexpathexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivepathexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivepathexpr(ODataParser.PrimitivepathexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boundfunctionexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundfunctionexpr(ODataParser.BoundfunctionexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#functionexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionexpr(ODataParser.FunctionexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#functionexprparameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionexprparameters(ODataParser.FunctionexprparametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#functionexprparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionexprparameter(ODataParser.FunctionexprparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#anyexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyexpr(ODataParser.AnyexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#allexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllexpr(ODataParser.AllexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#lambdapredicateexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdapredicateexpr(ODataParser.LambdapredicateexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#methodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcallexpr(ODataParser.MethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#boolmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolmethodcallexpr(ODataParser.BoolmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#concatmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatmethodcallexpr(ODataParser.ConcatmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#containsmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsmethodcallexpr(ODataParser.ContainsmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#endswithmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndswithmethodcallexpr(ODataParser.EndswithmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#indexofmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexofmethodcallexpr(ODataParser.IndexofmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#lengthmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthmethodcallexpr(ODataParser.LengthmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#matchespatternmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchespatternmethodcallexpr(ODataParser.MatchespatternmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#startswithmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartswithmethodcallexpr(ODataParser.StartswithmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#substringmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringmethodcallexpr(ODataParser.SubstringmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#tolowermethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTolowermethodcallexpr(ODataParser.TolowermethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#touppermethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTouppermethodcallexpr(ODataParser.TouppermethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#trimmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimmethodcallexpr(ODataParser.TrimmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#yearmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearmethodcallexpr(ODataParser.YearmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#monthmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthmethodcallexpr(ODataParser.MonthmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#daymethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaymethodcallexpr(ODataParser.DaymethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hourmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHourmethodcallexpr(ODataParser.HourmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#minutemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinutemethodcallexpr(ODataParser.MinutemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#secondmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondmethodcallexpr(ODataParser.SecondmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fractionalsecondsmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFractionalsecondsmethodcallexpr(ODataParser.FractionalsecondsmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#totalsecondsmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalsecondsmethodcallexpr(ODataParser.TotalsecondsmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#datemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatemethodcallexpr(ODataParser.DatemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#timemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimemethodcallexpr(ODataParser.TimemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#totaloffsetminutesmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotaloffsetminutesmethodcallexpr(ODataParser.TotaloffsetminutesmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#mindatetimemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMindatetimemethodcallexpr(ODataParser.MindatetimemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#maxdatetimemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxdatetimemethodcallexpr(ODataParser.MaxdatetimemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#nowmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowmethodcallexpr(ODataParser.NowmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#roundmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundmethodcallexpr(ODataParser.RoundmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#floormethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloormethodcallexpr(ODataParser.FloormethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ceilingmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeilingmethodcallexpr(ODataParser.CeilingmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#distancemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistancemethodcallexpr(ODataParser.DistancemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geolengthmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeolengthmethodcallexpr(ODataParser.GeolengthmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#intersectsmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectsmethodcallexpr(ODataParser.IntersectsmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hassubsetmethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHassubsetmethodcallexpr(ODataParser.HassubsetmethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hassubsequencemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHassubsequencemethodcallexpr(ODataParser.HassubsequencemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#casemethodcallexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasemethodcallexpr(ODataParser.CasemethodcallexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#parenexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenexpr(ODataParser.ParenexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#listexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListexpr(ODataParser.ListexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(ODataParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#orexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrexpr(ODataParser.OrexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#eqexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqexpr(ODataParser.EqexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#neexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeexpr(ODataParser.NeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ltexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtexpr(ODataParser.LtexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#leexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeexpr(ODataParser.LeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#gtexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtexpr(ODataParser.GtexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeexpr(ODataParser.GeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#inexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInexpr(ODataParser.InexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hasexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasexpr(ODataParser.HasexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#addexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpr(ODataParser.AddexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#subexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpr(ODataParser.SubexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#mulexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulexpr(ODataParser.MulexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#divexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivexpr(ODataParser.DivexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#divbyexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivbyexpr(ODataParser.DivbyexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#modexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModexpr(ODataParser.ModexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#negateexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateexpr(ODataParser.NegateexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#notexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotexpr(ODataParser.NotexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#isofexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsofexpr(ODataParser.IsofexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#castexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastexpr(ODataParser.CastexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#arrayorobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayorobject(ODataParser.ArrayorobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ODataParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#object_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_1(ODataParser.Object_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(ODataParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#valueinurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueinurl(ODataParser.ValueinurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#begin_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_object(ODataParser.Begin_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#end_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_object(ODataParser.End_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#begin_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_array(ODataParser.Begin_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#end_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_array(ODataParser.End_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#quotation_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotation_mark(ODataParser.Quotation_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#name_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_separator(ODataParser.Name_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#value_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_separator(ODataParser.Value_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#stringinurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringinurl(ODataParser.StringinurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#charinjson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharinjson(ODataParser.CharinjsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qchar_json_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQchar_json_special(ODataParser.Qchar_json_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape(ODataParser.EscapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qualifiedtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedtypename(ODataParser.QualifiedtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#optionallyqualifiedtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionallyqualifiedtypename(ODataParser.OptionallyqualifiedtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singlequalifiedtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglequalifiedtypename(ODataParser.SinglequalifiedtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singletypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingletypename(ODataParser.SingletypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qualifiedentitytypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedentitytypename(ODataParser.QualifiedentitytypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qualifiedcomplextypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedcomplextypename(ODataParser.QualifiedcomplextypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qualifiedtypedefinitionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedtypedefinitionname(ODataParser.QualifiedtypedefinitionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qualifiedenumtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedenumtypename(ODataParser.QualifiedenumtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#optionallyqualifiedentitytypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionallyqualifiedentitytypename(ODataParser.OptionallyqualifiedentitytypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#optionallyqualifiedcomplextypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionallyqualifiedcomplextypename(ODataParser.OptionallyqualifiedcomplextypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#namespace_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_1(ODataParser.Namespace_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#namespacepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacepart(ODataParser.NamespacepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitysetname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitysetname(ODataParser.EntitysetnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singletonentity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingletonentity(ODataParser.SingletonentityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitytypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitytypename(ODataParser.EntitytypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complextypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplextypename(ODataParser.ComplextypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#typedefinitionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefinitionname(ODataParser.TypedefinitionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#enumerationtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationtypename(ODataParser.EnumerationtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#enumerationmember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationmember(ODataParser.EnumerationmemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#termname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermname(ODataParser.TermnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#odataidentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdataidentifier(ODataParser.OdataidentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#identifierleadingcharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierleadingcharacter(ODataParser.IdentifierleadingcharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#identifiercharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiercharacter(ODataParser.IdentifiercharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivetypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivetypename(ODataParser.PrimitivetypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#abstractspatialtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractspatialtypename(ODataParser.AbstractspatialtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#concretespatialtypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcretespatialtypename(ODataParser.ConcretespatialtypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitiveproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveproperty(ODataParser.PrimitivepropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivekeyproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivekeyproperty(ODataParser.PrimitivekeypropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivenonkeyproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivenonkeyproperty(ODataParser.PrimitivenonkeypropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivecolproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivecolproperty(ODataParser.PrimitivecolpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexproperty(ODataParser.ComplexpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexcolproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexcolproperty(ODataParser.ComplexcolpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#streamproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamproperty(ODataParser.StreampropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#navigationproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationproperty(ODataParser.NavigationpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitynavigationproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitynavigationproperty(ODataParser.EntitynavigationpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitycolnavigationproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitycolnavigationproperty(ODataParser.EntitycolnavigationpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(ODataParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#actionimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionimport(ODataParser.ActionimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ODataParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityfunction(ODataParser.EntityfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitycolfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitycolfunction(ODataParser.EntitycolfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexfunction(ODataParser.ComplexfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexcolfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexcolfunction(ODataParser.ComplexcolfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivefunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivefunction(ODataParser.PrimitivefunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivecolfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivecolfunction(ODataParser.PrimitivecolfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entityfunctionimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityfunctionimport(ODataParser.EntityfunctionimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#entitycolfunctionimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntitycolfunctionimport(ODataParser.EntitycolfunctionimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexfunctionimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexfunctionimport(ODataParser.ComplexfunctionimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#complexcolfunctionimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexcolfunctionimport(ODataParser.ComplexcolfunctionimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivefunctionimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivefunctionimport(ODataParser.PrimitivefunctionimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivecolfunctionimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivecolfunctionimport(ODataParser.PrimitivecolfunctionimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitiveliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveliteral(ODataParser.PrimitiveliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#primitivevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivevalue(ODataParser.PrimitivevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#nullvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullvalue(ODataParser.NullvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ODataParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#binaryvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryvalue(ODataParser.BinaryvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#base64b16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase64b16(ODataParser.Base64b16Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#base64b8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase64b8(ODataParser.Base64b8Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#base64char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase64char(ODataParser.Base64charContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#booleanvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanvalue(ODataParser.BooleanvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#decimalvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalvalue(ODataParser.DecimalvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#doublevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublevalue(ODataParser.DoublevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singlevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglevalue(ODataParser.SinglevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#naninfinity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaninfinity(ODataParser.NaninfinityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#guidvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuidvalue(ODataParser.GuidvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#bytevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytevalue(ODataParser.BytevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#sbytevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSbytevalue(ODataParser.SbytevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#int16value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt16value(ODataParser.Int16valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#int32value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt32value(ODataParser.Int32valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#int64value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt64value(ODataParser.Int64valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#string_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_1(ODataParser.String_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#squote_in_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquote_in_string(ODataParser.Squote_in_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#datevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatevalue(ODataParser.DatevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#datetimeoffsetvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeoffsetvalue(ODataParser.DatetimeoffsetvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#datetimeoffsetvalueinurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeoffsetvalueinurl(ODataParser.DatetimeoffsetvalueinurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(ODataParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#durationvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurationvalue(ODataParser.DurationvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#timeofdayvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeofdayvalue(ODataParser.TimeofdayvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#timeofdayvalueinurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeofdayvalueinurl(ODataParser.TimeofdayvalueinurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#onetonine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnetonine(ODataParser.OnetonineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#zerotofiftynine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZerotofiftynine(ODataParser.ZerotofiftynineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(ODataParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(ODataParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(ODataParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(ODataParser.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute(ODataParser.MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond(ODataParser.SecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fractionalseconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFractionalseconds(ODataParser.FractionalsecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#enum_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_1(ODataParser.Enum_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#enumvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumvalue(ODataParser.EnumvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#singleenumvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleenumvalue(ODataParser.SingleenumvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#enummembervalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnummembervalue(ODataParser.EnummembervalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographycollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographycollection(ODataParser.GeographycollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fullcollectionliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullcollectionliteral(ODataParser.FullcollectionliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#collectionliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionliteral(ODataParser.CollectionliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geoliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeoliteral(ODataParser.GeoliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographylinestring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographylinestring(ODataParser.GeographylinestringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fulllinestringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFulllinestringliteral(ODataParser.FulllinestringliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#linestringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinestringliteral(ODataParser.LinestringliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#linestringdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinestringdata(ODataParser.LinestringdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographymultilinestring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographymultilinestring(ODataParser.GeographymultilinestringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fullmultilinestringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullmultilinestringliteral(ODataParser.FullmultilinestringliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#multilinestringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultilinestringliteral(ODataParser.MultilinestringliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographymultipoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographymultipoint(ODataParser.GeographymultipointContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fullmultipointliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullmultipointliteral(ODataParser.FullmultipointliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#multipointliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipointliteral(ODataParser.MultipointliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographymultipolygon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographymultipolygon(ODataParser.GeographymultipolygonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fullmultipolygonliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullmultipolygonliteral(ODataParser.FullmultipolygonliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#multipolygonliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipolygonliteral(ODataParser.MultipolygonliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographypoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographypoint(ODataParser.GeographypointContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fullpointliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullpointliteral(ODataParser.FullpointliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#sridliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSridliteral(ODataParser.SridliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pointliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointliteral(ODataParser.PointliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pointdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointdata(ODataParser.PointdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#positionliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionliteral(ODataParser.PositionliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographypolygon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographypolygon(ODataParser.GeographypolygonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fullpolygonliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullpolygonliteral(ODataParser.FullpolygonliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#polygonliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolygonliteral(ODataParser.PolygonliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#polygondata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolygondata(ODataParser.PolygondataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRingliteral(ODataParser.RingliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometrycollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometrycollection(ODataParser.GeometrycollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometrylinestring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometrylinestring(ODataParser.GeometrylinestringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometrymultilinestring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometrymultilinestring(ODataParser.GeometrymultilinestringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometrymultipoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometrymultipoint(ODataParser.GeometrymultipointContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometrymultipolygon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometrymultipolygon(ODataParser.GeometrymultipolygonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometrypoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometrypoint(ODataParser.GeometrypointContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometrypolygon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometrypolygon(ODataParser.GeometrypolygonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geographyprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeographyprefix(ODataParser.GeographyprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#geometryprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometryprefix(ODataParser.GeometryprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ODataParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#content_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_id(ODataParser.Content_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#isolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolation(ODataParser.IsolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#request_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest_id(ODataParser.Request_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#odata_entityid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdata_entityid(ODataParser.Odata_entityidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#odata_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdata_error(ODataParser.Odata_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#odata_maxversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdata_maxversion(ODataParser.Odata_maxversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#odata_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdata_version(ODataParser.Odata_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#prefer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefer(ODataParser.PreferContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#preference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreference(ODataParser.PreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#allowentityreferencespreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowentityreferencespreference(ODataParser.AllowentityreferencespreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#callbackpreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackpreference(ODataParser.CallbackpreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#continueonerrorpreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueonerrorpreference(ODataParser.ContinueonerrorpreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#includeannotationspreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeannotationspreference(ODataParser.IncludeannotationspreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#annotationslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationslist(ODataParser.AnnotationslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#annotationidentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationidentifier(ODataParser.AnnotationidentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#excludeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludeoperator(ODataParser.ExcludeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#maxpagesizepreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxpagesizepreference(ODataParser.MaxpagesizepreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#omitvaluespreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmitvaluespreference(ODataParser.OmitvaluespreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#respondasyncpreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespondasyncpreference(ODataParser.RespondasyncpreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#returnpreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnpreference(ODataParser.ReturnpreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#trackchangespreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackchangespreference(ODataParser.TrackchangespreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#waitpreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitpreference(ODataParser.WaitpreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#obs_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObs_text(ODataParser.Obs_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOws(ODataParser.OwsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#bws_h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBws_h(ODataParser.Bws_hContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#eq_h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_h(ODataParser.Eq_hContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#rws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRws(ODataParser.RwsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#bws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBws(ODataParser.BwsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#at}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt(ODataParser.AtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(ODataParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(ODataParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(ODataParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash(ODataParser.HashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(ODataParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(ODataParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(ODataParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#squote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquote(ODataParser.SquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen(ODataParser.OpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose(ODataParser.CloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUri(ODataParser.UriContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hier_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHier_part(ODataParser.Hier_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(ODataParser.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#authority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthority(ODataParser.AuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#userinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserinfo(ODataParser.UserinfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(ODataParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(ODataParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ip_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_literal(ODataParser.Ip_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ipvfuture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpvfuture(ODataParser.IpvfutureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ipv6address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv6address(ODataParser.Ipv6addressContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#h16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH16(ODataParser.H16Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ls32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLs32(ODataParser.Ls32Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#ipv4address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4address(ODataParser.Ipv4addressContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#dec_octet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_octet(ODataParser.Dec_octetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#reg_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_name(ODataParser.Reg_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#path_abempty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_abempty(ODataParser.Path_abemptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#path_absolute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_absolute(ODataParser.Path_absoluteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#path_rootless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_rootless(ODataParser.Path_rootlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(ODataParser.SegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#segment_nz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_nz(ODataParser.Segment_nzContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPchar(ODataParser.PcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ODataParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#fragment_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragment_1(ODataParser.Fragment_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pct_encoded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPct_encoded(ODataParser.Pct_encodedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#unreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved(ODataParser.UnreservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#sub_delims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_delims(ODataParser.Sub_delimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#other_delims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_delims(ODataParser.Other_delimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pchar_no_squote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPchar_no_squote(ODataParser.Pchar_no_squoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pct_encoded_no_squote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPct_encoded_no_squote(ODataParser.Pct_encoded_no_squoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qchar_no_amp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQchar_no_amp(ODataParser.Qchar_no_ampContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qchar_no_amp_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQchar_no_amp_eq(ODataParser.Qchar_no_amp_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qchar_no_amp_eq_at_dollar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQchar_no_amp_eq_at_dollar(ODataParser.Qchar_no_amp_eq_at_dollarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qchar_no_amp_squote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQchar_no_amp_squote(ODataParser.Qchar_no_amp_squoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qchar_no_amp_dquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQchar_no_amp_dquote(ODataParser.Qchar_no_amp_dquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#qchar_unescaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQchar_unescaped(ODataParser.Qchar_unescapedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pct_encoded_unescaped}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPct_encoded_unescaped(ODataParser.Pct_encoded_unescapedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#pct_encoded_no_dquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPct_encoded_no_dquote(ODataParser.Pct_encoded_no_dquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#iri_in_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri_in_header(ODataParser.Iri_in_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#iri_in_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri_in_query(ODataParser.Iri_in_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(ODataParser.AlphaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(ODataParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#hexdig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexdig(ODataParser.HexdigContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#a_to_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_to_f(ODataParser.A_to_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#dquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDquote(ODataParser.DquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSp(ODataParser.SpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#htab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtab(ODataParser.HtabContext ctx);
	/**
	 * Visit a parse tree produced by {@link ODataParser#vchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVchar(ODataParser.VcharContext ctx);
}