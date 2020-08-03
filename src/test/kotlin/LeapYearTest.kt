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

    @Test fun `All multiple of four years are leap`() {
        assertThat(leapYear.check(8), equalTo(true))
        assertThat(leapYear.check(24), equalTo(true))
        assertThat(leapYear.check(2004), equalTo(true))
    }

    @Test fun `Years divisible by four and by hundred are not leap`() {
        assertThat(leapYear.check(100), equalTo(false))
        assertThat(leapYear.check(1700), equalTo(false))
    }
}
