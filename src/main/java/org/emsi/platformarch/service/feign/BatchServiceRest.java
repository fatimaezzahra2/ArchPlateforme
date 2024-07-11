package org.emsi.platformarch.service.feign;

import org.emsi.platformarch.requests.UploadRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@FeignClient(name = "BATCH-USE")
public interface BatchServiceRest {

    @PostMapping(path = "/batch")
    public void uploadData(@RequestParam("lat") double latitude,
                    @RequestParam("lon") double longitude,
                    @RequestParam("id") String projectId);

}
