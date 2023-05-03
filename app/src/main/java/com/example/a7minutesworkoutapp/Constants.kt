package com.example.a7minutesworkoutapp

object Constants {
    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val JumpingJacks = ExerciseModel(
            1,"Jumping Jacks",
            R.drawable.jumping_jacks,
            false,false
        )
        exerciseList.add(JumpingJacks)
        val HighKnee = ExerciseModel(
            2,"High Knee",
            R.drawable.highknee,
            false,false
        )
        exerciseList.add(HighKnee)
        val Lunges = ExerciseModel(
            3,"Lunges",
            R.drawable.lunges,
            false,false
        )
        exerciseList.add(Lunges)
        val Plank = ExerciseModel(
            4,"Plank",
            R.drawable.plank,
            false,false
        )
        exerciseList.add(Plank)
        val Pushups = ExerciseModel(
            5,"Pushups",
            R.drawable.pushups,
            false,false
        )
        exerciseList.add(Pushups)
        val pushupsAndRotaion = ExerciseModel(
            6,"Pushups And Rotation",
            R.drawable.pushup_and_rotation,
            false,false
        )
        exerciseList.add(pushupsAndRotaion)
        val SidePlank = ExerciseModel(
            7,"SidePlank",
            R.drawable.side_plank,
            false,false
        )
        exerciseList.add(SidePlank)
        val Squats = ExerciseModel(
            8,"Squats",
            R.drawable.squats,
            false,false
        )
        exerciseList.add(Squats)
        val stepUpOnChair = ExerciseModel(
            9,"step Up on chair",
            R.drawable.stepup_on_chair,
            false,false
        )
        exerciseList.add(stepUpOnChair)
        val TricepDips = ExerciseModel(
            10,"Tricep Dips",
            R.drawable.tricep_dip_on_chair,
            false,false
        )
        exerciseList.add(TricepDips)
        val WallSit = ExerciseModel(
            11,"Wall Sit",
            R.drawable.wall_sit,
            false,false
        )
        exerciseList.add(WallSit)

        return exerciseList
    }
}