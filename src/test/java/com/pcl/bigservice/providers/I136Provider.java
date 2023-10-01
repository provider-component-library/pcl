package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I136Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b14Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b20Provider.get(request);
		int p9Val = b25Provider.get(request);
		int p10Val = b27Provider.get(request);
		int p11Val = b28Provider.get(request);
		int p12Val = b30Provider.get(request);
		int p13Val = b31Provider.get(request);
		int p14Val = b34Provider.get(request);
		int p15Val = b41Provider.get(request);
		int p16Val = b43Provider.get(request);
		int p17Val = b46Provider.get(request);
		int p18Val = b47Provider.get(request);
		int p19Val = b48Provider.get(request);
		int p20Val = i139Provider.get(request);
		int p21Val = i140Provider.get(request);
		
        try {
            Thread.sleep(41);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p22Val = i147Provider.get(request);
		int p23Val = i149Provider.get(request);
		int p24Val = i150Provider.get(request);
		int p25Val = i151Provider.get(request);
		int p26Val = i152Provider.get(request);
		int p27Val = i156Provider.get(request);
		int p28Val = i159Provider.get(request);
		int p29Val = i166Provider.get(request);
		int p30Val = i170Provider.get(request);
		int p31Val = i172Provider.get(request);
		int p32Val = i173Provider.get(request);
		int p33Val = i174Provider.get(request);
		int p34Val = i177Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p35Val = i180Provider.get(request);
		int p36Val = i181Provider.get(request);
		int p37Val = i183Provider.get(request);
		int p38Val = i187Provider.get(request);
		
        try {
            Thread.sleep(76);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p39Val = i192Provider.get(request);
		int p40Val = i193Provider.get(request);
		int p41Val = i195Provider.get(request);
		int p42Val = i197Provider.get(request);
		int p43Val = i199Provider.get(request);
		int p44Val = i200Provider.get(request);

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
				p44Val;
    }
}
