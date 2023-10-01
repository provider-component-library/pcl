package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I195Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b6Provider.get(request);
		
        try {
            Thread.sleep(59);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b7Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b12Provider.get(request);
		int p6Val = b13Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b17Provider.get(request);
		int p9Val = b21Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b28Provider.get(request);
		int p13Val = b31Provider.get(request);
		int p14Val = b32Provider.get(request);
		int p15Val = b33Provider.get(request);
		int p16Val = b34Provider.get(request);
		int p17Val = b36Provider.get(request);
		int p18Val = b39Provider.get(request);
		int p19Val = b41Provider.get(request);
		int p20Val = b44Provider.get(request);
		int p21Val = b46Provider.get(request);
		int p22Val = b48Provider.get(request);
		int p23Val = b50Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(28);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p24Val = i196Provider.get(request);
		int p25Val = i197Provider.get(request);

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
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val;
    }
}
