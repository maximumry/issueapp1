package in.techcamp.issueapp1;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IssueRepository {
    @Insert("insert into issues (title, content, period, importance) vlaues (#{title}, #{content}, #{period}, #{importance})")
    void insert(String title, String content, String period, char importance);
}
