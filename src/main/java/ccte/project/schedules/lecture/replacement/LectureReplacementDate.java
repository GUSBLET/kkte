package ccte.project.schedules.lecture.replacement;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "lecture_replacement_date")
public class LectureReplacementDate {
    @Id
    private long id;

    @Column(name = "replacement_date")
    private LocalDate replacementDate;

    @OneToMany(mappedBy = "lectureReplacementDate", cascade = CascadeType.PERSIST)
    private Set<LectureReplacement> lectureReplacements = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "week_count_id")
    private WeekCount weekCount;
}
