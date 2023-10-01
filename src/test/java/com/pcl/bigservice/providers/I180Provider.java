package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I180Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b6Provider.get(request);
		
        try {
            Thread.sleep(88);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(28);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p5Val = b7Provider.get(request);
		int p6Val = b9Provider.get(request);
		int p7Val = b10Provider.get(request);
		int p8Val = b22Provider.get(request);
		int p9Val = b26Provider.get(request);
		int p10Val = b28Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b30Provider.get(request);
		int p13Val = b33Provider.get(request);
		
        try {
            Thread.sleep(38);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b36Provider.get(request);
		int p15Val = b37Provider.get(request);
		int p16Val = b38Provider.get(request);
		int p17Val = b46Provider.get(request);
		int p18Val = b48Provider.get(request);
		int p19Val = i181Provider.get(request);
		int p20Val = i182Provider.get(request);
		int p21Val = i186Provider.get(request);
		int p22Val = i187Provider.get(request);
		int p23Val = i194Provider.get(request);
		int p24Val = i200Provider.get(request);

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
				p24Val;
    }
}
