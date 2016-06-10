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
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.env.Environment;

@RequestMapping("/sudotris")
@RestController
@PropertySource("classpath:score.properties")
public class SudotrisController {


    @Autowired
    private Environment env;

    private RecordRepository repository;

    @Autowired
    public SudotrisController(RecordRepository repository) {
        this.repository = repository;
    }


    @RequestMapping(value = "/enregistrerScore/{name}/{score}", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public Score foo(@PathVariable("difficulte") int difficulte) throws IOException {
/*
        String FILE_NAME = "score.txt";
        String OUTPUT_FILE_NAME = "C:\\Temp\\output.txt";
        Charset ENCODING = StandardCharsets.UTF_8;
            //treat as a small file
            List<String> lines;
            Path path = Paths.get(FILE_NAME);
            lines = Files.readAllLines(path, ENCODING);
            lines.add("This is a line added in code.");
*/


     //   Score score = new Score(env.getProperty("1.name"), env.getProperty("1.time"));
        Score score = new Score("e", "r");
        return score;

    }

    @RequestMapping(value = "/id/{id}/reel", method = RequestMethod.GET)
    public int reel(@PathVariable("id") int id) {
        return id;
    }

}
