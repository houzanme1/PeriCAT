/*
 * This project has received funding from the European Unions Seventh 
 * Framework Programme for research, technological development and 
 * demonstration under grant agreement no FP7-601138 PERICLES.
 * 
 * Copyright 2015 Anna Eggers, State- and Univeristy Library Goettingen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import algorithm.AbstractAlgorithm;
import algorithm.AbstractAlgorithmTest;
import algorithm.ZipPackaging;
import main.TestDataProvider;
import model.EncapsulationData;

public class DecapsulatorTest extends AbstractAlgorithmTest {

    @Test
    public void decapsulationTest() {
	EncapsulationData dataset = TestDataProvider.getDatasetBmp();
	AbstractAlgorithm algorithm = new ZipPackaging();
	File outputFile = Encapsulator.encapsulate(dataset, algorithm);
	assertNotNull(outputFile);
	assertTrue(outputFile.isFile());
	Decapsulator.decapsulate(algorithm, outputFile.toPath());
    }
}
