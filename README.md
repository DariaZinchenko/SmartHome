#Формула вычисления количества unit-тестов
Количество линейно независимых маршрутов через программный код (т.е. цикломатическая сложность) используется для определения количества тестов, необходимых для полного покрытия кода.

##Формулы вычисления цикломатической сложности:
`v(G) = B - D + 1` 
`v(G) = E - N + 2P`, где
`v(G)` - цикломатическая сложность,
`B` - количество branches,
`D` - количество точек принятия решения,
`E` - количество рёбер в графе,
`N` - количество узлов в графе,
`P` - количество компонент связности, для всх методов класса Radio.java = 1

Возьмем формулу - `v(G) = B - D + 1` 
значение `B` можно посмотреть на странице target/site/jacoco/index.html, количество branches можно посмотреть наведя курсор на ячейку Missed Branches данного метода.
значение `D` - насколько я поняла, это количество операторов ветвления, не поняла как вывести это значение в отчет JaCoCo.

#Рекомендуемый порог цикломатической сложности кода

Считается, что цикломатическая сложность модуля программы не должна превышать 10, однако в некоторых случаях может быть целесообразно ослабить ограничение.