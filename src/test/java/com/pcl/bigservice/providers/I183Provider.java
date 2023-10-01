package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I183Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b14Provider.get(request);
		int p6Val = b15Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b19Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b24Provider.get(request);
		int p11Val = b28Provider.get(request);
		int p12Val = b29Provider.get(request);
		int p13Val = b30Provider.get(request);
		int p14Val = b33Provider.get(request);
		int p15Val = b35Provider.get(request);
		int p16Val = b37Provider.get(request);
		int p17Val = b41Provider.get(request);
		int p18Val = b43Provider.get(request);
		int p19Val = b44Provider.get(request);
		int p20Val = b45Provider.get(request);
		
        try {
            Thread.sleep(57);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = b46Provider.get(request);
		
        try {
            Thread.sleep(67);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p22Val = b48Provider.get(request);
		int p23Val = b50Provider.get(request);
		int p24Val = i184Provider.get(request);
		
        try {
            Thread.sleep(87);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i191Provider.get(request);
		int p26Val = i194Provider.get(request);
		int p27Val = i195Provider.get(request);
		int p28Val = i197Provider.get(request);

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
				p25Val +
				p26Val +
				p27Val +
				p28Val;
    }
}
