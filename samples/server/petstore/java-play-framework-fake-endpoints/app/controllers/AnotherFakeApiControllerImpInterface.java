package controllers;

import apimodels.Client;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import static play.mvc.Results.ok;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class AnotherFakeApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result call123testSpecialTagsHttp(Http.Request request, Client body) throws Exception {
        Client obj = call123testSpecialTags(request, body);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract Client call123testSpecialTags(Http.Request request, Client body) throws Exception;

}
