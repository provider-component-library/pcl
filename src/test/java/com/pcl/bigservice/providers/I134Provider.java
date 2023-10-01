package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I134Provider extends InternalProvider<Integer> {
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
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b5Provider.get(request);
		
        try {
            Thread.sleep(74);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b6Provider.get(request);
		int p5Val = b7Provider.get(request);
		
        try {
            Thread.sleep(37);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b9Provider.get(request);
		int p7Val = b13Provider.get(request);
		int p8Val = b15Provider.get(request);
		int p9Val = b17Provider.get(request);
		int p10Val = b18Provider.get(request);
		int p11Val = b21Provider.get(request);
		int p12Val = b22Provider.get(request);
		int p13Val = b24Provider.get(request);
		int p14Val = b25Provider.get(request);
		int p15Val = b29Provider.get(request);
		int p16Val = b31Provider.get(request);
		int p17Val = b33Provider.get(request);
		int p18Val = b34Provider.get(request);
		int p19Val = b36Provider.get(request);
		int p20Val = b37Provider.get(request);
		int p21Val = b39Provider.get(request);
		int p22Val = b40Provider.get(request);
		int p23Val = b44Provider.get(request);
		int p24Val = b49Provider.get(request);
		int p25Val = i135Provider.get(request);
		int p26Val = i137Provider.get(request);
		int p27Val = i142Provider.get(request);
		int p28Val = i143Provider.get(request);
		int p29Val = i147Provider.get(request);
		int p30Val = i148Provider.get(request);
		int p31Val = i152Provider.get(request);
		int p32Val = i153Provider.get(request);
		int p33Val = i155Provider.get(request);
		int p34Val = i159Provider.get(request);
		int p35Val = i160Provider.get(request);
		int p36Val = i166Provider.get(request);
		int p37Val = i168Provider.get(request);
		int p38Val = i176Provider.get(request);
		int p39Val = i178Provider.get(request);
		int p40Val = i180Provider.get(request);
		int p41Val = i181Provider.get(request);
		int p42Val = i187Provider.get(request);
		int p43Val = i190Provider.get(request);
		
        try {
            Thread.sleep(77);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p44Val = i192Provider.get(request);
		int p45Val = i193Provider.get(request);

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
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val;
    }
}
