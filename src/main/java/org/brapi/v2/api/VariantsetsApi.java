/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.brapi.v2.api;

import io.swagger.annotations.*;
import springfox.documentation.annotations.ApiIgnore;

import org.brapi.v2.model.CallListResponse;
import org.brapi.v2.model.CallSetsListResponse;
import org.brapi.v2.model.VariantListResponse;
import org.brapi.v2.model.VariantSetListResponse;
import org.brapi.v2.model.VariantSetResponse;
import org.brapi.v2.model.VariantSetsExtractRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T12:30:12.318Z[GMT]")
@Api(value = "variantsets", description = "the variantsets API")
public interface VariantsetsApi {

	public static final String variantsetsGet_url = "variantsets";
	
	public static final String variantsetsGetCalls_url = "variantsets/{variantSetDbId}/calls";
	public static final String variantsetsGetExportFile_url = "variantsets/{variantSetDbId}/export/{dataFormat}";
	
//    @ApiOperation(value = "Create new `VariantSet` based on search results", nickname = "variantsetsExtractPost", notes = "`POST /variantsets/extract` will perform a search for `Calls` which match the search criteria in `variantSetsExtractRequest` The results of the search will be used to create a new `VariantSet` on the server. The new `VariantSet` will be returned.", response = VariantSetResponse.class, authorizations = {
//        @Authorization(value = "AuthorizationToken")    }, tags={ "Variant Sets", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "OK", response = VariantSetResponse.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
//        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
//    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/variantsets/extract",
//        produces = { "application/json" }, 
//        consumes = { "application/json" },
//        method = RequestMethod.POST)
//    ResponseEntity<VariantSetResponse> variantsetsExtractPost(@ApiParam(value = "Study Search request"  )  @Valid @RequestBody VariantSetsExtractRequest body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);
//
//
	
//    @Operation(summary = "Gets a filtered list of `VariantSets`.", description = "Will return a filtered list of `VariantSet`.", security = {
//            @SecurityRequirement(name = "AuthorizationToken")    }, tags={ "Variant Sets" })
//        @ApiResponses(value = { 
//            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = VariantSetsListResponse.class))),
//            
//            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = String.class))),
//            
//            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = String.class))),
//            
//            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = String.class))) })
//        @RequestMapping(value = "/variantsets",
//            produces = { "application/json" }, 
//            method = RequestMethod.GET)
//        ResponseEntity<VariantSetsListResponse> variantsetsGet(@ApiParam(value = "The ID of the `VariantSet` to be retrieved." ,schema=@Schema()) @Valid @RequestParam(value = "variantSetDbId", required = false) String variantSetDbId, @ApiParam(value = "The ID of the `Variant` to be retrieved." ,schema=@Schema()) @Valid @RequestParam(value = "variantDbId", required = false) String variantDbId, @ApiParam(value = "The ID of the `CallSet` to be retrieved." ,schema=@Schema()) @Valid @RequestParam(value = "callSetDbId", required = false) String callSetDbId, @ApiParam(value = "Filter by study DbId" ,schema=@Schema()) @Valid @RequestParam(value = "studyDbId", required = false) String studyDbId, @ApiParam(value = "Filter by study name" ,schema=@Schema()) @Valid @RequestParam(value = "studyName", required = false) String studyName, @ApiParam(value = "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`." ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "The size of the pages to be returned. Default is `1000`." ,schema=@Schema()) @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @Parameter(in = ParameterIn.HEADER, description = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ,schema=@Schema()) @RequestHeader(value="Authorization", required=false) String authorization);

    
    @ApiOperation(value = "Gets a filtered list of `VariantSets`.", nickname = "variantsetsGet", notes = "`GET /variantsets` will return a filtered list of `VariantSet`.", response = VariantSetListResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")    }, tags={ "Variant Sets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A successful response.", response = VariantSetListResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + variantsetsGet_url,
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VariantSetListResponse> variantsetsGet(	@ApiParam(value = "The ID of the `VariantSet` to be retrieved." ) @Valid @RequestParam(value = "variantSetDbId", required = false) String variantSetDbId,
    														@ApiParam(value = "The ID of the `Variant` to be retrieved.") @Valid @RequestParam(value = "variantDbId", required = false) String variantDbId,
    														@ApiParam(value = "The ID of the `CallSet` to be retrieved.") @Valid @RequestParam(value = "callSetDbId", required = false) String callSetDbId,
    														@ApiParam(value = "Filter by study DbId") @Valid @RequestParam(value = "studyDbId", required = false) String studyDbId,
    														@ApiParam(value = "Filter by study name") @Valid @RequestParam(value = "studyName", required = false) String studyName,
    														@ApiParam(value = "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`." ) @Valid @RequestParam(value = "page", required = false) Integer page,
    														@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
    											    		@RequestHeader(value="Authorization", required=false) String authorization);

    @ApiOperation(value = "Gets a list of `Calls` associated with a `VariantSet`.", nickname = "variantsetsVariantSetDbIdCallsGet", notes = " Gets a list of `Calls` associated with a `VariantSet`. Also See: `GET /calls?variantSetDbId={variantSetDbId}` ", response = CallListResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")    }, tags={ "Variant Sets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CallListResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + variantsetsGetCalls_url,
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CallListResponse> variantsetsVariantSetDbIdCallsGet(	@ApiParam(value = "The ID of the `VariantSet` to be retrieved.",required=true) @PathVariable("variantSetDbId") String variantSetDbId,
    																	@ApiParam(value = "Should homozygotes be expanded (true) or collapsed into a single occurence (false)") @Valid @RequestParam(value = "expandHomozygotes", required = false) Boolean expandHomozygotes,
    																	@ApiParam(value = "The string to use as a representation for missing data") @Valid @RequestParam(value = "unknownString", required = false) String unknownString,
    																	@ApiParam(value = "The string to use as a separator for phased allele calls") @Valid @RequestParam(value = "sepPhased", required = false) String sepPhased,
    																	@ApiParam(value = "The string to use as a separator for unphased allele calls") @Valid @RequestParam(value = "sepUnphased", required = false) String sepUnphased,
    																	@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,
    																	@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
    																	@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws UnsupportedEncodingException;
//
//
//    @ApiOperation(value = "Gets a list of `CallSets` associated with a `VariantSet`.", nickname = "variantsetsVariantSetDbIdCallsetsGet", notes = " Gets a list of `CallSets` associated with a `VariantSet`. Also See: `GET /callsets?variantSetDbId={variantSetDbId}` ", response = CallSetsListResponse.class, authorizations = {
//        @Authorization(value = "AuthorizationToken")    }, tags={ "Variant Sets", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "A successful response.", response = CallSetsListResponse.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
//    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/variantsets/{variantSetDbId}/callsets",
//        produces = { "application/json" }, 
//        method = RequestMethod.GET)
//    ResponseEntity<CallSetsListResponse> variantsetsVariantSetDbIdCallsetsGet(@ApiParam(value = "The ID of the `VariantSet` to be retrieved.",required=true) @PathVariable("variantSetDbId") String variantSetDbId,@ApiParam(value = "The ID of the `CallSet` to be retrieved.") @Valid @RequestParam(value = "callSetDbId", required = false) String callSetDbId,@ApiParam(value = "The human readbale name of the `CallSet` to be retrieved.") @Valid @RequestParam(value = "callSetName", required = false) String callSetName,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);
//
//
    @ApiOperation(value = "Gets a `VariantSet` by ID.", nickname = "variantsetsVariantSetDbIdGet", notes = "`GET /variantsets/{variantSetDbId}` will return a JSON version of `VariantSet`.", response = VariantSetResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")    }, tags={ "Variant Sets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VariantSetResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/variantsets/{variantSetDbId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VariantSetResponse> variantsetsVariantSetDbIdGet(@ApiParam(value = "The ID of the `VariantSet` to be retrieved.",required=true) @PathVariable("variantSetDbId") String variantSetDbId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);
//
//
//    @ApiOperation(value = "Gets a `VariantSet` by ID.", nickname = "variantsetsVariantSetDbIdVariantsGet", notes = "`GET /variantsets/{variant_set_id}` will return a JSON version of `VariantSet`.", response = VariantListResponse.class, authorizations = {
//        @Authorization(value = "AuthorizationToken")    }, tags={ "Variant Sets", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 200, message = "A successful response.", response = VariantListResponse.class),
//        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
//        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
//    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + "/variantsets/{variantSetDbId}/variants",
//        produces = { "application/json" }, 
//        method = RequestMethod.GET)
//    ResponseEntity<VariantListResponse> variantsetsVariantSetDbIdVariantsGet(@ApiParam(value = "The ID of the `VariantSet` to be retrieved.",required=true) @PathVariable("variantSetDbId") String variantSetDbId,@ApiParam(value = "The ID of the `Variant` to be retrieved.") @Valid @RequestParam(value = "variantDbId", required = false) String variantDbId,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization);

    @ApiIgnore
    @RequestMapping(value = ServerinfoApi.URL_BASE_PREFIX + variantsetsGetExportFile_url,
            produces = { "application/json" }, 
            method = RequestMethod.GET)
        void variantsetsExportIntoFormat(HttpServletResponse response,
        		@ApiParam(value = "The ID of the `VariantSet` to be retrieved.",required=true) @PathVariable("variantSetDbId") String variantSetDbId,
        		@ApiParam(value = "The data format retrieve data in (only 'flapjack' is supported at the moment).",required=true) @PathVariable("dataFormat") String dataFormat,
        		@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws Exception;
}
