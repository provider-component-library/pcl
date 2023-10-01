package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I122Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i129Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b11Provider.get(request);
		int p5Val = b17Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b21Provider.get(request);
		int p8Val = b23Provider.get(request);
		int p9Val = b27Provider.get(request);
		int p10Val = b36Provider.get(request);
		int p11Val = b37Provider.get(request);
		int p12Val = b38Provider.get(request);
		int p13Val = b43Provider.get(request);
		int p14Val = b44Provider.get(request);
		int p15Val = b47Provider.get(request);
		int p16Val = i125Provider.get(request);
		int p17Val = i126Provider.get(request);
		int p18Val = i129Provider.get(request);
		
        try {
            Thread.sleep(85);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = i131Provider.get(request);
		int p20Val = i133Provider.get(request);
		int p21Val = i134Provider.get(request);
		int p22Val = i144Provider.get(request);
		int p23Val = i145Provider.get(request);
		int p24Val = i147Provider.get(request);
		int p25Val = i148Provider.get(request);
		int p26Val = i153Provider.get(request);
		int p27Val = i154Provider.get(request);
		
        try {
            Thread.sleep(82);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p28Val = i155Provider.get(request);
		int p29Val = i158Provider.get(request);
		int p30Val = i164Provider.get(request);
		int p31Val = i165Provider.get(request);
		int p32Val = i167Provider.get(request);
		
        try {
            Thread.sleep(29);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p33Val = i175Provider.get(request);
		int p34Val = i178Provider.get(request);
		int p35Val = i181Provider.get(request);
		int p36Val = i182Provider.get(request);
		int p37Val = i187Provider.get(request);
		int p38Val = i188Provider.get(request);
		int p39Val = i195Provider.get(request);
		int p40Val = i200Provider.get(request);

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
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val;
    }
}
