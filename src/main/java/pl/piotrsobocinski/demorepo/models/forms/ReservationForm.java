package pl.piotrsobocinski.demorepo.models.forms;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationForm {

    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 25)
    private String name;
    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 25)
    private String lastname;
    @Getter
    @Setter
    @Pattern(regexp = "2[0-9]{3}-[0-9][0-9]-[0-9][0-9]" ) //message ="Write data"
    private String date;
    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 25)
    private String adres;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public LocalDate getFormatedDate() {
        //yy - mm - dd

        return LocalDate.parse(date, format);

    }

}