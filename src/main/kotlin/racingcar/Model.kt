package racingcar

import camp.nextstep.edu.missionutils.Randoms

class Model {
    private fun getRandomNumber() = Randoms.pickNumberInRange(0, 9)

    private fun move(car: Car) {
        if (getRandomNumber() >= 4)
            car.go()
    }

    fun moveAll(cars: List<Car>) {
        cars.forEach { move(it) }
    }
}