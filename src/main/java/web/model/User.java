package web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 30, message = "Введите минимум 2 буквы и не более 30")
    @NotNull
    private String name;

    @Size(min = 2, max = 30, message = "Введите минимум 2 буквы и не более 30")
    @NotNull
    private String surname;

    @Email
    @NotEmpty(message = "Обязательное поле")
    private String email;

}
