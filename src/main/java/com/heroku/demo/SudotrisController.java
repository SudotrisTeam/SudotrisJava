/*
 * Copyright 2015 Benedikt Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.heroku.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/sudotris")
@RestController
public class SudotrisController {


    private RecordRepository repository;

    @Autowired
    public SudotrisController(RecordRepository repository) {
        this.repository = repository;
    }


    @RequestMapping(value = "/fooTest", method = RequestMethod.GET)
    public String foo() {
        return "foo";
    }

    @RequestMapping(value = "/foooTest", method = RequestMethod.GET)
    public String fooo() {
        return "foo";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return name;
    }
    @RequestMapping(value = "/id/{id}/mock", method = RequestMethod.GET)
    public String mock(@PathVariable("id") int id) {
        return "foo";
    }
    @RequestMapping(value = "/id/{id}/reel", method = RequestMethod.GET)
    public int reel(@PathVariable("id") int id) {
        return id;
    }

}
