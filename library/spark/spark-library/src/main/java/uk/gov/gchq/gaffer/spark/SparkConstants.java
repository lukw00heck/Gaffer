/*
 * Copyright 2017. Crown Copyright
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

package uk.gov.gchq.gaffer.spark;

import org.apache.spark.serializer.KryoSerializer;

import uk.gov.gchq.gaffer.spark.serialisation.kryo.Registrator;

/**
 * Utility class containing constants for use with the Spark library.
 */
public final class SparkConstants {
    public static final String KRYO_REGISTRATOR = "spark.kryo.registrator";
    public static final String SERIALIZER = "spark.serializer";
    public static final String DRIVER_ALLOW_MULTIPLE_CONTEXTS = "spark.driver.allowMultipleContexts";

    public static final String DEFAULT_KRYO_REGISTRATOR = Registrator.class.getName();
    public static final String DEFAULT_SERIALIZER = KryoSerializer.class.getName();

    private SparkConstants() {
        // Private constructor to prevent instantiation.
    }
}
