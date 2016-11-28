package android.marshon.likequanmintv.mvp.live;

import android.marshon.likequanmintv.bean.PlayBean;
import android.marshon.likequanmintv.librarys.http.delagate.IGetDataDelegate;
import android.marshon.likequanmintv.librarys.mvpbase.BasePresenterImpl;
import android.marshon.likequanmintv.mvp.live.interactor.LiveInteractor;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/11/22.
 */

public class LiveFragmentPresenterImpl extends BasePresenterImpl<LiveFragmentView>
        implements LiveFragmentPresenter {

    @Inject
    public LiveFragmentPresenterImpl(){

    }

    @Inject
    LiveInteractor mLiveInteractor;

    @Override
    public void onCreate() {
    }


    @Override
    public void loadPlayList() {
        mLiveInteractor.loadPlayList(new IGetDataDelegate<List<PlayBean>>(){

            @Override
            public void getDataSuccess(List<PlayBean> playBeanListHolderList) {
                mPresenterView.onPlayBeanList(playBeanListHolderList);

            }

            @Override
            public void getDataError(String errmsg) {

            }
        },"json/play/list.json");
    }

    @Override
    public void loadPlayListByUrl(String url) {
        mLiveInteractor.loadPlayList(new IGetDataDelegate<List<PlayBean>>(){

            @Override
            public void getDataSuccess(List<PlayBean> playBeanListHolderList) {
                mPresenterView.onPlayBeanList(playBeanListHolderList);

            }

            @Override
            public void getDataError(String errmsg) {

            }
        },""+url);

    }


    @Override
    public void addMorePlayList() {

    }
}
