package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I152Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b9Provider.get(request);
		
        try {
            Thread.sleep(49);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p5Val = b10Provider.get(request);
		int p6Val = b12Provider.get(request);
		int p7Val = b22Provider.get(request);
		int p8Val = b23Provider.get(request);
		int p9Val = b26Provider.get(request);
		int p10Val = b27Provider.get(request);
		int p11Val = b34Provider.get(request);
		int p12Val = b38Provider.get(request);
		
        try {
            Thread.sleep(88);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p13Val = b40Provider.get(request);
		int p14Val = b43Provider.get(request);
		int p15Val = b45Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = b47Provider.get(request);
		int p18Val = i154Provider.get(request);
		int p19Val = i158Provider.get(request);
		int p20Val = i159Provider.get(request);
		int p21Val = i164Provider.get(request);
		int p22Val = i166Provider.get(request);
		int p23Val = i169Provider.get(request);
		int p24Val = i170Provider.get(request);
		int p25Val = i171Provider.get(request);
		int p26Val = i174Provider.get(request);
		int p27Val = i179Provider.get(request);
		int p28Val = i183Provider.get(request);
		int p29Val = i186Provider.get(request);
		int p30Val = i188Provider.get(request);
		int p31Val = i192Provider.get(request);
		
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p32Val = i195Provider.get(request);
		int p33Val = i197Provider.get(request);
		int p34Val = i199Provider.get(request);

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
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val;
    }
}
