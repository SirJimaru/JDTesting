/*
 * Copyright 2007-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springbyexample.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * Person bean.
 *
<<<<<<< HEAD
 * @author Ajay Jirati Second testing
=======
 * @author Ajay Jirati - Master Conflict Testing 
>>>>>>> upstream/master
 */
public class Person {

    private String firstName;

    @NotNull
    private String lastName;

    @Min(value = 18, message = "You have to be 18 to drive a car", groups = AgeCheck.class)
    public int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
