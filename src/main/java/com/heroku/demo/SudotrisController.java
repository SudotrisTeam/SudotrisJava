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


    @RequestMapping(value = "/enregistrerScore/{score}/{name}", method = RequestMethod.GET)
    public List<Score> foo(@PathVariable("score") int score, @PathVariable("name") String name) throws IOException {
        List<Score> listeScore = new ArrayList<Score>();
/*
        int rang = 6;
        for (int i = 1 ; i <= 5 ; i++ )
        {
            if (Integer.getInteger(env.getProperty(i + ".name")) > score)
            {
                rang = i;
            }
        }
        System.setProperty("5.name",  "foooooooo");

        if (rang < 6)
        {
            for (int i = 5 ; i >= rang ; i-- )
            {
                System.setProperty(i + ".name",  env.getProperty(i + ".time"));
                env.getProperty(i + ".time");
            }
        }
*/
        for (int i = 1 ; i <= 5 ; i++ )
        {
            listeScore.add(new Score(env.getProperty(i + ".name"), env.getProperty(i + ".time")));
        }

        return listeScore;

    }

    @RequestMapping(value = "/id/{id}/reel", method = RequestMethod.GET)
    public int reel(@PathVariable("id") int id) {
        return id;
    }

}
