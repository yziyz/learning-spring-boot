package yz.learning.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "score")
public class Score implements Serializable {
    private static final long serialVersionUID = 8127035730921338189L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, name = "studentid")
    private String studentId;

    @Column(nullable = false, name = "subjectname")
    private String subjectName;

    @Column(nullable = false)
    private float score;

    @Column(nullable = false, name = "examtime")
    private Date examTime;

    public Score( ) {

    }

    public Score(int id, String studentId, String subjectName, float score, Date examTime) {
        this.id = id;
        this.studentId = studentId;
        this.subjectName = subjectName;
        this.score = score;
        this.examTime = examTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }
}
