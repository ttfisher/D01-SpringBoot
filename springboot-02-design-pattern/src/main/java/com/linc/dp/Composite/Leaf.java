package com.linc.dp.Composite;

/**
 * 叶子结点
 *
 * @author Lin.C
 * @date 2019/6/11 8:03
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("I am a leaf ------> I am a pretty leaf.");
    }
}
