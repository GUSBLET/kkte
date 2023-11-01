package ccte.project.schedules.lecture.replacement;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "lecture_replacement")
public class LectureReplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class", columnDefinition = "varchar(20) not null ")
    private String group;

    @Column(name = "lesson_number", columnDefinition = "smallint")
    private short lessonNumber;

    @Column(name = "current_lecture", columnDefinition = "varchar(50) not null ")
    private String currentLecture;

    @Column(name = "current_teacher_lecture", columnDefinition = "varchar(50) not null ")
    private String currentTeacherLecture;

    @Column(name = "replacement_lecture", columnDefinition = "varchar(50) not null ")
    private String replacementLecture;

    @Column(name = "replacement_teacher_lecture", columnDefinition = "varchar(50) not null ")
    private String replacementTeacherLecture;

    @ManyToOne
    @JoinColumn(name = "lecture_replacement_date_id")
    private LectureReplacementDate lectureReplacementDate;
}
