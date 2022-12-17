package menu.domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CoachesTest {

    @Test
    @DisplayName("코치 이름이 중복되면 에러를 발생한다.")
    fun duplicatedNameTest() {
        assertThrows<IllegalArgumentException> {
            Coaches(
                listOf(Coach("포비"), Coach("포비"))
            )
        }
    }

    @Test
    @DisplayName("정상적인 코치 생성자 테스트")
    fun coachesConstructorTest() {
        val coaches = Coaches(listOf(Coach("제임스"), Coach("포비")))
        assertThat(coaches.map { it.getName() }).containsAll(listOf("제임스", "포비"))

    }
}