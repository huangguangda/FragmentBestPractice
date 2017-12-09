package cn.edu.gdmec.android.fragmentbestpractice;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Jack on 2017/12/10.
 */

public class NewsTitleFragment extends Fragment implements AdapterView.OnItemClickListener{
    private ListView newsTitleListView;
    private List<News> newsList;
    private NewsAdapter adapter;
    private boolean isTwoPane;
    @Override
    public void onAttach(Activity activity){
        super.onAttach ( activity );
        newsList = getNews();
        adapter = new NewsAdapter ( activity, R.layout.news_item, newsList );
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate ( R.layout.news_title_frag, container, false );
        newsTitleListView = (ListView) view.findViewById ( R.id.news_title_list_view );
        newsTitleListView.setAdapter ( adapter );
        newsTitleListView.setOnItemClickListener ( this );
        return view;
    }

}
