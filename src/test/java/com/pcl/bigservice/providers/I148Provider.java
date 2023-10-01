package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I148Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b7Provider.get(request);
		int p6Val = b8Provider.get(request);
		int p7Val = b9Provider.get(request);
		int p8Val = b11Provider.get(request);
		int p9Val = b14Provider.get(request);
		int p10Val = b16Provider.get(request);
		int p11Val = b17Provider.get(request);
		
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b20Provider.get(request);
		int p13Val = b21Provider.get(request);
		int p14Val = b23Provider.get(request);
		int p15Val = b30Provider.get(request);
		int p16Val = b31Provider.get(request);
		int p17Val = b36Provider.get(request);
		int p18Val = b37Provider.get(request);
		int p19Val = b40Provider.get(request);
		
        try {
            Thread.sleep(66);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p20Val = b41Provider.get(request);
		int p21Val = b44Provider.get(request);
		int p22Val = b45Provider.get(request);
		int p23Val = b46Provider.get(request);
		int p24Val = b50Provider.get(request);
		
        try {
            Thread.sleep(75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i150Provider.get(request);
		int p26Val = i152Provider.get(request);
		int p27Val = i155Provider.get(request);
		int p28Val = i159Provider.get(request);
		int p29Val = i162Provider.get(request);
		int p30Val = i164Provider.get(request);
		int p31Val = i167Provider.get(request);
		int p32Val = i168Provider.get(request);
		int p33Val = i172Provider.get(request);
		int p34Val = i173Provider.get(request);
		int p35Val = i178Provider.get(request);
		int p36Val = i179Provider.get(request);
		int p37Val = i184Provider.get(request);
		int p38Val = i185Provider.get(request);
		int p39Val = i193Provider.get(request);
		int p40Val = i194Provider.get(request);
		int p41Val = i200Provider.get(request);

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
				p40Val +
				p41Val;
    }
}
