package com.geektechhw.homework3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.geektechhw.homework3_6.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val data = arrayListOf<Lesson>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = LessonAdapter(data)
        binding.recycler.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recycler.adapter = adapter
    }

    private fun loadData()
    {
       data.add(Lesson("https://media.istockphoto.com/vectors/geography-vector-id1257400947","Geography", R.color.blue))
       data.add(Lesson("https://cdn2.vectorstock.com/i/1000x1000/45/61/chemistry-school-lesson-and-classes-banner-flat-vector-33924561.jpg","Chemistry", R.color.teal_200))
       data.add(Lesson("https://thumbs.dreamstime.com/z/biology-lessons-school-classes-banner-flat-vector-illustration-isolated-logo-design-white-background-studying-196814760.jpg","Biology", R.color.green))
       data.add(Lesson("https://thumbs.dreamstime.com/z/banner-boy-girl-play-musical-instruments-vector-illustration-isolated-decorative-banner-boy-girl-playing-musical-235223173.jpg","Music", R.color.yellow))
       data.add(Lesson("https://thumbs.dreamstime.com/z/english-lessons-school-classes-banner-flat-vector-illustration-isolated-logo-symbol-design-white-background-language-196814336.jpg","English", R.color.orange))
        data.add(Lesson("https://as1.ftcdn.net/v2/jpg/03/66/89/34/1000_F_366893429_V98EOkHpT5XiWoQyCzYNSXAQmJJPkF75.jpg","History", R.color.brown))
        data.add(Lesson("https://image.shutterstock.com/image-vector/math-horizontal-banner-presentation-website-260nw-1859813464.jpg","Math", R.color.grey))
        data.add(Lesson("https://i.pinimg.com/736x/86/fe/e3/86fee37f61e77720f4cd1e4139de063f--logo-desing-pictogram.jpg","Kyrgyz language", R.color.red))
    }
}

