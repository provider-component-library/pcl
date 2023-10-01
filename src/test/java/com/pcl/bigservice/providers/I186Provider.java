package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I186Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b7Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b15Provider.get(request);
		int p5Val = b16Provider.get(request);
		
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b17Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b22Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b30Provider.get(request);
		int p11Val = b31Provider.get(request);
		
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b33Provider.get(request);
		int p13Val = b34Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b44Provider.get(request);
		
        try {
            Thread.sleep(58);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b46Provider.get(request);
		int p17Val = b48Provider.get(request);
		int p18Val = i187Provider.get(request);
		int p19Val = i188Provider.get(request);
		int p20Val = i190Provider.get(request);
		int p21Val = i196Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val;
    }
}
