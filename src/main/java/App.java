/*
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import com.red.one.weather.EventClient;
import com.red.one.weather.dto.Embedded;
import com.red.one.weather.dto.Event;
import com.red.one.weather.dto.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot EntryPoint Class.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.red.one.weather")
@EnableAutoConfiguration
public class App implements ApplicationRunner {

  @Autowired
  private EventClient eventClient;

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void run(ApplicationArguments arg0) throws Exception {
    System.out.println("Hello World from Application Runner");
    Root test = eventClient.get("Barcelona", "2020-12-31T12:51:00Z");
    Embedded embedded = test.get_embedded();
    for (Event event:embedded.getEvents()) {
      System.out.println("Events :"+ event.toString());
      System.out.println("city: "+event.get_embedded().getVenues().get(0).getCity());

    }
  }
}
