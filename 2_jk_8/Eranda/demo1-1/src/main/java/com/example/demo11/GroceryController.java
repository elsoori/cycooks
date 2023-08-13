package com.example.demo11;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class GroceryController {

    HashMap<String, Grocery> groceryList = new HashMap<>();


    @PostMapping("/addList")
    public @ResponseBody String createGroceryList(@RequestBody Grocery grocery) {
        groceryList.put(grocery.getList(), grocery);
        return "Saved";
    }

    @GetMapping("/getAll")
    public @ResponseBody HashMap<String, Grocery> getAllLists() {
        return groceryList;
    }


    @DeleteMapping ("/deleteList/{list}")
    public @ResponseBody String deleteList(@PathVariable String list) {
        if(!groceryList.containsKey(list)) return "List not found";
        groceryList.remove(list);
        return "List Removed";
    }





}

