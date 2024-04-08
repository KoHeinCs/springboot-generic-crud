package com.ashwetaw.springbootgenericcrud.generic;

import com.ashwetaw.springbootgenericcrud.common.ResponseHandler;
import com.ashwetaw.springbootgenericcrud.exception.ApplicationException;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

import static com.ashwetaw.springbootgenericcrud.common.ApiConstant.*;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
@RequiredArgsConstructor
public abstract class BaseController<D, ID extends Serializable> {

    private final BaseService baseService;


    @PostMapping(create)
    @Operation(summary = "Request body's id will be ignored by system")
    private ResponseEntity<Object> create(@RequestBody D dto) {
        return ResponseHandler.createHttpResponse(baseService.save(dto), "New entity was created successfully ", HttpStatus.CREATED);
    }

    @PostMapping(update)
    @Operation(summary = "Request body's id will be ignored by system")
    private ResponseEntity<Object> update(@PathVariable ID id, @RequestBody D dto) throws ApplicationException {
        return ResponseHandler.createHttpResponse(baseService.update(id, dto), "Entity was updated successfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping(all)
    private ResponseEntity<Object> getAll() {
        List<D> dtoList = baseService.findAll();
        return ResponseHandler.createHttpResponse(dtoList, "Requested entities  were given successfully", HttpStatus.OK);
    }

    @GetMapping(findById)
    public ResponseEntity<Object> getById(@PathVariable("id") ID id) throws ApplicationException {
        return ResponseHandler.createHttpResponse(baseService.findById(id), "Requested entity was given successfully", HttpStatus.OK);
    }

    @DeleteMapping(deleteById)
    public ResponseEntity<Object> delete(@PathVariable("id") ID id) throws ApplicationException{
        baseService.deleteById(id);
        return ResponseHandler.createHttpResponse("Requested entity with id =" + id + " was deleted successfully", HttpStatus.OK);
    }


}

