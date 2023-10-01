package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I52Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
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
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i58Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i127Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i132Provider;
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
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b7Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b11Provider.get(request);
		
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b12Provider.get(request);
		int p7Val = b14Provider.get(request);
		int p8Val = b16Provider.get(request);
		int p9Val = b17Provider.get(request);
		int p10Val = b20Provider.get(request);
		int p11Val = b21Provider.get(request);
		int p12Val = b23Provider.get(request);
		int p13Val = b27Provider.get(request);
		int p14Val = b28Provider.get(request);
		int p15Val = b31Provider.get(request);
		int p16Val = b34Provider.get(request);
		int p17Val = b39Provider.get(request);
		int p18Val = b40Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = b48Provider.get(request);
		int p21Val = b50Provider.get(request);
		int p22Val = i54Provider.get(request);
		int p23Val = i58Provider.get(request);
		int p24Val = i65Provider.get(request);
		int p25Val = i66Provider.get(request);
		int p26Val = i67Provider.get(request);
		int p27Val = i68Provider.get(request);
		int p28Val = i74Provider.get(request);
		int p29Val = i77Provider.get(request);
		int p30Val = i78Provider.get(request);
		int p31Val = i84Provider.get(request);
		int p32Val = i85Provider.get(request);
		int p33Val = i93Provider.get(request);
		int p34Val = i94Provider.get(request);
		int p35Val = i95Provider.get(request);
		int p36Val = i97Provider.get(request);
		int p37Val = i99Provider.get(request);
		int p38Val = i101Provider.get(request);
		int p39Val = i102Provider.get(request);
		int p40Val = i111Provider.get(request);
		int p41Val = i112Provider.get(request);
		int p42Val = i122Provider.get(request);
		int p43Val = i125Provider.get(request);
		int p44Val = i126Provider.get(request);
		int p45Val = i127Provider.get(request);
		int p46Val = i130Provider.get(request);
		int p47Val = i131Provider.get(request);
		int p48Val = i132Provider.get(request);
		int p49Val = i133Provider.get(request);
		int p50Val = i134Provider.get(request);
		int p51Val = i144Provider.get(request);
		int p52Val = i145Provider.get(request);
		int p53Val = i147Provider.get(request);
		int p54Val = i152Provider.get(request);
		int p55Val = i155Provider.get(request);
		int p56Val = i156Provider.get(request);
		int p57Val = i158Provider.get(request);
		int p58Val = i162Provider.get(request);
		int p59Val = i163Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p60Val = i166Provider.get(request);
		int p61Val = i168Provider.get(request);
		int p62Val = i169Provider.get(request);
		int p63Val = i170Provider.get(request);
		int p64Val = i172Provider.get(request);
		int p65Val = i178Provider.get(request);
		int p66Val = i179Provider.get(request);
		int p67Val = i182Provider.get(request);
		
        try {
            Thread.sleep(77);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p68Val = i184Provider.get(request);
		int p69Val = i186Provider.get(request);
		int p70Val = i197Provider.get(request);
		int p71Val = i199Provider.get(request);

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
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val;
    }
}
