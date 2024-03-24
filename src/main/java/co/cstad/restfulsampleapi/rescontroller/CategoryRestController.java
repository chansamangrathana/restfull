package co.cstad.restfulsampleapi.rescontroller;

import co.cstad.restfulsampleapi.dto.CategoryRequest;
import co.cstad.restfulsampleapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("ap1/v1/category")
public class CategoryRestController {
    @Autowired
    CategoryService categoryService;
    public Map<String,Object> createResponse(Object object, String message, int status){
        HashMap<String, Object> response=new HashMap<>();
        response.put("payload",object);
        response.put("messsage",message);
        response.put("status",status);
        return response;

}
    @GetMapping("/get-all")
    public Map<String,Object> getAllCategory(@RequestParam(defaultValue = "") String categoryName){
        return createResponse(categoryService.getAllCategory(categoryName)," DATA  Successfully", HttpStatus.OK.value());
    }
    @PostMapping("/add-new")
    public Map<String,Object> addCategory(@RequestBody CategoryRequest categoryRequest){
        return createResponse(categoryService.createCategory(categoryRequest),"Creat Category Successfully",HttpStatus.CREATED.value());
    }
    @PatchMapping("/{id}")
    public Map<String,Object> update(@PathVariable int id,@RequestBody CategoryRequest categoryRequest){
        return createResponse(categoryService.updateCategory(id,categoryRequest),"Update Category Successfully",HttpStatus.OK.value());
    }
    @GetMapping("/{id}")
    public Map<String,Object> findCategiryById(@PathVariable int id){
        return createResponse(categoryService.findCategoryById(id),"Find Category",HttpStatus.FOUND.value());
    }
    @DeleteMapping("/{id}")
    public Map<String,Object> deleteCategory(@PathVariable int id){
        categoryService.deleteProductById(id);
        return createResponse(new ArrayList<>(),"Delete Category Successfully",HttpStatus.OK.value());
    }
}
