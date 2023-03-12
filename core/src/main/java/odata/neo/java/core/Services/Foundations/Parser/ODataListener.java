package odata.neo.java.core.Services.Foundations.Parser;

// Generated from OData.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ODataParser}.
 */
public interface ODataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ODataParser#odatauri}.
	 * @param ctx the parse tree
	 */
	void enterOdatauri(ODataParser.OdatauriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#odatauri}.
	 * @param ctx the parse tree
	 */
	void exitOdatauri(ODataParser.OdatauriContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#serviceroot}.
	 * @param ctx the parse tree
	 */
	void enterServiceroot(ODataParser.ServicerootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#serviceroot}.
	 * @param ctx the parse tree
	 */
	void exitServiceroot(ODataParser.ServicerootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#odatarelativeuri}.
	 * @param ctx the parse tree
	 */
	void enterOdatarelativeuri(ODataParser.OdatarelativeuriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#odatarelativeuri}.
	 * @param ctx the parse tree
	 */
	void exitOdatarelativeuri(ODataParser.OdatarelativeuriContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#resourcepath}.
	 * @param ctx the parse tree
	 */
	void enterResourcepath(ODataParser.ResourcepathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#resourcepath}.
	 * @param ctx the parse tree
	 */
	void exitResourcepath(ODataParser.ResourcepathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#collectionnavigation}.
	 * @param ctx the parse tree
	 */
	void enterCollectionnavigation(ODataParser.CollectionnavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#collectionnavigation}.
	 * @param ctx the parse tree
	 */
	void exitCollectionnavigation(ODataParser.CollectionnavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#collectionnavpath}.
	 * @param ctx the parse tree
	 */
	void enterCollectionnavpath(ODataParser.CollectionnavpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#collectionnavpath}.
	 * @param ctx the parse tree
	 */
	void exitCollectionnavpath(ODataParser.CollectionnavpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#keypredicate}.
	 * @param ctx the parse tree
	 */
	void enterKeypredicate(ODataParser.KeypredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#keypredicate}.
	 * @param ctx the parse tree
	 */
	void exitKeypredicate(ODataParser.KeypredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#simplekey}.
	 * @param ctx the parse tree
	 */
	void enterSimplekey(ODataParser.SimplekeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#simplekey}.
	 * @param ctx the parse tree
	 */
	void exitSimplekey(ODataParser.SimplekeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#compoundkey}.
	 * @param ctx the parse tree
	 */
	void enterCompoundkey(ODataParser.CompoundkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#compoundkey}.
	 * @param ctx the parse tree
	 */
	void exitCompoundkey(ODataParser.CompoundkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#keyvaluepair}.
	 * @param ctx the parse tree
	 */
	void enterKeyvaluepair(ODataParser.KeyvaluepairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#keyvaluepair}.
	 * @param ctx the parse tree
	 */
	void exitKeyvaluepair(ODataParser.KeyvaluepairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#keypropertyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeypropertyvalue(ODataParser.KeypropertyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#keypropertyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeypropertyvalue(ODataParser.KeypropertyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#keypropertyalias}.
	 * @param ctx the parse tree
	 */
	void enterKeypropertyalias(ODataParser.KeypropertyaliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#keypropertyalias}.
	 * @param ctx the parse tree
	 */
	void exitKeypropertyalias(ODataParser.KeypropertyaliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#keypathsegments}.
	 * @param ctx the parse tree
	 */
	void enterKeypathsegments(ODataParser.KeypathsegmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#keypathsegments}.
	 * @param ctx the parse tree
	 */
	void exitKeypathsegments(ODataParser.KeypathsegmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#keypathliteral}.
	 * @param ctx the parse tree
	 */
	void enterKeypathliteral(ODataParser.KeypathliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#keypathliteral}.
	 * @param ctx the parse tree
	 */
	void exitKeypathliteral(ODataParser.KeypathliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singlenavigation}.
	 * @param ctx the parse tree
	 */
	void enterSinglenavigation(ODataParser.SinglenavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singlenavigation}.
	 * @param ctx the parse tree
	 */
	void exitSinglenavigation(ODataParser.SinglenavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singlenavpath}.
	 * @param ctx the parse tree
	 */
	void enterSinglenavpath(ODataParser.SinglenavpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singlenavpath}.
	 * @param ctx the parse tree
	 */
	void exitSinglenavpath(ODataParser.SinglenavpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#propertypath}.
	 * @param ctx the parse tree
	 */
	void enterPropertypath(ODataParser.PropertypathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#propertypath}.
	 * @param ctx the parse tree
	 */
	void exitPropertypath(ODataParser.PropertypathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#collectionpath}.
	 * @param ctx the parse tree
	 */
	void enterCollectionpath(ODataParser.CollectionpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#collectionpath}.
	 * @param ctx the parse tree
	 */
	void exitCollectionpath(ODataParser.CollectionpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivepath}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivepath(ODataParser.PrimitivepathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivepath}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivepath(ODataParser.PrimitivepathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexcolpath}.
	 * @param ctx the parse tree
	 */
	void enterComplexcolpath(ODataParser.ComplexcolpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexcolpath}.
	 * @param ctx the parse tree
	 */
	void exitComplexcolpath(ODataParser.ComplexcolpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexpath}.
	 * @param ctx the parse tree
	 */
	void enterComplexpath(ODataParser.ComplexpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexpath}.
	 * @param ctx the parse tree
	 */
	void exitComplexpath(ODataParser.ComplexpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexnavpath}.
	 * @param ctx the parse tree
	 */
	void enterComplexnavpath(ODataParser.ComplexnavpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexnavpath}.
	 * @param ctx the parse tree
	 */
	void exitComplexnavpath(ODataParser.ComplexnavpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#filterinpath}.
	 * @param ctx the parse tree
	 */
	void enterFilterinpath(ODataParser.FilterinpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#filterinpath}.
	 * @param ctx the parse tree
	 */
	void exitFilterinpath(ODataParser.FilterinpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#each}.
	 * @param ctx the parse tree
	 */
	void enterEach(ODataParser.EachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#each}.
	 * @param ctx the parse tree
	 */
	void exitEach(ODataParser.EachContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(ODataParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(ODataParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ref_1}.
	 * @param ctx the parse tree
	 */
	void enterRef_1(ODataParser.Ref_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ref_1}.
	 * @param ctx the parse tree
	 */
	void exitRef_1(ODataParser.Ref_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ODataParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ODataParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#querysegment}.
	 * @param ctx the parse tree
	 */
	void enterQuerysegment(ODataParser.QuerysegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#querysegment}.
	 * @param ctx the parse tree
	 */
	void exitQuerysegment(ODataParser.QuerysegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ordinalindex}.
	 * @param ctx the parse tree
	 */
	void enterOrdinalindex(ODataParser.OrdinalindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ordinalindex}.
	 * @param ctx the parse tree
	 */
	void exitOrdinalindex(ODataParser.OrdinalindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundoperation}.
	 * @param ctx the parse tree
	 */
	void enterBoundoperation(ODataParser.BoundoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundoperation}.
	 * @param ctx the parse tree
	 */
	void exitBoundoperation(ODataParser.BoundoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#actionimportcall}.
	 * @param ctx the parse tree
	 */
	void enterActionimportcall(ODataParser.ActionimportcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#actionimportcall}.
	 * @param ctx the parse tree
	 */
	void exitActionimportcall(ODataParser.ActionimportcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundactioncall}.
	 * @param ctx the parse tree
	 */
	void enterBoundactioncall(ODataParser.BoundactioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundactioncall}.
	 * @param ctx the parse tree
	 */
	void exitBoundactioncall(ODataParser.BoundactioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundentityfunctioncall}.
	 * @param ctx the parse tree
	 */
	void enterBoundentityfunctioncall(ODataParser.BoundentityfunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundentityfunctioncall}.
	 * @param ctx the parse tree
	 */
	void exitBoundentityfunctioncall(ODataParser.BoundentityfunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundentitycolfunctioncall}.
	 * @param ctx the parse tree
	 */
	void enterBoundentitycolfunctioncall(ODataParser.BoundentitycolfunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundentitycolfunctioncall}.
	 * @param ctx the parse tree
	 */
	void exitBoundentitycolfunctioncall(ODataParser.BoundentitycolfunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundcomplexfunctioncall}.
	 * @param ctx the parse tree
	 */
	void enterBoundcomplexfunctioncall(ODataParser.BoundcomplexfunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundcomplexfunctioncall}.
	 * @param ctx the parse tree
	 */
	void exitBoundcomplexfunctioncall(ODataParser.BoundcomplexfunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundcomplexcolfunctioncall}.
	 * @param ctx the parse tree
	 */
	void enterBoundcomplexcolfunctioncall(ODataParser.BoundcomplexcolfunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundcomplexcolfunctioncall}.
	 * @param ctx the parse tree
	 */
	void exitBoundcomplexcolfunctioncall(ODataParser.BoundcomplexcolfunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundprimitivefunctioncall}.
	 * @param ctx the parse tree
	 */
	void enterBoundprimitivefunctioncall(ODataParser.BoundprimitivefunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundprimitivefunctioncall}.
	 * @param ctx the parse tree
	 */
	void exitBoundprimitivefunctioncall(ODataParser.BoundprimitivefunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundprimitivecolfunctioncall}.
	 * @param ctx the parse tree
	 */
	void enterBoundprimitivecolfunctioncall(ODataParser.BoundprimitivecolfunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundprimitivecolfunctioncall}.
	 * @param ctx the parse tree
	 */
	void exitBoundprimitivecolfunctioncall(ODataParser.BoundprimitivecolfunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundfunctioncallnoparens}.
	 * @param ctx the parse tree
	 */
	void enterBoundfunctioncallnoparens(ODataParser.BoundfunctioncallnoparensContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundfunctioncallnoparens}.
	 * @param ctx the parse tree
	 */
	void exitBoundfunctioncallnoparens(ODataParser.BoundfunctioncallnoparensContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void enterEntityfunctionimportcall(ODataParser.EntityfunctionimportcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void exitEntityfunctionimportcall(ODataParser.EntityfunctionimportcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitycolfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void enterEntitycolfunctionimportcall(ODataParser.EntitycolfunctionimportcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitycolfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void exitEntitycolfunctionimportcall(ODataParser.EntitycolfunctionimportcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void enterComplexfunctionimportcall(ODataParser.ComplexfunctionimportcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void exitComplexfunctionimportcall(ODataParser.ComplexfunctionimportcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexcolfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void enterComplexcolfunctionimportcall(ODataParser.ComplexcolfunctionimportcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexcolfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void exitComplexcolfunctionimportcall(ODataParser.ComplexcolfunctionimportcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivefunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivefunctionimportcall(ODataParser.PrimitivefunctionimportcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivefunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivefunctionimportcall(ODataParser.PrimitivefunctionimportcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivecolfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivecolfunctionimportcall(ODataParser.PrimitivecolfunctionimportcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivecolfunctionimportcall}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivecolfunctionimportcall(ODataParser.PrimitivecolfunctionimportcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#functionimportcallnoparens}.
	 * @param ctx the parse tree
	 */
	void enterFunctionimportcallnoparens(ODataParser.FunctionimportcallnoparensContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#functionimportcallnoparens}.
	 * @param ctx the parse tree
	 */
	void exitFunctionimportcallnoparens(ODataParser.FunctionimportcallnoparensContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#functionparameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionparameters(ODataParser.FunctionparametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#functionparameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionparameters(ODataParser.FunctionparametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#functionparameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionparameter(ODataParser.FunctionparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#functionparameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionparameter(ODataParser.FunctionparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#parametername}.
	 * @param ctx the parse tree
	 */
	void enterParametername(ODataParser.ParameternameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#parametername}.
	 * @param ctx the parse tree
	 */
	void exitParametername(ODataParser.ParameternameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#parameteralias}.
	 * @param ctx the parse tree
	 */
	void enterParameteralias(ODataParser.ParameteraliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#parameteralias}.
	 * @param ctx the parse tree
	 */
	void exitParameteralias(ODataParser.ParameteraliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#crossjoin}.
	 * @param ctx the parse tree
	 */
	void enterCrossjoin(ODataParser.CrossjoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#crossjoin}.
	 * @param ctx the parse tree
	 */
	void exitCrossjoin(ODataParser.CrossjoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#queryoptions}.
	 * @param ctx the parse tree
	 */
	void enterQueryoptions(ODataParser.QueryoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#queryoptions}.
	 * @param ctx the parse tree
	 */
	void exitQueryoptions(ODataParser.QueryoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#queryoption}.
	 * @param ctx the parse tree
	 */
	void enterQueryoption(ODataParser.QueryoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#queryoption}.
	 * @param ctx the parse tree
	 */
	void exitQueryoption(ODataParser.QueryoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#batchoptions}.
	 * @param ctx the parse tree
	 */
	void enterBatchoptions(ODataParser.BatchoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#batchoptions}.
	 * @param ctx the parse tree
	 */
	void exitBatchoptions(ODataParser.BatchoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#batchoption}.
	 * @param ctx the parse tree
	 */
	void enterBatchoption(ODataParser.BatchoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#batchoption}.
	 * @param ctx the parse tree
	 */
	void exitBatchoption(ODataParser.BatchoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#metadataoptions}.
	 * @param ctx the parse tree
	 */
	void enterMetadataoptions(ODataParser.MetadataoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#metadataoptions}.
	 * @param ctx the parse tree
	 */
	void exitMetadataoptions(ODataParser.MetadataoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#metadataoption}.
	 * @param ctx the parse tree
	 */
	void enterMetadataoption(ODataParser.MetadataoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#metadataoption}.
	 * @param ctx the parse tree
	 */
	void exitMetadataoption(ODataParser.MetadataoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityoptions}.
	 * @param ctx the parse tree
	 */
	void enterEntityoptions(ODataParser.EntityoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityoptions}.
	 * @param ctx the parse tree
	 */
	void exitEntityoptions(ODataParser.EntityoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityidoption}.
	 * @param ctx the parse tree
	 */
	void enterEntityidoption(ODataParser.EntityidoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityidoption}.
	 * @param ctx the parse tree
	 */
	void exitEntityidoption(ODataParser.EntityidoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitycastoptions}.
	 * @param ctx the parse tree
	 */
	void enterEntitycastoptions(ODataParser.EntitycastoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitycastoptions}.
	 * @param ctx the parse tree
	 */
	void exitEntitycastoptions(ODataParser.EntitycastoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitycastoption}.
	 * @param ctx the parse tree
	 */
	void enterEntitycastoption(ODataParser.EntitycastoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitycastoption}.
	 * @param ctx the parse tree
	 */
	void exitEntitycastoption(ODataParser.EntitycastoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ODataParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ODataParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#systemqueryoption}.
	 * @param ctx the parse tree
	 */
	void enterSystemqueryoption(ODataParser.SystemqueryoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#systemqueryoption}.
	 * @param ctx the parse tree
	 */
	void exitSystemqueryoption(ODataParser.SystemqueryoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#compute}.
	 * @param ctx the parse tree
	 */
	void enterCompute(ODataParser.ComputeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#compute}.
	 * @param ctx the parse tree
	 */
	void exitCompute(ODataParser.ComputeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#computeitem}.
	 * @param ctx the parse tree
	 */
	void enterComputeitem(ODataParser.ComputeitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#computeitem}.
	 * @param ctx the parse tree
	 */
	void exitComputeitem(ODataParser.ComputeitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#computedproperty}.
	 * @param ctx the parse tree
	 */
	void enterComputedproperty(ODataParser.ComputedpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#computedproperty}.
	 * @param ctx the parse tree
	 */
	void exitComputedproperty(ODataParser.ComputedpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#expand}.
	 * @param ctx the parse tree
	 */
	void enterExpand(ODataParser.ExpandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#expand}.
	 * @param ctx the parse tree
	 */
	void exitExpand(ODataParser.ExpandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#expanditem}.
	 * @param ctx the parse tree
	 */
	void enterExpanditem(ODataParser.ExpanditemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#expanditem}.
	 * @param ctx the parse tree
	 */
	void exitExpanditem(ODataParser.ExpanditemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#expandpath}.
	 * @param ctx the parse tree
	 */
	void enterExpandpath(ODataParser.ExpandpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#expandpath}.
	 * @param ctx the parse tree
	 */
	void exitExpandpath(ODataParser.ExpandpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#expandcountoption}.
	 * @param ctx the parse tree
	 */
	void enterExpandcountoption(ODataParser.ExpandcountoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#expandcountoption}.
	 * @param ctx the parse tree
	 */
	void exitExpandcountoption(ODataParser.ExpandcountoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#expandrefoption}.
	 * @param ctx the parse tree
	 */
	void enterExpandrefoption(ODataParser.ExpandrefoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#expandrefoption}.
	 * @param ctx the parse tree
	 */
	void exitExpandrefoption(ODataParser.ExpandrefoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#expandoption}.
	 * @param ctx the parse tree
	 */
	void enterExpandoption(ODataParser.ExpandoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#expandoption}.
	 * @param ctx the parse tree
	 */
	void exitExpandoption(ODataParser.ExpandoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#levels}.
	 * @param ctx the parse tree
	 */
	void enterLevels(ODataParser.LevelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#levels}.
	 * @param ctx the parse tree
	 */
	void exitLevels(ODataParser.LevelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(ODataParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(ODataParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterOrderby(ODataParser.OrderbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitOrderby(ODataParser.OrderbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#orderbyitem}.
	 * @param ctx the parse tree
	 */
	void enterOrderbyitem(ODataParser.OrderbyitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#orderbyitem}.
	 * @param ctx the parse tree
	 */
	void exitOrderbyitem(ODataParser.OrderbyitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(ODataParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(ODataParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(ODataParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(ODataParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(ODataParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(ODataParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(ODataParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(ODataParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#inlinecount}.
	 * @param ctx the parse tree
	 */
	void enterInlinecount(ODataParser.InlinecountContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#inlinecount}.
	 * @param ctx the parse tree
	 */
	void exitInlinecount(ODataParser.InlinecountContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#schemaversion}.
	 * @param ctx the parse tree
	 */
	void enterSchemaversion(ODataParser.SchemaversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#schemaversion}.
	 * @param ctx the parse tree
	 */
	void exitSchemaversion(ODataParser.SchemaversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(ODataParser.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(ODataParser.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchexpr}.
	 * @param ctx the parse tree
	 */
	void enterSearchexpr(ODataParser.SearchexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchexpr}.
	 * @param ctx the parse tree
	 */
	void exitSearchexpr(ODataParser.SearchexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchparenexpr}.
	 * @param ctx the parse tree
	 */
	void enterSearchparenexpr(ODataParser.SearchparenexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchparenexpr}.
	 * @param ctx the parse tree
	 */
	void exitSearchparenexpr(ODataParser.SearchparenexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchnegateexpr}.
	 * @param ctx the parse tree
	 */
	void enterSearchnegateexpr(ODataParser.SearchnegateexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchnegateexpr}.
	 * @param ctx the parse tree
	 */
	void exitSearchnegateexpr(ODataParser.SearchnegateexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchorexpr}.
	 * @param ctx the parse tree
	 */
	void enterSearchorexpr(ODataParser.SearchorexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchorexpr}.
	 * @param ctx the parse tree
	 */
	void exitSearchorexpr(ODataParser.SearchorexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchandexpr}.
	 * @param ctx the parse tree
	 */
	void enterSearchandexpr(ODataParser.SearchandexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchandexpr}.
	 * @param ctx the parse tree
	 */
	void exitSearchandexpr(ODataParser.SearchandexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchphrase}.
	 * @param ctx the parse tree
	 */
	void enterSearchphrase(ODataParser.SearchphraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchphrase}.
	 * @param ctx the parse tree
	 */
	void exitSearchphrase(ODataParser.SearchphraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchword}.
	 * @param ctx the parse tree
	 */
	void enterSearchword(ODataParser.SearchwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchword}.
	 * @param ctx the parse tree
	 */
	void exitSearchword(ODataParser.SearchwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchchar}.
	 * @param ctx the parse tree
	 */
	void enterSearchchar(ODataParser.SearchcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchchar}.
	 * @param ctx the parse tree
	 */
	void exitSearchchar(ODataParser.SearchcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#searchexpr_incomplete}.
	 * @param ctx the parse tree
	 */
	void enterSearchexpr_incomplete(ODataParser.Searchexpr_incompleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#searchexpr_incomplete}.
	 * @param ctx the parse tree
	 */
	void exitSearchexpr_incomplete(ODataParser.Searchexpr_incompleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(ODataParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(ODataParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectitem}.
	 * @param ctx the parse tree
	 */
	void enterSelectitem(ODataParser.SelectitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectitem}.
	 * @param ctx the parse tree
	 */
	void exitSelectitem(ODataParser.SelectitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectproperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectproperty(ODataParser.SelectpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectproperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectproperty(ODataParser.SelectpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectpath}.
	 * @param ctx the parse tree
	 */
	void enterSelectpath(ODataParser.SelectpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectpath}.
	 * @param ctx the parse tree
	 */
	void exitSelectpath(ODataParser.SelectpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectoptionpc}.
	 * @param ctx the parse tree
	 */
	void enterSelectoptionpc(ODataParser.SelectoptionpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectoptionpc}.
	 * @param ctx the parse tree
	 */
	void exitSelectoptionpc(ODataParser.SelectoptionpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectoption}.
	 * @param ctx the parse tree
	 */
	void enterSelectoption(ODataParser.SelectoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectoption}.
	 * @param ctx the parse tree
	 */
	void exitSelectoption(ODataParser.SelectoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#alloperationsinschema}.
	 * @param ctx the parse tree
	 */
	void enterAlloperationsinschema(ODataParser.AlloperationsinschemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#alloperationsinschema}.
	 * @param ctx the parse tree
	 */
	void exitAlloperationsinschema(ODataParser.AlloperationsinschemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#optionallyqualifiedactionname}.
	 * @param ctx the parse tree
	 */
	void enterOptionallyqualifiedactionname(ODataParser.OptionallyqualifiedactionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#optionallyqualifiedactionname}.
	 * @param ctx the parse tree
	 */
	void exitOptionallyqualifiedactionname(ODataParser.OptionallyqualifiedactionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#optionallyqualifiedfunctionname}.
	 * @param ctx the parse tree
	 */
	void enterOptionallyqualifiedfunctionname(ODataParser.OptionallyqualifiedfunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#optionallyqualifiedfunctionname}.
	 * @param ctx the parse tree
	 */
	void exitOptionallyqualifiedfunctionname(ODataParser.OptionallyqualifiedfunctionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#parameternames}.
	 * @param ctx the parse tree
	 */
	void enterParameternames(ODataParser.ParameternamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#parameternames}.
	 * @param ctx the parse tree
	 */
	void exitParameternames(ODataParser.ParameternamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#deltatoken}.
	 * @param ctx the parse tree
	 */
	void enterDeltatoken(ODataParser.DeltatokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#deltatoken}.
	 * @param ctx the parse tree
	 */
	void exitDeltatoken(ODataParser.DeltatokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#skiptoken}.
	 * @param ctx the parse tree
	 */
	void enterSkiptoken(ODataParser.SkiptokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#skiptoken}.
	 * @param ctx the parse tree
	 */
	void exitSkiptoken(ODataParser.SkiptokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#aliasandvalue}.
	 * @param ctx the parse tree
	 */
	void enterAliasandvalue(ODataParser.AliasandvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#aliasandvalue}.
	 * @param ctx the parse tree
	 */
	void exitAliasandvalue(ODataParser.AliasandvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#nameandvalue}.
	 * @param ctx the parse tree
	 */
	void enterNameandvalue(ODataParser.NameandvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#nameandvalue}.
	 * @param ctx the parse tree
	 */
	void exitNameandvalue(ODataParser.NameandvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#parametervalue}.
	 * @param ctx the parse tree
	 */
	void enterParametervalue(ODataParser.ParametervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#parametervalue}.
	 * @param ctx the parse tree
	 */
	void exitParametervalue(ODataParser.ParametervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#customqueryoption}.
	 * @param ctx the parse tree
	 */
	void enterCustomqueryoption(ODataParser.CustomqueryoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#customqueryoption}.
	 * @param ctx the parse tree
	 */
	void exitCustomqueryoption(ODataParser.CustomqueryoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#customname}.
	 * @param ctx the parse tree
	 */
	void enterCustomname(ODataParser.CustomnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#customname}.
	 * @param ctx the parse tree
	 */
	void exitCustomname(ODataParser.CustomnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#customvalue}.
	 * @param ctx the parse tree
	 */
	void enterCustomvalue(ODataParser.CustomvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#customvalue}.
	 * @param ctx the parse tree
	 */
	void exitCustomvalue(ODataParser.CustomvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexannotationinquery}.
	 * @param ctx the parse tree
	 */
	void enterComplexannotationinquery(ODataParser.ComplexannotationinqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexannotationinquery}.
	 * @param ctx the parse tree
	 */
	void exitComplexannotationinquery(ODataParser.ComplexannotationinqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityannotationinquery}.
	 * @param ctx the parse tree
	 */
	void enterEntityannotationinquery(ODataParser.EntityannotationinqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityannotationinquery}.
	 * @param ctx the parse tree
	 */
	void exitEntityannotationinquery(ODataParser.EntityannotationinqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitiveannotationinquery}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveannotationinquery(ODataParser.PrimitiveannotationinqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitiveannotationinquery}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveannotationinquery(ODataParser.PrimitiveannotationinqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivecolannotationinquery}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivecolannotationinquery(ODataParser.PrimitivecolannotationinqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivecolannotationinquery}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivecolannotationinquery(ODataParser.PrimitivecolannotationinqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(ODataParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(ODataParser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#contextfragment}.
	 * @param ctx the parse tree
	 */
	void enterContextfragment(ODataParser.ContextfragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#contextfragment}.
	 * @param ctx the parse tree
	 */
	void exitContextfragment(ODataParser.ContextfragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityset}.
	 * @param ctx the parse tree
	 */
	void enterEntityset(ODataParser.EntitysetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityset}.
	 * @param ctx the parse tree
	 */
	void exitEntityset(ODataParser.EntitysetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#containmentnavigation}.
	 * @param ctx the parse tree
	 */
	void enterContainmentnavigation(ODataParser.ContainmentnavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#containmentnavigation}.
	 * @param ctx the parse tree
	 */
	void exitContainmentnavigation(ODataParser.ContainmentnavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#navigation}.
	 * @param ctx the parse tree
	 */
	void enterNavigation(ODataParser.NavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#navigation}.
	 * @param ctx the parse tree
	 */
	void exitNavigation(ODataParser.NavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectlist}.
	 * @param ctx the parse tree
	 */
	void enterSelectlist(ODataParser.SelectlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectlist}.
	 * @param ctx the parse tree
	 */
	void exitSelectlist(ODataParser.SelectlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectlistitem}.
	 * @param ctx the parse tree
	 */
	void enterSelectlistitem(ODataParser.SelectlistitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectlistitem}.
	 * @param ctx the parse tree
	 */
	void exitSelectlistitem(ODataParser.SelectlistitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#selectlistproperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectlistproperty(ODataParser.SelectlistpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#selectlistproperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectlistproperty(ODataParser.SelectlistpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#contextpropertypath}.
	 * @param ctx the parse tree
	 */
	void enterContextpropertypath(ODataParser.ContextpropertypathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#contextpropertypath}.
	 * @param ctx the parse tree
	 */
	void exitContextpropertypath(ODataParser.ContextpropertypathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qualifiedactionname}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedactionname(ODataParser.QualifiedactionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qualifiedactionname}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedactionname(ODataParser.QualifiedactionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qualifiedfunctionname}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedfunctionname(ODataParser.QualifiedfunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qualifiedfunctionname}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedfunctionname(ODataParser.QualifiedfunctionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexannotationinfragment}.
	 * @param ctx the parse tree
	 */
	void enterComplexannotationinfragment(ODataParser.ComplexannotationinfragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexannotationinfragment}.
	 * @param ctx the parse tree
	 */
	void exitComplexannotationinfragment(ODataParser.ComplexannotationinfragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityannotationinfragment}.
	 * @param ctx the parse tree
	 */
	void enterEntityannotationinfragment(ODataParser.EntityannotationinfragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityannotationinfragment}.
	 * @param ctx the parse tree
	 */
	void exitEntityannotationinfragment(ODataParser.EntityannotationinfragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#commonexpr}.
	 * @param ctx the parse tree
	 */
	void enterCommonexpr(ODataParser.CommonexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#commonexpr}.
	 * @param ctx the parse tree
	 */
	void exitCommonexpr(ODataParser.CommonexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boolcommonexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolcommonexpr(ODataParser.BoolcommonexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boolcommonexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolcommonexpr(ODataParser.BoolcommonexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#rootexpr}.
	 * @param ctx the parse tree
	 */
	void enterRootexpr(ODataParser.RootexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#rootexpr}.
	 * @param ctx the parse tree
	 */
	void exitRootexpr(ODataParser.RootexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#firstmemberexpr}.
	 * @param ctx the parse tree
	 */
	void enterFirstmemberexpr(ODataParser.FirstmemberexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#firstmemberexpr}.
	 * @param ctx the parse tree
	 */
	void exitFirstmemberexpr(ODataParser.FirstmemberexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#memberexpr}.
	 * @param ctx the parse tree
	 */
	void enterMemberexpr(ODataParser.MemberexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#memberexpr}.
	 * @param ctx the parse tree
	 */
	void exitMemberexpr(ODataParser.MemberexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#directmemberexpr}.
	 * @param ctx the parse tree
	 */
	void enterDirectmemberexpr(ODataParser.DirectmemberexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#directmemberexpr}.
	 * @param ctx the parse tree
	 */
	void exitDirectmemberexpr(ODataParser.DirectmemberexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#propertypathexpr}.
	 * @param ctx the parse tree
	 */
	void enterPropertypathexpr(ODataParser.PropertypathexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#propertypathexpr}.
	 * @param ctx the parse tree
	 */
	void exitPropertypathexpr(ODataParser.PropertypathexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#annotationexpr}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationexpr(ODataParser.AnnotationexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#annotationexpr}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationexpr(ODataParser.AnnotationexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#annotationinquery}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationinquery(ODataParser.AnnotationinqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#annotationinquery}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationinquery(ODataParser.AnnotationinqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#annotationinfragment}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationinfragment(ODataParser.AnnotationinfragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#annotationinfragment}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationinfragment(ODataParser.AnnotationinfragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#annotationqualifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationqualifier(ODataParser.AnnotationqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#annotationqualifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationqualifier(ODataParser.AnnotationqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#inscopevariableexpr}.
	 * @param ctx the parse tree
	 */
	void enterInscopevariableexpr(ODataParser.InscopevariableexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#inscopevariableexpr}.
	 * @param ctx the parse tree
	 */
	void exitInscopevariableexpr(ODataParser.InscopevariableexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#implicitvariableexpr}.
	 * @param ctx the parse tree
	 */
	void enterImplicitvariableexpr(ODataParser.ImplicitvariableexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#implicitvariableexpr}.
	 * @param ctx the parse tree
	 */
	void exitImplicitvariableexpr(ODataParser.ImplicitvariableexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#lambdavariableexpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdavariableexpr(ODataParser.LambdavariableexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#lambdavariableexpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdavariableexpr(ODataParser.LambdavariableexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#collectionnavigationexpr}.
	 * @param ctx the parse tree
	 */
	void enterCollectionnavigationexpr(ODataParser.CollectionnavigationexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#collectionnavigationexpr}.
	 * @param ctx the parse tree
	 */
	void exitCollectionnavigationexpr(ODataParser.CollectionnavigationexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#collectionnavnocastexpr}.
	 * @param ctx the parse tree
	 */
	void enterCollectionnavnocastexpr(ODataParser.CollectionnavnocastexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#collectionnavnocastexpr}.
	 * @param ctx the parse tree
	 */
	void exitCollectionnavnocastexpr(ODataParser.CollectionnavnocastexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singlenavigationexpr}.
	 * @param ctx the parse tree
	 */
	void enterSinglenavigationexpr(ODataParser.SinglenavigationexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singlenavigationexpr}.
	 * @param ctx the parse tree
	 */
	void exitSinglenavigationexpr(ODataParser.SinglenavigationexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#filterexpr}.
	 * @param ctx the parse tree
	 */
	void enterFilterexpr(ODataParser.FilterexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#filterexpr}.
	 * @param ctx the parse tree
	 */
	void exitFilterexpr(ODataParser.FilterexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexcolpathexpr}.
	 * @param ctx the parse tree
	 */
	void enterComplexcolpathexpr(ODataParser.ComplexcolpathexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexcolpathexpr}.
	 * @param ctx the parse tree
	 */
	void exitComplexcolpathexpr(ODataParser.ComplexcolpathexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#collectionpathexpr}.
	 * @param ctx the parse tree
	 */
	void enterCollectionpathexpr(ODataParser.CollectionpathexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#collectionpathexpr}.
	 * @param ctx the parse tree
	 */
	void exitCollectionpathexpr(ODataParser.CollectionpathexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexpathexpr}.
	 * @param ctx the parse tree
	 */
	void enterComplexpathexpr(ODataParser.ComplexpathexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexpathexpr}.
	 * @param ctx the parse tree
	 */
	void exitComplexpathexpr(ODataParser.ComplexpathexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivepathexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivepathexpr(ODataParser.PrimitivepathexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivepathexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivepathexpr(ODataParser.PrimitivepathexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boundfunctionexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoundfunctionexpr(ODataParser.BoundfunctionexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boundfunctionexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoundfunctionexpr(ODataParser.BoundfunctionexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#functionexpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionexpr(ODataParser.FunctionexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#functionexpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionexpr(ODataParser.FunctionexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#functionexprparameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionexprparameters(ODataParser.FunctionexprparametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#functionexprparameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionexprparameters(ODataParser.FunctionexprparametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#functionexprparameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionexprparameter(ODataParser.FunctionexprparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#functionexprparameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionexprparameter(ODataParser.FunctionexprparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#anyexpr}.
	 * @param ctx the parse tree
	 */
	void enterAnyexpr(ODataParser.AnyexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#anyexpr}.
	 * @param ctx the parse tree
	 */
	void exitAnyexpr(ODataParser.AnyexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void enterAllexpr(ODataParser.AllexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void exitAllexpr(ODataParser.AllexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#lambdapredicateexpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdapredicateexpr(ODataParser.LambdapredicateexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#lambdapredicateexpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdapredicateexpr(ODataParser.LambdapredicateexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#methodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodcallexpr(ODataParser.MethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#methodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodcallexpr(ODataParser.MethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#boolmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolmethodcallexpr(ODataParser.BoolmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#boolmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolmethodcallexpr(ODataParser.BoolmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#concatmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterConcatmethodcallexpr(ODataParser.ConcatmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#concatmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitConcatmethodcallexpr(ODataParser.ConcatmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#containsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterContainsmethodcallexpr(ODataParser.ContainsmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#containsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitContainsmethodcallexpr(ODataParser.ContainsmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#endswithmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterEndswithmethodcallexpr(ODataParser.EndswithmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#endswithmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitEndswithmethodcallexpr(ODataParser.EndswithmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#indexofmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexofmethodcallexpr(ODataParser.IndexofmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#indexofmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexofmethodcallexpr(ODataParser.IndexofmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#lengthmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterLengthmethodcallexpr(ODataParser.LengthmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#lengthmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitLengthmethodcallexpr(ODataParser.LengthmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#matchespatternmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterMatchespatternmethodcallexpr(ODataParser.MatchespatternmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#matchespatternmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitMatchespatternmethodcallexpr(ODataParser.MatchespatternmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#startswithmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterStartswithmethodcallexpr(ODataParser.StartswithmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#startswithmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitStartswithmethodcallexpr(ODataParser.StartswithmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#substringmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterSubstringmethodcallexpr(ODataParser.SubstringmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#substringmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitSubstringmethodcallexpr(ODataParser.SubstringmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#tolowermethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterTolowermethodcallexpr(ODataParser.TolowermethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#tolowermethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitTolowermethodcallexpr(ODataParser.TolowermethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#touppermethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterTouppermethodcallexpr(ODataParser.TouppermethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#touppermethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitTouppermethodcallexpr(ODataParser.TouppermethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#trimmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterTrimmethodcallexpr(ODataParser.TrimmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#trimmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitTrimmethodcallexpr(ODataParser.TrimmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#yearmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterYearmethodcallexpr(ODataParser.YearmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#yearmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitYearmethodcallexpr(ODataParser.YearmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#monthmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterMonthmethodcallexpr(ODataParser.MonthmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#monthmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitMonthmethodcallexpr(ODataParser.MonthmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#daymethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterDaymethodcallexpr(ODataParser.DaymethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#daymethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitDaymethodcallexpr(ODataParser.DaymethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hourmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterHourmethodcallexpr(ODataParser.HourmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hourmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitHourmethodcallexpr(ODataParser.HourmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#minutemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterMinutemethodcallexpr(ODataParser.MinutemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#minutemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitMinutemethodcallexpr(ODataParser.MinutemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#secondmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterSecondmethodcallexpr(ODataParser.SecondmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#secondmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitSecondmethodcallexpr(ODataParser.SecondmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fractionalsecondsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterFractionalsecondsmethodcallexpr(ODataParser.FractionalsecondsmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fractionalsecondsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitFractionalsecondsmethodcallexpr(ODataParser.FractionalsecondsmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#totalsecondsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterTotalsecondsmethodcallexpr(ODataParser.TotalsecondsmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#totalsecondsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitTotalsecondsmethodcallexpr(ODataParser.TotalsecondsmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#datemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterDatemethodcallexpr(ODataParser.DatemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#datemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitDatemethodcallexpr(ODataParser.DatemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#timemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterTimemethodcallexpr(ODataParser.TimemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#timemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitTimemethodcallexpr(ODataParser.TimemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#totaloffsetminutesmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterTotaloffsetminutesmethodcallexpr(ODataParser.TotaloffsetminutesmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#totaloffsetminutesmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitTotaloffsetminutesmethodcallexpr(ODataParser.TotaloffsetminutesmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#mindatetimemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterMindatetimemethodcallexpr(ODataParser.MindatetimemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#mindatetimemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitMindatetimemethodcallexpr(ODataParser.MindatetimemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#maxdatetimemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterMaxdatetimemethodcallexpr(ODataParser.MaxdatetimemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#maxdatetimemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitMaxdatetimemethodcallexpr(ODataParser.MaxdatetimemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#nowmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterNowmethodcallexpr(ODataParser.NowmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#nowmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitNowmethodcallexpr(ODataParser.NowmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#roundmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterRoundmethodcallexpr(ODataParser.RoundmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#roundmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitRoundmethodcallexpr(ODataParser.RoundmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#floormethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterFloormethodcallexpr(ODataParser.FloormethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#floormethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitFloormethodcallexpr(ODataParser.FloormethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ceilingmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterCeilingmethodcallexpr(ODataParser.CeilingmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ceilingmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitCeilingmethodcallexpr(ODataParser.CeilingmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#distancemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterDistancemethodcallexpr(ODataParser.DistancemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#distancemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitDistancemethodcallexpr(ODataParser.DistancemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geolengthmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterGeolengthmethodcallexpr(ODataParser.GeolengthmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geolengthmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitGeolengthmethodcallexpr(ODataParser.GeolengthmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#intersectsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterIntersectsmethodcallexpr(ODataParser.IntersectsmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#intersectsmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitIntersectsmethodcallexpr(ODataParser.IntersectsmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hassubsetmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterHassubsetmethodcallexpr(ODataParser.HassubsetmethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hassubsetmethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitHassubsetmethodcallexpr(ODataParser.HassubsetmethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hassubsequencemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterHassubsequencemethodcallexpr(ODataParser.HassubsequencemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hassubsequencemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitHassubsequencemethodcallexpr(ODataParser.HassubsequencemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#casemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void enterCasemethodcallexpr(ODataParser.CasemethodcallexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#casemethodcallexpr}.
	 * @param ctx the parse tree
	 */
	void exitCasemethodcallexpr(ODataParser.CasemethodcallexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#parenexpr}.
	 * @param ctx the parse tree
	 */
	void enterParenexpr(ODataParser.ParenexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#parenexpr}.
	 * @param ctx the parse tree
	 */
	void exitParenexpr(ODataParser.ParenexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#listexpr}.
	 * @param ctx the parse tree
	 */
	void enterListexpr(ODataParser.ListexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#listexpr}.
	 * @param ctx the parse tree
	 */
	void exitListexpr(ODataParser.ListexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(ODataParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(ODataParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrexpr(ODataParser.OrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#orexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrexpr(ODataParser.OrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#eqexpr}.
	 * @param ctx the parse tree
	 */
	void enterEqexpr(ODataParser.EqexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#eqexpr}.
	 * @param ctx the parse tree
	 */
	void exitEqexpr(ODataParser.EqexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#neexpr}.
	 * @param ctx the parse tree
	 */
	void enterNeexpr(ODataParser.NeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#neexpr}.
	 * @param ctx the parse tree
	 */
	void exitNeexpr(ODataParser.NeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ltexpr}.
	 * @param ctx the parse tree
	 */
	void enterLtexpr(ODataParser.LtexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ltexpr}.
	 * @param ctx the parse tree
	 */
	void exitLtexpr(ODataParser.LtexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#leexpr}.
	 * @param ctx the parse tree
	 */
	void enterLeexpr(ODataParser.LeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#leexpr}.
	 * @param ctx the parse tree
	 */
	void exitLeexpr(ODataParser.LeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#gtexpr}.
	 * @param ctx the parse tree
	 */
	void enterGtexpr(ODataParser.GtexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#gtexpr}.
	 * @param ctx the parse tree
	 */
	void exitGtexpr(ODataParser.GtexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geexpr}.
	 * @param ctx the parse tree
	 */
	void enterGeexpr(ODataParser.GeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geexpr}.
	 * @param ctx the parse tree
	 */
	void exitGeexpr(ODataParser.GeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#inexpr}.
	 * @param ctx the parse tree
	 */
	void enterInexpr(ODataParser.InexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#inexpr}.
	 * @param ctx the parse tree
	 */
	void exitInexpr(ODataParser.InexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hasexpr}.
	 * @param ctx the parse tree
	 */
	void enterHasexpr(ODataParser.HasexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hasexpr}.
	 * @param ctx the parse tree
	 */
	void exitHasexpr(ODataParser.HasexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(ODataParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(ODataParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(ODataParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(ODataParser.SubexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(ODataParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(ODataParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#divexpr}.
	 * @param ctx the parse tree
	 */
	void enterDivexpr(ODataParser.DivexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#divexpr}.
	 * @param ctx the parse tree
	 */
	void exitDivexpr(ODataParser.DivexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#divbyexpr}.
	 * @param ctx the parse tree
	 */
	void enterDivbyexpr(ODataParser.DivbyexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#divbyexpr}.
	 * @param ctx the parse tree
	 */
	void exitDivbyexpr(ODataParser.DivbyexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#modexpr}.
	 * @param ctx the parse tree
	 */
	void enterModexpr(ODataParser.ModexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#modexpr}.
	 * @param ctx the parse tree
	 */
	void exitModexpr(ODataParser.ModexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#negateexpr}.
	 * @param ctx the parse tree
	 */
	void enterNegateexpr(ODataParser.NegateexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#negateexpr}.
	 * @param ctx the parse tree
	 */
	void exitNegateexpr(ODataParser.NegateexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#notexpr}.
	 * @param ctx the parse tree
	 */
	void enterNotexpr(ODataParser.NotexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#notexpr}.
	 * @param ctx the parse tree
	 */
	void exitNotexpr(ODataParser.NotexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#isofexpr}.
	 * @param ctx the parse tree
	 */
	void enterIsofexpr(ODataParser.IsofexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#isofexpr}.
	 * @param ctx the parse tree
	 */
	void exitIsofexpr(ODataParser.IsofexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#castexpr}.
	 * @param ctx the parse tree
	 */
	void enterCastexpr(ODataParser.CastexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#castexpr}.
	 * @param ctx the parse tree
	 */
	void exitCastexpr(ODataParser.CastexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#arrayorobject}.
	 * @param ctx the parse tree
	 */
	void enterArrayorobject(ODataParser.ArrayorobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#arrayorobject}.
	 * @param ctx the parse tree
	 */
	void exitArrayorobject(ODataParser.ArrayorobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ODataParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ODataParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#object_1}.
	 * @param ctx the parse tree
	 */
	void enterObject_1(ODataParser.Object_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#object_1}.
	 * @param ctx the parse tree
	 */
	void exitObject_1(ODataParser.Object_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(ODataParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(ODataParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#valueinurl}.
	 * @param ctx the parse tree
	 */
	void enterValueinurl(ODataParser.ValueinurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#valueinurl}.
	 * @param ctx the parse tree
	 */
	void exitValueinurl(ODataParser.ValueinurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#begin_object}.
	 * @param ctx the parse tree
	 */
	void enterBegin_object(ODataParser.Begin_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#begin_object}.
	 * @param ctx the parse tree
	 */
	void exitBegin_object(ODataParser.Begin_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#end_object}.
	 * @param ctx the parse tree
	 */
	void enterEnd_object(ODataParser.End_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#end_object}.
	 * @param ctx the parse tree
	 */
	void exitEnd_object(ODataParser.End_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#begin_array}.
	 * @param ctx the parse tree
	 */
	void enterBegin_array(ODataParser.Begin_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#begin_array}.
	 * @param ctx the parse tree
	 */
	void exitBegin_array(ODataParser.Begin_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#end_array}.
	 * @param ctx the parse tree
	 */
	void enterEnd_array(ODataParser.End_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#end_array}.
	 * @param ctx the parse tree
	 */
	void exitEnd_array(ODataParser.End_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#quotation_mark}.
	 * @param ctx the parse tree
	 */
	void enterQuotation_mark(ODataParser.Quotation_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#quotation_mark}.
	 * @param ctx the parse tree
	 */
	void exitQuotation_mark(ODataParser.Quotation_markContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#name_separator}.
	 * @param ctx the parse tree
	 */
	void enterName_separator(ODataParser.Name_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#name_separator}.
	 * @param ctx the parse tree
	 */
	void exitName_separator(ODataParser.Name_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#value_separator}.
	 * @param ctx the parse tree
	 */
	void enterValue_separator(ODataParser.Value_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#value_separator}.
	 * @param ctx the parse tree
	 */
	void exitValue_separator(ODataParser.Value_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#stringinurl}.
	 * @param ctx the parse tree
	 */
	void enterStringinurl(ODataParser.StringinurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#stringinurl}.
	 * @param ctx the parse tree
	 */
	void exitStringinurl(ODataParser.StringinurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#charinjson}.
	 * @param ctx the parse tree
	 */
	void enterCharinjson(ODataParser.CharinjsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#charinjson}.
	 * @param ctx the parse tree
	 */
	void exitCharinjson(ODataParser.CharinjsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qchar_json_special}.
	 * @param ctx the parse tree
	 */
	void enterQchar_json_special(ODataParser.Qchar_json_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qchar_json_special}.
	 * @param ctx the parse tree
	 */
	void exitQchar_json_special(ODataParser.Qchar_json_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#escape}.
	 * @param ctx the parse tree
	 */
	void enterEscape(ODataParser.EscapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#escape}.
	 * @param ctx the parse tree
	 */
	void exitEscape(ODataParser.EscapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qualifiedtypename}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedtypename(ODataParser.QualifiedtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qualifiedtypename}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedtypename(ODataParser.QualifiedtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#optionallyqualifiedtypename}.
	 * @param ctx the parse tree
	 */
	void enterOptionallyqualifiedtypename(ODataParser.OptionallyqualifiedtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#optionallyqualifiedtypename}.
	 * @param ctx the parse tree
	 */
	void exitOptionallyqualifiedtypename(ODataParser.OptionallyqualifiedtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singlequalifiedtypename}.
	 * @param ctx the parse tree
	 */
	void enterSinglequalifiedtypename(ODataParser.SinglequalifiedtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singlequalifiedtypename}.
	 * @param ctx the parse tree
	 */
	void exitSinglequalifiedtypename(ODataParser.SinglequalifiedtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singletypename}.
	 * @param ctx the parse tree
	 */
	void enterSingletypename(ODataParser.SingletypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singletypename}.
	 * @param ctx the parse tree
	 */
	void exitSingletypename(ODataParser.SingletypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qualifiedentitytypename}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedentitytypename(ODataParser.QualifiedentitytypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qualifiedentitytypename}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedentitytypename(ODataParser.QualifiedentitytypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qualifiedcomplextypename}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedcomplextypename(ODataParser.QualifiedcomplextypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qualifiedcomplextypename}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedcomplextypename(ODataParser.QualifiedcomplextypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qualifiedtypedefinitionname}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedtypedefinitionname(ODataParser.QualifiedtypedefinitionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qualifiedtypedefinitionname}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedtypedefinitionname(ODataParser.QualifiedtypedefinitionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qualifiedenumtypename}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedenumtypename(ODataParser.QualifiedenumtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qualifiedenumtypename}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedenumtypename(ODataParser.QualifiedenumtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#optionallyqualifiedentitytypename}.
	 * @param ctx the parse tree
	 */
	void enterOptionallyqualifiedentitytypename(ODataParser.OptionallyqualifiedentitytypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#optionallyqualifiedentitytypename}.
	 * @param ctx the parse tree
	 */
	void exitOptionallyqualifiedentitytypename(ODataParser.OptionallyqualifiedentitytypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#optionallyqualifiedcomplextypename}.
	 * @param ctx the parse tree
	 */
	void enterOptionallyqualifiedcomplextypename(ODataParser.OptionallyqualifiedcomplextypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#optionallyqualifiedcomplextypename}.
	 * @param ctx the parse tree
	 */
	void exitOptionallyqualifiedcomplextypename(ODataParser.OptionallyqualifiedcomplextypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#namespace_1}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_1(ODataParser.Namespace_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#namespace_1}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_1(ODataParser.Namespace_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#namespacepart}.
	 * @param ctx the parse tree
	 */
	void enterNamespacepart(ODataParser.NamespacepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#namespacepart}.
	 * @param ctx the parse tree
	 */
	void exitNamespacepart(ODataParser.NamespacepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitysetname}.
	 * @param ctx the parse tree
	 */
	void enterEntitysetname(ODataParser.EntitysetnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitysetname}.
	 * @param ctx the parse tree
	 */
	void exitEntitysetname(ODataParser.EntitysetnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singletonentity}.
	 * @param ctx the parse tree
	 */
	void enterSingletonentity(ODataParser.SingletonentityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singletonentity}.
	 * @param ctx the parse tree
	 */
	void exitSingletonentity(ODataParser.SingletonentityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitytypename}.
	 * @param ctx the parse tree
	 */
	void enterEntitytypename(ODataParser.EntitytypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitytypename}.
	 * @param ctx the parse tree
	 */
	void exitEntitytypename(ODataParser.EntitytypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complextypename}.
	 * @param ctx the parse tree
	 */
	void enterComplextypename(ODataParser.ComplextypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complextypename}.
	 * @param ctx the parse tree
	 */
	void exitComplextypename(ODataParser.ComplextypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#typedefinitionname}.
	 * @param ctx the parse tree
	 */
	void enterTypedefinitionname(ODataParser.TypedefinitionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#typedefinitionname}.
	 * @param ctx the parse tree
	 */
	void exitTypedefinitionname(ODataParser.TypedefinitionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#enumerationtypename}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationtypename(ODataParser.EnumerationtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#enumerationtypename}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationtypename(ODataParser.EnumerationtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#enumerationmember}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationmember(ODataParser.EnumerationmemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#enumerationmember}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationmember(ODataParser.EnumerationmemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#termname}.
	 * @param ctx the parse tree
	 */
	void enterTermname(ODataParser.TermnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#termname}.
	 * @param ctx the parse tree
	 */
	void exitTermname(ODataParser.TermnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#odataidentifier}.
	 * @param ctx the parse tree
	 */
	void enterOdataidentifier(ODataParser.OdataidentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#odataidentifier}.
	 * @param ctx the parse tree
	 */
	void exitOdataidentifier(ODataParser.OdataidentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#identifierleadingcharacter}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierleadingcharacter(ODataParser.IdentifierleadingcharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#identifierleadingcharacter}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierleadingcharacter(ODataParser.IdentifierleadingcharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#identifiercharacter}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiercharacter(ODataParser.IdentifiercharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#identifiercharacter}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiercharacter(ODataParser.IdentifiercharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivetypename}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivetypename(ODataParser.PrimitivetypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivetypename}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivetypename(ODataParser.PrimitivetypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#abstractspatialtypename}.
	 * @param ctx the parse tree
	 */
	void enterAbstractspatialtypename(ODataParser.AbstractspatialtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#abstractspatialtypename}.
	 * @param ctx the parse tree
	 */
	void exitAbstractspatialtypename(ODataParser.AbstractspatialtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#concretespatialtypename}.
	 * @param ctx the parse tree
	 */
	void enterConcretespatialtypename(ODataParser.ConcretespatialtypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#concretespatialtypename}.
	 * @param ctx the parse tree
	 */
	void exitConcretespatialtypename(ODataParser.ConcretespatialtypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitiveproperty}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveproperty(ODataParser.PrimitivepropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitiveproperty}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveproperty(ODataParser.PrimitivepropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivekeyproperty}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivekeyproperty(ODataParser.PrimitivekeypropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivekeyproperty}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivekeyproperty(ODataParser.PrimitivekeypropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivenonkeyproperty}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivenonkeyproperty(ODataParser.PrimitivenonkeypropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivenonkeyproperty}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivenonkeyproperty(ODataParser.PrimitivenonkeypropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivecolproperty}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivecolproperty(ODataParser.PrimitivecolpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivecolproperty}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivecolproperty(ODataParser.PrimitivecolpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexproperty}.
	 * @param ctx the parse tree
	 */
	void enterComplexproperty(ODataParser.ComplexpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexproperty}.
	 * @param ctx the parse tree
	 */
	void exitComplexproperty(ODataParser.ComplexpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexcolproperty}.
	 * @param ctx the parse tree
	 */
	void enterComplexcolproperty(ODataParser.ComplexcolpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexcolproperty}.
	 * @param ctx the parse tree
	 */
	void exitComplexcolproperty(ODataParser.ComplexcolpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#streamproperty}.
	 * @param ctx the parse tree
	 */
	void enterStreamproperty(ODataParser.StreampropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#streamproperty}.
	 * @param ctx the parse tree
	 */
	void exitStreamproperty(ODataParser.StreampropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#navigationproperty}.
	 * @param ctx the parse tree
	 */
	void enterNavigationproperty(ODataParser.NavigationpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#navigationproperty}.
	 * @param ctx the parse tree
	 */
	void exitNavigationproperty(ODataParser.NavigationpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitynavigationproperty}.
	 * @param ctx the parse tree
	 */
	void enterEntitynavigationproperty(ODataParser.EntitynavigationpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitynavigationproperty}.
	 * @param ctx the parse tree
	 */
	void exitEntitynavigationproperty(ODataParser.EntitynavigationpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitycolnavigationproperty}.
	 * @param ctx the parse tree
	 */
	void enterEntitycolnavigationproperty(ODataParser.EntitycolnavigationpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitycolnavigationproperty}.
	 * @param ctx the parse tree
	 */
	void exitEntitycolnavigationproperty(ODataParser.EntitycolnavigationpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ODataParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ODataParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#actionimport}.
	 * @param ctx the parse tree
	 */
	void enterActionimport(ODataParser.ActionimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#actionimport}.
	 * @param ctx the parse tree
	 */
	void exitActionimport(ODataParser.ActionimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ODataParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ODataParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityfunction}.
	 * @param ctx the parse tree
	 */
	void enterEntityfunction(ODataParser.EntityfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityfunction}.
	 * @param ctx the parse tree
	 */
	void exitEntityfunction(ODataParser.EntityfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitycolfunction}.
	 * @param ctx the parse tree
	 */
	void enterEntitycolfunction(ODataParser.EntitycolfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitycolfunction}.
	 * @param ctx the parse tree
	 */
	void exitEntitycolfunction(ODataParser.EntitycolfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexfunction}.
	 * @param ctx the parse tree
	 */
	void enterComplexfunction(ODataParser.ComplexfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexfunction}.
	 * @param ctx the parse tree
	 */
	void exitComplexfunction(ODataParser.ComplexfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexcolfunction}.
	 * @param ctx the parse tree
	 */
	void enterComplexcolfunction(ODataParser.ComplexcolfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexcolfunction}.
	 * @param ctx the parse tree
	 */
	void exitComplexcolfunction(ODataParser.ComplexcolfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivefunction}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivefunction(ODataParser.PrimitivefunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivefunction}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivefunction(ODataParser.PrimitivefunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivecolfunction}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivecolfunction(ODataParser.PrimitivecolfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivecolfunction}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivecolfunction(ODataParser.PrimitivecolfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entityfunctionimport}.
	 * @param ctx the parse tree
	 */
	void enterEntityfunctionimport(ODataParser.EntityfunctionimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entityfunctionimport}.
	 * @param ctx the parse tree
	 */
	void exitEntityfunctionimport(ODataParser.EntityfunctionimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#entitycolfunctionimport}.
	 * @param ctx the parse tree
	 */
	void enterEntitycolfunctionimport(ODataParser.EntitycolfunctionimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#entitycolfunctionimport}.
	 * @param ctx the parse tree
	 */
	void exitEntitycolfunctionimport(ODataParser.EntitycolfunctionimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexfunctionimport}.
	 * @param ctx the parse tree
	 */
	void enterComplexfunctionimport(ODataParser.ComplexfunctionimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexfunctionimport}.
	 * @param ctx the parse tree
	 */
	void exitComplexfunctionimport(ODataParser.ComplexfunctionimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#complexcolfunctionimport}.
	 * @param ctx the parse tree
	 */
	void enterComplexcolfunctionimport(ODataParser.ComplexcolfunctionimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#complexcolfunctionimport}.
	 * @param ctx the parse tree
	 */
	void exitComplexcolfunctionimport(ODataParser.ComplexcolfunctionimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivefunctionimport}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivefunctionimport(ODataParser.PrimitivefunctionimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivefunctionimport}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivefunctionimport(ODataParser.PrimitivefunctionimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivecolfunctionimport}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivecolfunctionimport(ODataParser.PrimitivecolfunctionimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivecolfunctionimport}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivecolfunctionimport(ODataParser.PrimitivecolfunctionimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitiveliteral}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveliteral(ODataParser.PrimitiveliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitiveliteral}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveliteral(ODataParser.PrimitiveliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#primitivevalue}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivevalue(ODataParser.PrimitivevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#primitivevalue}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivevalue(ODataParser.PrimitivevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#nullvalue}.
	 * @param ctx the parse tree
	 */
	void enterNullvalue(ODataParser.NullvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#nullvalue}.
	 * @param ctx the parse tree
	 */
	void exitNullvalue(ODataParser.NullvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ODataParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ODataParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#binaryvalue}.
	 * @param ctx the parse tree
	 */
	void enterBinaryvalue(ODataParser.BinaryvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#binaryvalue}.
	 * @param ctx the parse tree
	 */
	void exitBinaryvalue(ODataParser.BinaryvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#base64b16}.
	 * @param ctx the parse tree
	 */
	void enterBase64b16(ODataParser.Base64b16Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#base64b16}.
	 * @param ctx the parse tree
	 */
	void exitBase64b16(ODataParser.Base64b16Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#base64b8}.
	 * @param ctx the parse tree
	 */
	void enterBase64b8(ODataParser.Base64b8Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#base64b8}.
	 * @param ctx the parse tree
	 */
	void exitBase64b8(ODataParser.Base64b8Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#base64char}.
	 * @param ctx the parse tree
	 */
	void enterBase64char(ODataParser.Base64charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#base64char}.
	 * @param ctx the parse tree
	 */
	void exitBase64char(ODataParser.Base64charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(ODataParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(ODataParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void enterDecimalvalue(ODataParser.DecimalvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void exitDecimalvalue(ODataParser.DecimalvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#doublevalue}.
	 * @param ctx the parse tree
	 */
	void enterDoublevalue(ODataParser.DoublevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#doublevalue}.
	 * @param ctx the parse tree
	 */
	void exitDoublevalue(ODataParser.DoublevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singlevalue}.
	 * @param ctx the parse tree
	 */
	void enterSinglevalue(ODataParser.SinglevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singlevalue}.
	 * @param ctx the parse tree
	 */
	void exitSinglevalue(ODataParser.SinglevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#naninfinity}.
	 * @param ctx the parse tree
	 */
	void enterNaninfinity(ODataParser.NaninfinityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#naninfinity}.
	 * @param ctx the parse tree
	 */
	void exitNaninfinity(ODataParser.NaninfinityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#guidvalue}.
	 * @param ctx the parse tree
	 */
	void enterGuidvalue(ODataParser.GuidvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#guidvalue}.
	 * @param ctx the parse tree
	 */
	void exitGuidvalue(ODataParser.GuidvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#bytevalue}.
	 * @param ctx the parse tree
	 */
	void enterBytevalue(ODataParser.BytevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#bytevalue}.
	 * @param ctx the parse tree
	 */
	void exitBytevalue(ODataParser.BytevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#sbytevalue}.
	 * @param ctx the parse tree
	 */
	void enterSbytevalue(ODataParser.SbytevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#sbytevalue}.
	 * @param ctx the parse tree
	 */
	void exitSbytevalue(ODataParser.SbytevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#int16value}.
	 * @param ctx the parse tree
	 */
	void enterInt16value(ODataParser.Int16valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#int16value}.
	 * @param ctx the parse tree
	 */
	void exitInt16value(ODataParser.Int16valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#int32value}.
	 * @param ctx the parse tree
	 */
	void enterInt32value(ODataParser.Int32valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#int32value}.
	 * @param ctx the parse tree
	 */
	void exitInt32value(ODataParser.Int32valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#int64value}.
	 * @param ctx the parse tree
	 */
	void enterInt64value(ODataParser.Int64valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#int64value}.
	 * @param ctx the parse tree
	 */
	void exitInt64value(ODataParser.Int64valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#string_1}.
	 * @param ctx the parse tree
	 */
	void enterString_1(ODataParser.String_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#string_1}.
	 * @param ctx the parse tree
	 */
	void exitString_1(ODataParser.String_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#squote_in_string}.
	 * @param ctx the parse tree
	 */
	void enterSquote_in_string(ODataParser.Squote_in_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#squote_in_string}.
	 * @param ctx the parse tree
	 */
	void exitSquote_in_string(ODataParser.Squote_in_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#datevalue}.
	 * @param ctx the parse tree
	 */
	void enterDatevalue(ODataParser.DatevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#datevalue}.
	 * @param ctx the parse tree
	 */
	void exitDatevalue(ODataParser.DatevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#datetimeoffsetvalue}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeoffsetvalue(ODataParser.DatetimeoffsetvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#datetimeoffsetvalue}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeoffsetvalue(ODataParser.DatetimeoffsetvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#datetimeoffsetvalueinurl}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeoffsetvalueinurl(ODataParser.DatetimeoffsetvalueinurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#datetimeoffsetvalueinurl}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeoffsetvalueinurl(ODataParser.DatetimeoffsetvalueinurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(ODataParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(ODataParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#durationvalue}.
	 * @param ctx the parse tree
	 */
	void enterDurationvalue(ODataParser.DurationvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#durationvalue}.
	 * @param ctx the parse tree
	 */
	void exitDurationvalue(ODataParser.DurationvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#timeofdayvalue}.
	 * @param ctx the parse tree
	 */
	void enterTimeofdayvalue(ODataParser.TimeofdayvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#timeofdayvalue}.
	 * @param ctx the parse tree
	 */
	void exitTimeofdayvalue(ODataParser.TimeofdayvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#timeofdayvalueinurl}.
	 * @param ctx the parse tree
	 */
	void enterTimeofdayvalueinurl(ODataParser.TimeofdayvalueinurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#timeofdayvalueinurl}.
	 * @param ctx the parse tree
	 */
	void exitTimeofdayvalueinurl(ODataParser.TimeofdayvalueinurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#onetonine}.
	 * @param ctx the parse tree
	 */
	void enterOnetonine(ODataParser.OnetonineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#onetonine}.
	 * @param ctx the parse tree
	 */
	void exitOnetonine(ODataParser.OnetonineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#zerotofiftynine}.
	 * @param ctx the parse tree
	 */
	void enterZerotofiftynine(ODataParser.ZerotofiftynineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#zerotofiftynine}.
	 * @param ctx the parse tree
	 */
	void exitZerotofiftynine(ODataParser.ZerotofiftynineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(ODataParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(ODataParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(ODataParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(ODataParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(ODataParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(ODataParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(ODataParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(ODataParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(ODataParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(ODataParser.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(ODataParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(ODataParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fractionalseconds}.
	 * @param ctx the parse tree
	 */
	void enterFractionalseconds(ODataParser.FractionalsecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fractionalseconds}.
	 * @param ctx the parse tree
	 */
	void exitFractionalseconds(ODataParser.FractionalsecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#enum_1}.
	 * @param ctx the parse tree
	 */
	void enterEnum_1(ODataParser.Enum_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#enum_1}.
	 * @param ctx the parse tree
	 */
	void exitEnum_1(ODataParser.Enum_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#enumvalue}.
	 * @param ctx the parse tree
	 */
	void enterEnumvalue(ODataParser.EnumvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#enumvalue}.
	 * @param ctx the parse tree
	 */
	void exitEnumvalue(ODataParser.EnumvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#singleenumvalue}.
	 * @param ctx the parse tree
	 */
	void enterSingleenumvalue(ODataParser.SingleenumvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#singleenumvalue}.
	 * @param ctx the parse tree
	 */
	void exitSingleenumvalue(ODataParser.SingleenumvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#enummembervalue}.
	 * @param ctx the parse tree
	 */
	void enterEnummembervalue(ODataParser.EnummembervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#enummembervalue}.
	 * @param ctx the parse tree
	 */
	void exitEnummembervalue(ODataParser.EnummembervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographycollection}.
	 * @param ctx the parse tree
	 */
	void enterGeographycollection(ODataParser.GeographycollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographycollection}.
	 * @param ctx the parse tree
	 */
	void exitGeographycollection(ODataParser.GeographycollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fullcollectionliteral}.
	 * @param ctx the parse tree
	 */
	void enterFullcollectionliteral(ODataParser.FullcollectionliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fullcollectionliteral}.
	 * @param ctx the parse tree
	 */
	void exitFullcollectionliteral(ODataParser.FullcollectionliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#collectionliteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionliteral(ODataParser.CollectionliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#collectionliteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionliteral(ODataParser.CollectionliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geoliteral}.
	 * @param ctx the parse tree
	 */
	void enterGeoliteral(ODataParser.GeoliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geoliteral}.
	 * @param ctx the parse tree
	 */
	void exitGeoliteral(ODataParser.GeoliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographylinestring}.
	 * @param ctx the parse tree
	 */
	void enterGeographylinestring(ODataParser.GeographylinestringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographylinestring}.
	 * @param ctx the parse tree
	 */
	void exitGeographylinestring(ODataParser.GeographylinestringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fulllinestringliteral}.
	 * @param ctx the parse tree
	 */
	void enterFulllinestringliteral(ODataParser.FulllinestringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fulllinestringliteral}.
	 * @param ctx the parse tree
	 */
	void exitFulllinestringliteral(ODataParser.FulllinestringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#linestringliteral}.
	 * @param ctx the parse tree
	 */
	void enterLinestringliteral(ODataParser.LinestringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#linestringliteral}.
	 * @param ctx the parse tree
	 */
	void exitLinestringliteral(ODataParser.LinestringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#linestringdata}.
	 * @param ctx the parse tree
	 */
	void enterLinestringdata(ODataParser.LinestringdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#linestringdata}.
	 * @param ctx the parse tree
	 */
	void exitLinestringdata(ODataParser.LinestringdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographymultilinestring}.
	 * @param ctx the parse tree
	 */
	void enterGeographymultilinestring(ODataParser.GeographymultilinestringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographymultilinestring}.
	 * @param ctx the parse tree
	 */
	void exitGeographymultilinestring(ODataParser.GeographymultilinestringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fullmultilinestringliteral}.
	 * @param ctx the parse tree
	 */
	void enterFullmultilinestringliteral(ODataParser.FullmultilinestringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fullmultilinestringliteral}.
	 * @param ctx the parse tree
	 */
	void exitFullmultilinestringliteral(ODataParser.FullmultilinestringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#multilinestringliteral}.
	 * @param ctx the parse tree
	 */
	void enterMultilinestringliteral(ODataParser.MultilinestringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#multilinestringliteral}.
	 * @param ctx the parse tree
	 */
	void exitMultilinestringliteral(ODataParser.MultilinestringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographymultipoint}.
	 * @param ctx the parse tree
	 */
	void enterGeographymultipoint(ODataParser.GeographymultipointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographymultipoint}.
	 * @param ctx the parse tree
	 */
	void exitGeographymultipoint(ODataParser.GeographymultipointContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fullmultipointliteral}.
	 * @param ctx the parse tree
	 */
	void enterFullmultipointliteral(ODataParser.FullmultipointliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fullmultipointliteral}.
	 * @param ctx the parse tree
	 */
	void exitFullmultipointliteral(ODataParser.FullmultipointliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#multipointliteral}.
	 * @param ctx the parse tree
	 */
	void enterMultipointliteral(ODataParser.MultipointliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#multipointliteral}.
	 * @param ctx the parse tree
	 */
	void exitMultipointliteral(ODataParser.MultipointliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographymultipolygon}.
	 * @param ctx the parse tree
	 */
	void enterGeographymultipolygon(ODataParser.GeographymultipolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographymultipolygon}.
	 * @param ctx the parse tree
	 */
	void exitGeographymultipolygon(ODataParser.GeographymultipolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fullmultipolygonliteral}.
	 * @param ctx the parse tree
	 */
	void enterFullmultipolygonliteral(ODataParser.FullmultipolygonliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fullmultipolygonliteral}.
	 * @param ctx the parse tree
	 */
	void exitFullmultipolygonliteral(ODataParser.FullmultipolygonliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#multipolygonliteral}.
	 * @param ctx the parse tree
	 */
	void enterMultipolygonliteral(ODataParser.MultipolygonliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#multipolygonliteral}.
	 * @param ctx the parse tree
	 */
	void exitMultipolygonliteral(ODataParser.MultipolygonliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographypoint}.
	 * @param ctx the parse tree
	 */
	void enterGeographypoint(ODataParser.GeographypointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographypoint}.
	 * @param ctx the parse tree
	 */
	void exitGeographypoint(ODataParser.GeographypointContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fullpointliteral}.
	 * @param ctx the parse tree
	 */
	void enterFullpointliteral(ODataParser.FullpointliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fullpointliteral}.
	 * @param ctx the parse tree
	 */
	void exitFullpointliteral(ODataParser.FullpointliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#sridliteral}.
	 * @param ctx the parse tree
	 */
	void enterSridliteral(ODataParser.SridliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#sridliteral}.
	 * @param ctx the parse tree
	 */
	void exitSridliteral(ODataParser.SridliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pointliteral}.
	 * @param ctx the parse tree
	 */
	void enterPointliteral(ODataParser.PointliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pointliteral}.
	 * @param ctx the parse tree
	 */
	void exitPointliteral(ODataParser.PointliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pointdata}.
	 * @param ctx the parse tree
	 */
	void enterPointdata(ODataParser.PointdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pointdata}.
	 * @param ctx the parse tree
	 */
	void exitPointdata(ODataParser.PointdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#positionliteral}.
	 * @param ctx the parse tree
	 */
	void enterPositionliteral(ODataParser.PositionliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#positionliteral}.
	 * @param ctx the parse tree
	 */
	void exitPositionliteral(ODataParser.PositionliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographypolygon}.
	 * @param ctx the parse tree
	 */
	void enterGeographypolygon(ODataParser.GeographypolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographypolygon}.
	 * @param ctx the parse tree
	 */
	void exitGeographypolygon(ODataParser.GeographypolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fullpolygonliteral}.
	 * @param ctx the parse tree
	 */
	void enterFullpolygonliteral(ODataParser.FullpolygonliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fullpolygonliteral}.
	 * @param ctx the parse tree
	 */
	void exitFullpolygonliteral(ODataParser.FullpolygonliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#polygonliteral}.
	 * @param ctx the parse tree
	 */
	void enterPolygonliteral(ODataParser.PolygonliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#polygonliteral}.
	 * @param ctx the parse tree
	 */
	void exitPolygonliteral(ODataParser.PolygonliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#polygondata}.
	 * @param ctx the parse tree
	 */
	void enterPolygondata(ODataParser.PolygondataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#polygondata}.
	 * @param ctx the parse tree
	 */
	void exitPolygondata(ODataParser.PolygondataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ringliteral}.
	 * @param ctx the parse tree
	 */
	void enterRingliteral(ODataParser.RingliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ringliteral}.
	 * @param ctx the parse tree
	 */
	void exitRingliteral(ODataParser.RingliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometrycollection}.
	 * @param ctx the parse tree
	 */
	void enterGeometrycollection(ODataParser.GeometrycollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometrycollection}.
	 * @param ctx the parse tree
	 */
	void exitGeometrycollection(ODataParser.GeometrycollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometrylinestring}.
	 * @param ctx the parse tree
	 */
	void enterGeometrylinestring(ODataParser.GeometrylinestringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometrylinestring}.
	 * @param ctx the parse tree
	 */
	void exitGeometrylinestring(ODataParser.GeometrylinestringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometrymultilinestring}.
	 * @param ctx the parse tree
	 */
	void enterGeometrymultilinestring(ODataParser.GeometrymultilinestringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometrymultilinestring}.
	 * @param ctx the parse tree
	 */
	void exitGeometrymultilinestring(ODataParser.GeometrymultilinestringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometrymultipoint}.
	 * @param ctx the parse tree
	 */
	void enterGeometrymultipoint(ODataParser.GeometrymultipointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometrymultipoint}.
	 * @param ctx the parse tree
	 */
	void exitGeometrymultipoint(ODataParser.GeometrymultipointContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometrymultipolygon}.
	 * @param ctx the parse tree
	 */
	void enterGeometrymultipolygon(ODataParser.GeometrymultipolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometrymultipolygon}.
	 * @param ctx the parse tree
	 */
	void exitGeometrymultipolygon(ODataParser.GeometrymultipolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometrypoint}.
	 * @param ctx the parse tree
	 */
	void enterGeometrypoint(ODataParser.GeometrypointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometrypoint}.
	 * @param ctx the parse tree
	 */
	void exitGeometrypoint(ODataParser.GeometrypointContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometrypolygon}.
	 * @param ctx the parse tree
	 */
	void enterGeometrypolygon(ODataParser.GeometrypolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometrypolygon}.
	 * @param ctx the parse tree
	 */
	void exitGeometrypolygon(ODataParser.GeometrypolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geographyprefix}.
	 * @param ctx the parse tree
	 */
	void enterGeographyprefix(ODataParser.GeographyprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geographyprefix}.
	 * @param ctx the parse tree
	 */
	void exitGeographyprefix(ODataParser.GeographyprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#geometryprefix}.
	 * @param ctx the parse tree
	 */
	void enterGeometryprefix(ODataParser.GeometryprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#geometryprefix}.
	 * @param ctx the parse tree
	 */
	void exitGeometryprefix(ODataParser.GeometryprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ODataParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ODataParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#content_id}.
	 * @param ctx the parse tree
	 */
	void enterContent_id(ODataParser.Content_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#content_id}.
	 * @param ctx the parse tree
	 */
	void exitContent_id(ODataParser.Content_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#isolation}.
	 * @param ctx the parse tree
	 */
	void enterIsolation(ODataParser.IsolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#isolation}.
	 * @param ctx the parse tree
	 */
	void exitIsolation(ODataParser.IsolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#request_id}.
	 * @param ctx the parse tree
	 */
	void enterRequest_id(ODataParser.Request_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#request_id}.
	 * @param ctx the parse tree
	 */
	void exitRequest_id(ODataParser.Request_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#odata_entityid}.
	 * @param ctx the parse tree
	 */
	void enterOdata_entityid(ODataParser.Odata_entityidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#odata_entityid}.
	 * @param ctx the parse tree
	 */
	void exitOdata_entityid(ODataParser.Odata_entityidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#odata_error}.
	 * @param ctx the parse tree
	 */
	void enterOdata_error(ODataParser.Odata_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#odata_error}.
	 * @param ctx the parse tree
	 */
	void exitOdata_error(ODataParser.Odata_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#odata_maxversion}.
	 * @param ctx the parse tree
	 */
	void enterOdata_maxversion(ODataParser.Odata_maxversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#odata_maxversion}.
	 * @param ctx the parse tree
	 */
	void exitOdata_maxversion(ODataParser.Odata_maxversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#odata_version}.
	 * @param ctx the parse tree
	 */
	void enterOdata_version(ODataParser.Odata_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#odata_version}.
	 * @param ctx the parse tree
	 */
	void exitOdata_version(ODataParser.Odata_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#prefer}.
	 * @param ctx the parse tree
	 */
	void enterPrefer(ODataParser.PreferContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#prefer}.
	 * @param ctx the parse tree
	 */
	void exitPrefer(ODataParser.PreferContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#preference}.
	 * @param ctx the parse tree
	 */
	void enterPreference(ODataParser.PreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#preference}.
	 * @param ctx the parse tree
	 */
	void exitPreference(ODataParser.PreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#allowentityreferencespreference}.
	 * @param ctx the parse tree
	 */
	void enterAllowentityreferencespreference(ODataParser.AllowentityreferencespreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#allowentityreferencespreference}.
	 * @param ctx the parse tree
	 */
	void exitAllowentityreferencespreference(ODataParser.AllowentityreferencespreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#callbackpreference}.
	 * @param ctx the parse tree
	 */
	void enterCallbackpreference(ODataParser.CallbackpreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#callbackpreference}.
	 * @param ctx the parse tree
	 */
	void exitCallbackpreference(ODataParser.CallbackpreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#continueonerrorpreference}.
	 * @param ctx the parse tree
	 */
	void enterContinueonerrorpreference(ODataParser.ContinueonerrorpreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#continueonerrorpreference}.
	 * @param ctx the parse tree
	 */
	void exitContinueonerrorpreference(ODataParser.ContinueonerrorpreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#includeannotationspreference}.
	 * @param ctx the parse tree
	 */
	void enterIncludeannotationspreference(ODataParser.IncludeannotationspreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#includeannotationspreference}.
	 * @param ctx the parse tree
	 */
	void exitIncludeannotationspreference(ODataParser.IncludeannotationspreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#annotationslist}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationslist(ODataParser.AnnotationslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#annotationslist}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationslist(ODataParser.AnnotationslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#annotationidentifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationidentifier(ODataParser.AnnotationidentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#annotationidentifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationidentifier(ODataParser.AnnotationidentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#excludeoperator}.
	 * @param ctx the parse tree
	 */
	void enterExcludeoperator(ODataParser.ExcludeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#excludeoperator}.
	 * @param ctx the parse tree
	 */
	void exitExcludeoperator(ODataParser.ExcludeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#maxpagesizepreference}.
	 * @param ctx the parse tree
	 */
	void enterMaxpagesizepreference(ODataParser.MaxpagesizepreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#maxpagesizepreference}.
	 * @param ctx the parse tree
	 */
	void exitMaxpagesizepreference(ODataParser.MaxpagesizepreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#omitvaluespreference}.
	 * @param ctx the parse tree
	 */
	void enterOmitvaluespreference(ODataParser.OmitvaluespreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#omitvaluespreference}.
	 * @param ctx the parse tree
	 */
	void exitOmitvaluespreference(ODataParser.OmitvaluespreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#respondasyncpreference}.
	 * @param ctx the parse tree
	 */
	void enterRespondasyncpreference(ODataParser.RespondasyncpreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#respondasyncpreference}.
	 * @param ctx the parse tree
	 */
	void exitRespondasyncpreference(ODataParser.RespondasyncpreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#returnpreference}.
	 * @param ctx the parse tree
	 */
	void enterReturnpreference(ODataParser.ReturnpreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#returnpreference}.
	 * @param ctx the parse tree
	 */
	void exitReturnpreference(ODataParser.ReturnpreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#trackchangespreference}.
	 * @param ctx the parse tree
	 */
	void enterTrackchangespreference(ODataParser.TrackchangespreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#trackchangespreference}.
	 * @param ctx the parse tree
	 */
	void exitTrackchangespreference(ODataParser.TrackchangespreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#waitpreference}.
	 * @param ctx the parse tree
	 */
	void enterWaitpreference(ODataParser.WaitpreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#waitpreference}.
	 * @param ctx the parse tree
	 */
	void exitWaitpreference(ODataParser.WaitpreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#obs_text}.
	 * @param ctx the parse tree
	 */
	void enterObs_text(ODataParser.Obs_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#obs_text}.
	 * @param ctx the parse tree
	 */
	void exitObs_text(ODataParser.Obs_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ows}.
	 * @param ctx the parse tree
	 */
	void enterOws(ODataParser.OwsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ows}.
	 * @param ctx the parse tree
	 */
	void exitOws(ODataParser.OwsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#bws_h}.
	 * @param ctx the parse tree
	 */
	void enterBws_h(ODataParser.Bws_hContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#bws_h}.
	 * @param ctx the parse tree
	 */
	void exitBws_h(ODataParser.Bws_hContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#eq_h}.
	 * @param ctx the parse tree
	 */
	void enterEq_h(ODataParser.Eq_hContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#eq_h}.
	 * @param ctx the parse tree
	 */
	void exitEq_h(ODataParser.Eq_hContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#rws}.
	 * @param ctx the parse tree
	 */
	void enterRws(ODataParser.RwsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#rws}.
	 * @param ctx the parse tree
	 */
	void exitRws(ODataParser.RwsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#bws}.
	 * @param ctx the parse tree
	 */
	void enterBws(ODataParser.BwsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#bws}.
	 * @param ctx the parse tree
	 */
	void exitBws(ODataParser.BwsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(ODataParser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(ODataParser.AtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(ODataParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(ODataParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(ODataParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(ODataParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(ODataParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(ODataParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(ODataParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(ODataParser.HashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(ODataParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(ODataParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(ODataParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(ODataParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(ODataParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(ODataParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#squote}.
	 * @param ctx the parse tree
	 */
	void enterSquote(ODataParser.SquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#squote}.
	 * @param ctx the parse tree
	 */
	void exitSquote(ODataParser.SquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(ODataParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(ODataParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(ODataParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(ODataParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(ODataParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(ODataParser.UriContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hier_part}.
	 * @param ctx the parse tree
	 */
	void enterHier_part(ODataParser.Hier_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hier_part}.
	 * @param ctx the parse tree
	 */
	void exitHier_part(ODataParser.Hier_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(ODataParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(ODataParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#authority}.
	 * @param ctx the parse tree
	 */
	void enterAuthority(ODataParser.AuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#authority}.
	 * @param ctx the parse tree
	 */
	void exitAuthority(ODataParser.AuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#userinfo}.
	 * @param ctx the parse tree
	 */
	void enterUserinfo(ODataParser.UserinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#userinfo}.
	 * @param ctx the parse tree
	 */
	void exitUserinfo(ODataParser.UserinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(ODataParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(ODataParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(ODataParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(ODataParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void enterIp_literal(ODataParser.Ip_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void exitIp_literal(ODataParser.Ip_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ipvfuture}.
	 * @param ctx the parse tree
	 */
	void enterIpvfuture(ODataParser.IpvfutureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ipvfuture}.
	 * @param ctx the parse tree
	 */
	void exitIpvfuture(ODataParser.IpvfutureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ipv6address}.
	 * @param ctx the parse tree
	 */
	void enterIpv6address(ODataParser.Ipv6addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ipv6address}.
	 * @param ctx the parse tree
	 */
	void exitIpv6address(ODataParser.Ipv6addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#h16}.
	 * @param ctx the parse tree
	 */
	void enterH16(ODataParser.H16Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#h16}.
	 * @param ctx the parse tree
	 */
	void exitH16(ODataParser.H16Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ls32}.
	 * @param ctx the parse tree
	 */
	void enterLs32(ODataParser.Ls32Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ls32}.
	 * @param ctx the parse tree
	 */
	void exitLs32(ODataParser.Ls32Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#ipv4address}.
	 * @param ctx the parse tree
	 */
	void enterIpv4address(ODataParser.Ipv4addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#ipv4address}.
	 * @param ctx the parse tree
	 */
	void exitIpv4address(ODataParser.Ipv4addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void enterDec_octet(ODataParser.Dec_octetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void exitDec_octet(ODataParser.Dec_octetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void enterReg_name(ODataParser.Reg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void exitReg_name(ODataParser.Reg_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#path_abempty}.
	 * @param ctx the parse tree
	 */
	void enterPath_abempty(ODataParser.Path_abemptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#path_abempty}.
	 * @param ctx the parse tree
	 */
	void exitPath_abempty(ODataParser.Path_abemptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#path_absolute}.
	 * @param ctx the parse tree
	 */
	void enterPath_absolute(ODataParser.Path_absoluteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#path_absolute}.
	 * @param ctx the parse tree
	 */
	void exitPath_absolute(ODataParser.Path_absoluteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#path_rootless}.
	 * @param ctx the parse tree
	 */
	void enterPath_rootless(ODataParser.Path_rootlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#path_rootless}.
	 * @param ctx the parse tree
	 */
	void exitPath_rootless(ODataParser.Path_rootlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(ODataParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(ODataParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#segment_nz}.
	 * @param ctx the parse tree
	 */
	void enterSegment_nz(ODataParser.Segment_nzContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#segment_nz}.
	 * @param ctx the parse tree
	 */
	void exitSegment_nz(ODataParser.Segment_nzContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pchar}.
	 * @param ctx the parse tree
	 */
	void enterPchar(ODataParser.PcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pchar}.
	 * @param ctx the parse tree
	 */
	void exitPchar(ODataParser.PcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ODataParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ODataParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#fragment_1}.
	 * @param ctx the parse tree
	 */
	void enterFragment_1(ODataParser.Fragment_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#fragment_1}.
	 * @param ctx the parse tree
	 */
	void exitFragment_1(ODataParser.Fragment_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void enterPct_encoded(ODataParser.Pct_encodedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void exitPct_encoded(ODataParser.Pct_encodedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved(ODataParser.UnreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved(ODataParser.UnreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void enterSub_delims(ODataParser.Sub_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void exitSub_delims(ODataParser.Sub_delimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#other_delims}.
	 * @param ctx the parse tree
	 */
	void enterOther_delims(ODataParser.Other_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#other_delims}.
	 * @param ctx the parse tree
	 */
	void exitOther_delims(ODataParser.Other_delimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pchar_no_squote}.
	 * @param ctx the parse tree
	 */
	void enterPchar_no_squote(ODataParser.Pchar_no_squoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pchar_no_squote}.
	 * @param ctx the parse tree
	 */
	void exitPchar_no_squote(ODataParser.Pchar_no_squoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pct_encoded_no_squote}.
	 * @param ctx the parse tree
	 */
	void enterPct_encoded_no_squote(ODataParser.Pct_encoded_no_squoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pct_encoded_no_squote}.
	 * @param ctx the parse tree
	 */
	void exitPct_encoded_no_squote(ODataParser.Pct_encoded_no_squoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qchar_no_amp}.
	 * @param ctx the parse tree
	 */
	void enterQchar_no_amp(ODataParser.Qchar_no_ampContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qchar_no_amp}.
	 * @param ctx the parse tree
	 */
	void exitQchar_no_amp(ODataParser.Qchar_no_ampContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qchar_no_amp_eq}.
	 * @param ctx the parse tree
	 */
	void enterQchar_no_amp_eq(ODataParser.Qchar_no_amp_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qchar_no_amp_eq}.
	 * @param ctx the parse tree
	 */
	void exitQchar_no_amp_eq(ODataParser.Qchar_no_amp_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qchar_no_amp_eq_at_dollar}.
	 * @param ctx the parse tree
	 */
	void enterQchar_no_amp_eq_at_dollar(ODataParser.Qchar_no_amp_eq_at_dollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qchar_no_amp_eq_at_dollar}.
	 * @param ctx the parse tree
	 */
	void exitQchar_no_amp_eq_at_dollar(ODataParser.Qchar_no_amp_eq_at_dollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qchar_no_amp_squote}.
	 * @param ctx the parse tree
	 */
	void enterQchar_no_amp_squote(ODataParser.Qchar_no_amp_squoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qchar_no_amp_squote}.
	 * @param ctx the parse tree
	 */
	void exitQchar_no_amp_squote(ODataParser.Qchar_no_amp_squoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qchar_no_amp_dquote}.
	 * @param ctx the parse tree
	 */
	void enterQchar_no_amp_dquote(ODataParser.Qchar_no_amp_dquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qchar_no_amp_dquote}.
	 * @param ctx the parse tree
	 */
	void exitQchar_no_amp_dquote(ODataParser.Qchar_no_amp_dquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#qchar_unescaped}.
	 * @param ctx the parse tree
	 */
	void enterQchar_unescaped(ODataParser.Qchar_unescapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#qchar_unescaped}.
	 * @param ctx the parse tree
	 */
	void exitQchar_unescaped(ODataParser.Qchar_unescapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pct_encoded_unescaped}.
	 * @param ctx the parse tree
	 */
	void enterPct_encoded_unescaped(ODataParser.Pct_encoded_unescapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pct_encoded_unescaped}.
	 * @param ctx the parse tree
	 */
	void exitPct_encoded_unescaped(ODataParser.Pct_encoded_unescapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#pct_encoded_no_dquote}.
	 * @param ctx the parse tree
	 */
	void enterPct_encoded_no_dquote(ODataParser.Pct_encoded_no_dquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#pct_encoded_no_dquote}.
	 * @param ctx the parse tree
	 */
	void exitPct_encoded_no_dquote(ODataParser.Pct_encoded_no_dquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#iri_in_header}.
	 * @param ctx the parse tree
	 */
	void enterIri_in_header(ODataParser.Iri_in_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#iri_in_header}.
	 * @param ctx the parse tree
	 */
	void exitIri_in_header(ODataParser.Iri_in_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#iri_in_query}.
	 * @param ctx the parse tree
	 */
	void enterIri_in_query(ODataParser.Iri_in_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#iri_in_query}.
	 * @param ctx the parse tree
	 */
	void exitIri_in_query(ODataParser.Iri_in_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(ODataParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(ODataParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(ODataParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(ODataParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void enterHexdig(ODataParser.HexdigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void exitHexdig(ODataParser.HexdigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#a_to_f}.
	 * @param ctx the parse tree
	 */
	void enterA_to_f(ODataParser.A_to_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#a_to_f}.
	 * @param ctx the parse tree
	 */
	void exitA_to_f(ODataParser.A_to_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#dquote}.
	 * @param ctx the parse tree
	 */
	void enterDquote(ODataParser.DquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#dquote}.
	 * @param ctx the parse tree
	 */
	void exitDquote(ODataParser.DquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(ODataParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(ODataParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#htab}.
	 * @param ctx the parse tree
	 */
	void enterHtab(ODataParser.HtabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#htab}.
	 * @param ctx the parse tree
	 */
	void exitHtab(ODataParser.HtabContext ctx);
	/**
	 * Enter a parse tree produced by {@link ODataParser#vchar}.
	 * @param ctx the parse tree
	 */
	void enterVchar(ODataParser.VcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ODataParser#vchar}.
	 * @param ctx the parse tree
	 */
	void exitVchar(ODataParser.VcharContext ctx);
}