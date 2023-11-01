//package ccte.project.news;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Builder
//@Table(name = "news")
//public class News {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "title", columnDefinition = "varchar(150) not null")
//    private String title;
//
//    @Column(name = "short_description", columnDefinition = "varchar(500) not null")
//    private String shortDescription;
//
//    @Column(name = "context", columnDefinition = "text not null")
//    private String context;
//
//    @Column(name = "create_time_at", nullable = false)
//    private LocalTime createTimeAt;
//
//    @Column(name = "create_date_at", nullable = false)
//    private LocalDate createDateAt;
//}
