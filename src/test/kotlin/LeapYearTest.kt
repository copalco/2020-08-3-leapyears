import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

class LeapYearTest {

    private val leapYear: LeapYear = LeapYear()

    @Test fun `Year is not leap`() {
        assertThat(leapYear.check(1), equalTo(false))
    }

    @Test fun `Fourth year is leap`() {
        assertThat(leapYear.check(4), equalTo(true))
    }
}
