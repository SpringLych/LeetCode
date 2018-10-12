package easy;


/**
 * @author SpringLych
 * @date 2018/10/12
 * You are given a string representing an attendance record for a student. The record only contains
 * the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent)
 * or more than two continuous 'L' (late).
 * <p>
 * You need to return whether the student could be rewarded according to his attendance record.
 * <p>
 * https://leetcode.com/problems/student-attendance-record-i/
 */
public class P551_StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int len = s.length();
        int indA = 0, couA=0, indL;
        while (indA < len){
            indA = s.indexOf("A",indA);
            if (indA > -1){ couA++;}
            else break;
            indA +=1;
        }
        indL = s.indexOf("LLL");
        System.out.println("A="+indA + ", L="+indL);
        if (couA <= 1 && indL < 0) return true;
        return false;
    }
}
