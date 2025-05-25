package lesson1.demo2;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@ToString(exclude = {"id"})

public class User {
   private int id;
   private String name;
   private boolean status;
   private double weight;
    }

//    public String greeting(String msg) {
//    return msg + " my name is - " + this.name;
//    }