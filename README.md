# BaseProject
### One module for build new Project quickily 

- 创建mvp模块基础Contact
```
public class OrderContact {

    /**
     * 对应界面实现View 方法
     */
    public interface View extends BaseView {
    }

    /**
     * 在presenter接口编写对应方法
     */
    interface Presenter extends BasePresenter {

    }
}

```
- 创建mvp模块 基础Presenter

```
public class OrderPresenter implements OrderContact.Presenter {
    private OrderContact.View view;

    public OrderPresenter(OrderContact.View view) {
        this.view = view;
    }
    @Override
    public void start() {

    }
}
```
- 编写mvp模块 Presenter中数据返回后操作
```
if (view.isActive()) {
            view.showLoading("");
        }
        ApiService.orderList(orderListBean, new OnLoadListener() {
            @Override
            public void onSuccess(Object o) {
                if (view.isActive()) {
                    view.setData(o, 1);
                    view.hideLoading();
                    view.showMessage("加载成功");
                }
            }
            @Override
            public void onFailed(String msg) {
                if (view.isActive()) {
                    view.hideLoading();
                    view.showMessage(TextUtils.isEmpty(msg) ? "请求失败" : msg);
                }

            }
        });
```
```
    只需要在Contact中声明方法并在Presenter实现对应方法并实现该操作即可
```



---

> 这只是一个基础的小mvp项目需要的方法简单解析, 朋友们有建议敬请提交
