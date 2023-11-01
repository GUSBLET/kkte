package ccte.project.schedules.lecture.replacement;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "week_count")
public class WeekCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "value", columnDefinition = "varchar(20)")
    private String value;

    @OneToMany(mappedBy = "weekCount", cascade = CascadeType.PERSIST)
    private Set<LectureReplacementDate> lectureReplacementDates = new HashSet<>();
}
