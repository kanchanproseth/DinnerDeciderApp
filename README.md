# DinnerDeciderApp

Course: Mobile Device Application CS473

Assignment Name: Dinner Decider App

![alt text](https://github.com/kanchanproseth/DinnerDeciderApp/blob/main/screenshots/Screenshot_20231029_132452.png?raw=true)

### MainActivity

#### on click add food to Food List, show toast alert and clear text.
```kotlin
 private fun add() {
        addFoodButton?.setOnClickListener(View.OnClickListener {
            if (addFoodEditText!!.text!!.isNotEmpty()) {
                foodList.add(addFoodEditText?.text.toString())
                Toast.makeText(applicationContext,
                    R.string.successful_message, Toast.LENGTH_SHORT).show()
                addFoodEditText?.text?.clear()
            }
        })
    }
```

#### onClick Decide randomly select the food.
```kotlin
    private fun decide() {
        decideButton?.setOnClickListener(View.OnClickListener {
            titleTextView?.text = foodList.random()
        })
    }
```

